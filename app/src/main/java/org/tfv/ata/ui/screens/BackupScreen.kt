package org.tfv.ata.ui.screens

import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.tfv.ata.BuildConfig
import org.tfv.ata.R
import org.tfv.ata.core.SettingsBackup
import org.tfv.ata.ui.AtaViewModel
import org.tfv.ata.ui.BackupCommit

/** Export and import of layout, appearance and VIN. Import only starts from the button on this screen. */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BackupScreen(vm: AtaViewModel, onBack: () -> Unit) {
  val context = LocalContext.current
  val scope = rememberCoroutineScope()
  var busy by remember { mutableStateOf(false) }
  var message by remember { mutableStateOf<String?>(null) }
  var pending by remember { mutableStateOf<ByteArray?>(null) }
  var summary by remember { mutableStateOf<SettingsBackup.Summary?>(null) }
  val exportDone = stringResource(R.string.backup_export_done)
  val exportFailed = stringResource(R.string.backup_export_failed)
  val corrupt = stringResource(R.string.backup_error_corrupt)
  val notAta = stringResource(R.string.backup_error_not_ata)
  val newer = stringResource(R.string.backup_error_newer)
  val imported = stringResource(R.string.backup_import_done)
  val importedPartial = stringResource(R.string.backup_import_done_partial)

  val exportLauncher = rememberLauncherForActivityResult(ActivityResultContracts.CreateDocument("application/octet-stream")) { uri ->
    if (uri == null) return@rememberLauncherForActivityResult
    scope.launch {
      busy = true
      val json = runCatching { vm.exportBackup(BuildConfig.VERSION_NAME) }.getOrNull()
      val ok = json != null && runCatching {
        withContext(Dispatchers.IO) {
          context.contentResolver.openOutputStream(uri)?.use { stream ->
            stream.write(json.toByteArray(Charsets.UTF_8))
          } ?: error("no stream")
        }
      }.isSuccess
      busy = false
      message = if (ok) exportDone else exportFailed
    }
  }
  val importLauncher = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
    if (uri == null) return@rememberLauncherForActivityResult
    scope.launch {
      busy = true
      val bytes = runCatching {
        withContext(Dispatchers.IO) {
          context.contentResolver.openInputStream(uri)?.use { readLimited(it) }
        }
      }.getOrNull()
      if (bytes == null) {
        busy = false
        message = corrupt
        return@launch
      }
      when (val outcome = vm.previewBackup(bytes, Build.VERSION.SDK_INT)) {
        is SettingsBackup.Outcome.Rejected -> {
          busy = false
          message = when (outcome.reason) {
            SettingsBackup.RejectReason.NOT_ATA -> notAta
            SettingsBackup.RejectReason.NEWER -> newer
            SettingsBackup.RejectReason.CORRUPT, SettingsBackup.RejectReason.TOO_LARGE -> corrupt
          }
        }
        is SettingsBackup.Outcome.Ready -> {
          busy = false
          pending = bytes
          summary = outcome.summary
        }
      }
    }
  }

  Scaffold(
    topBar = {
      TopAppBar(
        title = { Text(stringResource(R.string.backup_title)) },
        navigationIcon = {
          IconButton(onClick = onBack) { Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null) }
        },
      )
    },
  ) { padding ->
    Column(
      Modifier.fillMaxSize().padding(padding).verticalScroll(rememberScrollState()).padding(16.dp),
      verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
      Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
        modifier = Modifier.fillMaxWidth(),
      ) {
        Column(Modifier.padding(12.dp), verticalArrangement = Arrangement.spacedBy(6.dp)) {
          Text(
            stringResource(R.string.backup_switch_hint_title),
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onSecondaryContainer,
          )
          Text(
            stringResource(R.string.backup_switch_hint_text),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSecondaryContainer,
          )
        }
      }
      Row(horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth()) {
        Button(
          onClick = {
            if (!busy) {
              val day = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE)
              exportLauncher.launch("ata-einstellungen-$day.atabackup")
            }
          },
          enabled = !busy,
          modifier = Modifier.weight(1f),
        ) { Text(stringResource(R.string.backup_export)) }
        Button(
          onClick = {
            if (!busy) importLauncher.launch(arrayOf("application/octet-stream", "application/json", "*/*"))
          },
          enabled = !busy,
          modifier = Modifier.weight(1f),
        ) { Text(stringResource(R.string.backup_import)) }
      }
    }
  }

  val shown = summary
  if (shown != null) {
    val lines = backupPreviewLines(shown)
    AlertDialog(
      onDismissRequest = { summary = null; pending = null },
      title = { Text(stringResource(R.string.backup_preview_title)) },
      text = {
        Column(Modifier.verticalScroll(rememberScrollState())) {
          Text(lines.joinToString("\n"))
        }
      },
      confirmButton = {
        TextButton(
          onClick = {
            val bytes = pending
            summary = null
            pending = null
            if (bytes == null) return@TextButton
            busy = true
            vm.commitBackup(bytes, Build.VERSION.SDK_INT) { result ->
              busy = false
              message = when (result) {
                BackupCommit.REJECTED -> corrupt
                BackupCommit.IMPORTED -> imported
                BackupCommit.IMPORTED_PARTIAL -> importedPartial
              }
            }
          },
        ) { Text(stringResource(R.string.backup_import)) }
      },
      dismissButton = {
        TextButton(onClick = { summary = null; pending = null }) { Text(stringResource(R.string.cancel)) }
      },
    )
  }
  if (message != null) {
    AlertDialog(
      onDismissRequest = { message = null },
      confirmButton = { TextButton(onClick = { message = null }) { Text(stringResource(R.string.ok)) } },
      text = { Text(message ?: "") },
    )
  }
}

