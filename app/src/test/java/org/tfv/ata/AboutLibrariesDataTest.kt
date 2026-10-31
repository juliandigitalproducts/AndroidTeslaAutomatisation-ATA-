package org.tfv.ata

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.File

/** The generated AboutLibraries metadata must list play-services-wearable as proprietary. */
class AboutLibrariesDataTest {
  @Test
  fun playServicesWearableIsProprietary() {
    val files = File("build").walkTopDown()
      .filter { it.isFile && it.name == "aboutlibraries.json" }
      .toList()
    assertTrue("aboutlibraries.json was not generated", files.isNotEmpty())
    val json = Json { ignoreUnknownKeys = true }
    val matched = files.any { file ->
      val root = json.parseToJsonElement(file.readText()).jsonObject
      val libraries = root.getValue("libraries").jsonArray
      val licenses = root.getValue("licenses").jsonObject
      val wearable = libraries.map { it.jsonObject }.find {
        it.getValue("uniqueId").jsonPrimitive.content == "com.google.android.gms:play-services-wearable"
      } ?: return@any false
      val names = wearable.getValue("licenses").jsonArray.map { hash ->
        licenses.getValue(hash.jsonPrimitive.content).jsonObject.getValue("name").jsonPrimitive.content
      }
      names.any { name ->
        name.contains("Proprietary", ignoreCase = true) &&
          name.contains("Android SDK", ignoreCase = true) &&
          name.contains("Play services", ignoreCase = true)
      }
    }
    assertTrue("play-services-wearable is missing or not marked proprietary", matched)
  }
}
