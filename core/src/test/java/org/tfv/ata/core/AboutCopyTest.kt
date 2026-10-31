package org.tfv.ata.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

/** Checks the About copy that does not need a device: license wording and the public links. */
class AboutCopyTest {
  @Test
  fun germanLicenseLineIsSourceAvailableNotOpenSource() {
    val de = read("app/src/main/res/values-de/strings.xml")
    val license = stringValue(de, "about_license")
    assertEquals(
      "Quellcode einsehbar (Source-Available, nicht kommerziell). Kommerzielle Nutzung nur mit vorheriger schriftlicher Genehmigung des Autors.",
      license,
    )
    assertFalse(license.contains("Quelloffen"))
  }

  @Test
  fun englishLicenseLineStaysSourceAvailable() {
    val en = read("app/src/main/res/values/strings.xml")
    assertEquals(
      "Source-available, non-commercial license. Commercial use requires prior written permission from the author.",
      stringValue(en, "about_license"),
    )
  }

  @Test
  fun aboutLinksMatchThePublishedUrls() {
    val en = read("app/src/main/res/values/strings.xml")
    val de = read("app/src/main/res/values-de/strings.xml")
    assertEquals(
      "https://github.com/juliandigitalproducts/AndroidTeslaAutomatisation-ATA-/blob/main/docs/privacy-policy.md",
      stringValue(en, "about_privacy_url"),
    )
    assertEquals(
      "https://github.com/juliandigitalproducts/AndroidTeslaAutomatisation-ATA-",
      stringValue(en, "about_source_url"),
    )
    assertEquals(
      "https://github.com/juliandigitalproducts/AndroidTeslaAutomatisation-ATA-/blob/main/NOTICE",
      stringValue(en, "about_notice_url"),
    )
    assertEquals("Open source licenses", stringValue(en, "about_licenses"))
    assertEquals("Open-Source-Lizenzen", stringValue(de, "about_licenses"))
    assertEquals("Privacy policy", stringValue(en, "about_privacy"))
    assertEquals("Datenschutzerklärung", stringValue(de, "about_privacy"))
    assertEquals("Source code", stringValue(en, "about_source"))
    assertEquals("Quellcode", stringValue(de, "about_source"))
    assertEquals("Notices", stringValue(en, "about_notices"))
    assertEquals("Hinweise (NOTICE)", stringValue(de, "about_notices"))
    assertTrue(read("docs/play/PLAY_CONSOLE.md").contains(stringValue(en, "about_privacy_url")))
  }

  private fun read(relative: String): String {
    val file = listOf(File(relative), File("../$relative"), File("../../$relative")).firstOrNull { it.isFile }
      ?: error("Missing $relative from ${File(".").absolutePath}")
    return file.readText()
  }

  private fun stringValue(xml: String, name: String): String {
    val pattern = Regex("""<string name="$name"[^>]*>(.*?)</string>""", RegexOption.DOT_MATCHES_ALL)
    val raw = pattern.find(xml)?.groupValues?.get(1) ?: error("string $name not found")
    return raw
      .replace("\\'", "'")
      .replace("\\\"", "\"")
      .replace("&amp;", "&")
      .replace("&lt;", "<")
      .replace("&gt;", ">")
      .trim()
  }
}