@Composable
private fun backupPreviewLines(summary: SettingsBackup.Summary): List<String> = buildList {
  add(stringResource(R.string.backup_preview_summary, summary.tileCount, summary.wearActionCount))
  if (summary.vehiclesNew > 0) add(stringResource(R.string.backup_preview_vehicles_new, summary.vehiclesNew))
  if (summary.vehiclesUpdated > 0) add(stringResource(R.string.backup_preview_vehicles_updated, summary.vehiclesUpdated))
  summary.drops.forEach { drop ->
    val res = when (drop.reason) {
      SettingsBackup.DropReason.INVALID -> R.string.backup_drop_invalid
      SettingsBackup.DropReason.DUPLICATE -> R.string.backup_drop_duplicate
      SettingsBackup.DropReason.FILE_LIMIT -> R.string.backup_drop_file_limit
      SettingsBackup.DropReason.TOTAL_LIMIT -> R.string.backup_drop_total_limit
      SettingsBackup.DropReason.DEMO -> R.string.backup_drop_demo
    }
    add(stringResource(res, drop.label))
  }
  summary.wmiWarnings.forEach { add(stringResource(R.string.backup_preview_wmi, it)) }
  summary.checkDigitWarnings.forEach { add(stringResource(R.string.backup_preview_check, it)) }
  if (summary.criticalOverlap) add(stringResource(R.string.backup_preview_critical))
}

/** Reads at most 64 KB + 1 byte, so an oversized file is rejected without keeping the rest. */
private fun readLimited(input: InputStream): ByteArray {
  val buffer = ByteArrayOutputStream()
  val chunk = ByteArray(4096)
  var total = 0
  val cap = SettingsBackup.MAX_BYTES + 1
  while (total < cap) {
    val n = input.read(chunk)
    if (n < 0) break
    val take = minOf(n, cap - total)
    buffer.write(chunk, 0, take)
    total += n
    if (total >= cap) break
  }
  return if (total > SettingsBackup.MAX_BYTES) ByteArray(cap) else buffer.toByteArray()
}
