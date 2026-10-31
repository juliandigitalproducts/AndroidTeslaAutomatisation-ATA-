package org.tfv.ata.wear

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.ListHeader
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.mikepenz.aboutlibraries.Libs
import com.mikepenz.aboutlibraries.entity.Library
import com.mikepenz.aboutlibraries.util.withJson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * About page for round and square watches: version, Tesla disclaimer, license notice,
 * the generated license list, and a privacy notice.
 */
@Composable
fun WearAboutScreen(onBack: () -> Unit) {
  val context = LocalContext.current
  var libs by remember { mutableStateOf<Libs?>(null) }
  var selected by remember { mutableStateOf<Library?>(null) }
  LaunchedEffect(Unit) {
    libs = withContext(Dispatchers.IO) {
      Libs.Builder().withJson(context, R.raw.aboutlibraries).build()
    }
  }
  val open = selected
  if (open != null) {
    LicenseText(open, onBack = { selected = null })
  } else {
    val libraries = libs?.libraries.orEmpty().sortedBy { it.name.lowercase() }
    ScalingLazyColumn(state = rememberScalingLazyListState(), modifier = Modifier.fillMaxWidth()) {
      item {
        Chip(
          modifier = Modifier.fillMaxWidth(),
          label = { Text(stringResource(R.string.back)) },
          colors = ChipDefaults.secondaryChipColors(),
          onClick = onBack,
        )
      }
      item { ListHeader { Text(stringResource(R.string.wear_about)) } }
      item {
        Text(
          stringResource(R.string.wear_about_version, BuildConfig.VERSION_NAME),
          style = MaterialTheme.typography.title3,
          textAlign = TextAlign.Center,
          modifier = Modifier.fillMaxWidth(),
        )
      }
      item { Body(stringResource(R.string.wear_about_disclaimer)) }
      item { Body(stringResource(R.string.wear_about_license)) }
      item { Body(stringResource(R.string.wear_about_privacy)) }
      item { ListHeader { Text(stringResource(R.string.wear_about_licenses)) } }
      items(libraries, key = { it.uniqueId }) { library ->
        val license = library.licenses.joinToString { it.name }
        Chip(
          modifier = Modifier.fillMaxWidth(),
          label = { Text(library.name) },
          secondaryLabel = { Text(listOfNotNull(library.artifactVersion, license.takeIf { it.isNotBlank() }).joinToString(" · ")) },
          colors = ChipDefaults.secondaryChipColors(),
          onClick = { selected = library },
        )
      }
    }
  }
}

@Composable
private fun LicenseText(library: Library, onBack: () -> Unit) {
  val missing = stringResource(R.string.wear_about_license_missing)
  val body = library.licenses.joinToString("\n\n") { license ->
    val text = license.licenseContent?.let(::plainLicense).orEmpty().ifBlank { missing }
    license.name + "\n" + text
  }
  ScalingLazyColumn(state = rememberScalingLazyListState(), modifier = Modifier.fillMaxWidth()) {
    item {
      Chip(
        modifier = Modifier.fillMaxWidth(),
        label = { Text(stringResource(R.string.back)) },
        colors = ChipDefaults.secondaryChipColors(),
        onClick = onBack,
      )
    }
    item { ListHeader { Text(library.name) } }
    item { Body(body) }
  }
}

@Composable
private fun Body(text: String) {
  Text(
    text,
    style = MaterialTheme.typography.caption2,
    modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 4.dp),
  )
}

private fun plainLicense(html: String): String =
  html.replace(Regex("<br\\s*/?>", RegexOption.IGNORE_CASE), "\n")
    .replace(Regex("<[^>]+>"), "")
    .replace("&amp;", "&")
    .replace("&lt;", "<")
    .replace("&gt;", ">")
    .trim()
