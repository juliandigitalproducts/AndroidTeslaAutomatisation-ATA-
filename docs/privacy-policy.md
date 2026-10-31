# Privacy policy: ATA - Car Automatisation

**Deutsche Fassung: [weiter unten](#datenschutzerklärung-ata---car-automatisation).**

Applies to the Android app **ATA - Car Automatisation** (Google Play: `de.juliandigitalproducts.ata`, GitHub
release: `org.tfv.ata`) on phones, tablets and Wear OS watches.
Last updated: 31 October 2026.

## Short version

ATA collects **no** personal data. ATA has **no server, no account, no analytics, no advertising and no
tracking**. The merged release manifests of the phone app and the watch app do **not** include
`android.permission.INTERNET`, so the ATA process cannot open an internet connection. Everything ATA
stores stays on your device, and nothing is sent to the developer. Sync between your own phone and
watch uses the Wear OS Data Layer. **Google Play services is the technical channel** for that sync.
[Google's privacy policy](https://policies.google.com/privacy) applies to that channel.

## What ATA stores on your device

- **Settings and vehicles:** the name, VIN and body style you enter, your tiles, designs and automation settings.
- **Vehicle key:** a key pair for the car, created in the Android Keystore. The private key never leaves the
  device and cannot be exported.
- **Last vehicle status:** battery, range, temperatures, charging, lock state and so on, shown in the app,
  widgets and on the watch.
- **Last parking position (optional, "Find my car"):** the phone's position the last time it was connected
  to the car, so ATA can show the direction and distance to the car.
- **Short diagnostic logs** of the Bluetooth and NFC connection, used only for the bug report below.

This data is deleted when you uninstall ATA or clear its storage. ATA turns off Android's cloud backup
(`allowBackup=false`), so nothing goes into a backup either.

## Settings export

When you export settings, ATA writes a file only where you put it with the Android file dialog.
The file contains appearance, layout and the VIN **unencrypted**, and no vehicle keys or permissions.
ATA does not upload the file and does not send it anywhere. The merged release manifest does not
include `android.permission.INTERNET`, so the ATA process cannot open an internet connection to
transmit the file. On the phone, Google Play services adds `ACCESS_NETWORK_STATE` (whether a network
is connected). That permission is not permission to use the internet. Uninstalling ATA does not delete
a file you saved outside the app.

## Permissions and why ATA needs them

The names below are exactly the `uses-permission` entries in the merged release manifests
(`processReleaseMainManifest`) of the phone and watch apps, for both the GitHub package
(`org.tfv.ata`) and the Play package (`de.juliandigitalproducts.ata`). Libraries add some entries
that ATA's own source manifests do not declare. Neither merged manifest contains
`android.permission.INTERNET`.

### Phone

| Permission | Purpose |
|---|---|
| `android.permission.POST_NOTIFICATIONS` | Results of commands, confirmations for critical actions, and the status notification of running services. |
| `android.permission.BLUETOOTH_SCAN` | Finding the car over Bluetooth Low Energy. Android only reports those scan results to apps with location access. |
| `android.permission.BLUETOOTH_CONNECT` | Connecting to the car over Bluetooth Low Energy (commands and status). |
| `android.permission.ACCESS_COARSE_LOCATION` | Required by Android together with Bluetooth scan. Also used, only while the app is in use, for *unlock when approaching* (the car's signal strength), *find my car* (the phone's position the last time it was at the car, stored on the device) and the optional direction animation. ATA does not request location in the background and never sends it anywhere. |
| `android.permission.ACCESS_FINE_LOCATION` | Same location purpose as the coarse permission, when a precise fix is needed for *find my car* and the direction animation. |
| `android.permission.FOREGROUND_SERVICE` | Allows the short command service and *unlock when approaching* to run as a foreground service. |
| `android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE` | Type of that foreground service: a connected device (the car). A notification is visible while it runs. |
| `android.permission.RECEIVE_BOOT_COMPLETED` | Restarts *unlock when approaching* after a reboot, if you turned it on. |
| `android.permission.NFC` | Running actions from NFC tags you wrote with ATA, and using the phone as a key card for the car (card emulation). |
| `android.permission.SYSTEM_ALERT_WINDOW` | Optional. Lets a watch tap or an automation open the vehicle maker's app or navigation on the phone while ATA is in the background. |
| `android.permission.USE_BIOMETRIC` | Optional confirmation before critical actions such as unlocking. Added by the AndroidX Biometric library. Android checks the fingerprint, face or screen lock; ATA only gets "confirmed" or "not confirmed". |
| `android.permission.USE_FINGERPRINT` | Legacy biometric permission. The AndroidX Biometric library still merges it. Same purpose as `USE_BIOMETRIC`. |
| `android.permission.WAKE_LOCK` | Merged from libraries (WorkManager and Google Play services) so short background work can keep the CPU awake. ATA does not use it to send data. |
| `android.permission.ACCESS_NETWORK_STATE` | Merged from Google Play services. It only reports whether a network is connected. It is not the internet permission, and ATA does not use it to transmit data. |
| `<applicationId>.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` | Signature permission defined by the app for AndroidX. Only ATA itself can deliver certain internal broadcasts. `applicationId` is `org.tfv.ata` (GitHub) or `de.juliandigitalproducts.ata` (Play). |

### Watch

| Permission | Purpose |
|---|---|
| `android.permission.NFC` | Using the watch as a key card for the car (card emulation). |
| `android.permission.BLUETOOTH_CONNECT` | Connecting to the car over Bluetooth Low Energy when the watch has its own key. |
| `android.permission.BLUETOOTH_SCAN` | Finding the car over Bluetooth Low Energy. |
| `android.permission.ACCESS_COARSE_LOCATION` | Android reports the car's Bluetooth advertisement only to apps with location access. |
| `android.permission.ACCESS_FINE_LOCATION` | Same location purpose as the coarse permission on the watch. |
| `<applicationId>.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` | Same signature permission as on the phone, with the watch's application id. |

The watch manifest does not include `INTERNET`, `ACCESS_NETWORK_STATE`, `WAKE_LOCK`, notifications,
display-over-other-apps, biometrics or run-at-startup.

## Data shared with third parties

ATA has no third-party SDKs for analytics, ads or crash reporting, and it does not send data to the
developer.

- **Wear OS Data Layer / Google Play services:** actions, settings and the last status are synced
  between your own phone and watch through Google Play services. Google is the technical channel.
  [Google's privacy policy](https://policies.google.com/privacy) applies to that channel.
  `com.google.android.gms:play-services-wearable` is proprietary (Android SDK / Google Play services
  terms), not open source.
- **Opening other apps:** if you use navigation, ATA hands the destination to the app you choose
  (e.g. Google Maps or Waze). If you open the vehicle maker's app, ATA only starts it. Nothing from
  Google Maps, Waze or the Tesla app is bundled.
- **Bug report (only when you tap it):** ATA shows the report and copies it to the clipboard, and can open
  a prefilled issue on GitHub in your browser. It contains the app and Android version, phone model,
  settings, a masked VIN and the connection logs; no location and no keys. Nothing is sent unless you
  submit it yourself. GitHub's privacy policy applies to what you post there.
- **Links:** links to GitHub open in your browser.
  Their privacy policies apply there.

## Children

ATA is not directed at children.

## Changes

Changes to this policy are published in this file in the app's repository.

## Contact

juliandigitalproducts — [juliandigitalproducts+kontakt@gmail.com](mailto:juliandigitalproducts+kontakt@gmail.com)

ATA is an independent app and not affiliated with Tesla, Inc. "Tesla" is a trademark of Tesla, Inc.

---

# Datenschutzerklärung: ATA - Car Automatisation

Gilt für die Android-App **ATA - Car Automatisation** (Google Play: `de.juliandigitalproducts.ata`,
GitHub-Release: `org.tfv.ata`) auf Handys, Tablets und Wear-OS-Uhren.
Stand: 31. Oktober 2026.

## Kurz gesagt

ATA erhebt **keine** personenbezogenen Daten. ATA hat **keinen Server, kein Konto, keine Analyse, keine
Werbung und kein Tracking**. Die zusammengeführten Release-Manifeste der Handy-App und der Uhr-App
enthalten **kein** `android.permission.INTERNET`, der ATA-Prozess kann also keine Internetverbindung
öffnen. Alles, was ATA speichert, bleibt auf deinem Gerät. Nichts wird an den Entwickler gesendet.
Der Abgleich zwischen deinem eigenen Handy und deiner Uhr läuft über den Wear-OS-Data-Layer.
**Google Play-Dienste sind der technische Kanal** dafür. Dafür gilt die
[Datenschutzerklärung von Google](https://policies.google.com/privacy).

## Was ATA auf deinem Gerät speichert

- **Einstellungen und Fahrzeuge:** Name, FIN (VIN) und Karosserie, die du eingibst, deine Kacheln, Designs
  und Automatisierungs-Einstellungen.
- **Fahrzeugschlüssel:** ein Schlüsselpaar für das Auto, erzeugt im Android Keystore. Der private Schlüssel
  verlässt das Gerät nie und lässt sich nicht exportieren.
- **Letzter Fahrzeugstatus:** Akku, Reichweite, Temperaturen, Laden, Verriegelung usw., angezeigt in der
  App, in Widgets und auf der Uhr.
- **Letzte Parkposition (optional, „Auto finden“):** die Position des Handys, als es zuletzt mit dem Auto
  verbunden war, damit ATA Richtung und Entfernung zum Auto zeigen kann.
- **Kurze Diagnose-Logs** der Bluetooth- und NFC-Verbindung, nur für den Fehlerbericht unten.

Diese Daten werden gelöscht, wenn du ATA deinstallierst oder den Speicher der App löschst. ATA schaltet
die Android-Cloud-Sicherung ab (`allowBackup=false`), es landet also auch nichts in einem Backup.

## Export der Einstellungen

Wenn du Einstellungen exportierst, schreibt ATA die Datei nur dorthin, wo du sie im Android-Dateidialog
ablegst. Die Datei enthält Darstellung, Anordnung und die FIN **unverschlüsselt**, aber keine
Fahrzeugschlüssel und keine Freigaben. ATA lädt die Datei nicht hoch und überträgt sie nirgendwohin.
Das zusammengeführte Release-Manifest enthält kein `android.permission.INTERNET`, der ATA-Prozess
kann die Datei also nicht über eine Internetverbindung versenden. Auf dem Handy fügen die Google-Play-Dienste
`ACCESS_NETWORK_STATE` hinzu (ob ein Netz verbunden ist). Das ist keine Berechtigung, das Internet zu
nutzen. Wenn du ATA deinstallierst, bleibt eine außerhalb der App gespeicherte Datei liegen.

## Berechtigungen und wofür ATA sie braucht

Die Namen unten sind genau die `uses-permission`-Einträge in den zusammengeführten Release-Manifesten
(`processReleaseMainManifest`) von Handy- und Uhr-App, sowohl für das GitHub-Paket (`org.tfv.ata`)
als auch für das Play-Paket (`de.juliandigitalproducts.ata`). Bibliotheken fügen Einträge hinzu, die
ATA in seinen eigenen Manifesten nicht deklariert. Keines der zusammengeführten Manifeste enthält
`android.permission.INTERNET`.

### Handy

| Berechtigung | Zweck |
|---|---|
| `android.permission.POST_NOTIFICATIONS` | Ergebnisse von Befehlen, Bestätigungen für kritische Aktionen und die Statusbenachrichtigung laufender Dienste. |
| `android.permission.BLUETOOTH_SCAN` | Das Auto per Bluetooth Low Energy suchen. Android meldet diese Suchergebnisse nur an Apps mit Standortzugriff. |
| `android.permission.BLUETOOTH_CONNECT` | Verbindung zum Auto per Bluetooth Low Energy (Befehle und Status). |
| `android.permission.ACCESS_COARSE_LOCATION` | Von Android zusammen mit der Bluetooth-Suche verlangt. Außerdem, nur während der Nutzung, für *Entriegeln beim Herangehen* (Signalstärke des Autos), *Auto finden* (Position des Handys beim letzten Kontakt zum Auto, auf dem Gerät) und die optionale Richtungs-Animation. ATA fragt den Standort nicht im Hintergrund ab und sendet ihn nirgendwohin. |
| `android.permission.ACCESS_FINE_LOCATION` | Derselbe Standortzweck wie die ungefähre Berechtigung, wenn *Auto finden* und die Richtungs-Animation eine genaue Position brauchen. |
| `android.permission.FOREGROUND_SERVICE` | Erlaubt den kurzen Befehlsdienst und *Entriegeln beim Herangehen* als Vordergrunddienst. |
| `android.permission.FOREGROUND_SERVICE_CONNECTED_DEVICE` | Art dieses Vordergrunddienstes: verbundenes Gerät (das Auto). Solange er läuft, ist eine Benachrichtigung sichtbar. |
| `android.permission.RECEIVE_BOOT_COMPLETED` | Startet *Entriegeln beim Herangehen* nach einem Neustart wieder, wenn du es eingeschaltet hast. |
| `android.permission.NFC` | Aktionen von NFC-Tags ausführen, die du mit ATA beschrieben hast, und das Handy als Schlüsselkarte für das Auto nutzen (Kartenemulation). |
| `android.permission.SYSTEM_ALERT_WINDOW` | Optional. Damit ein Tipp auf der Uhr oder eine Automatisierung die App des Fahrzeugherstellers oder die Navigation auf dem Handy öffnen kann, während ATA im Hintergrund ist. |
| `android.permission.USE_BIOMETRIC` | Optionale Bestätigung vor kritischen Aktionen wie dem Entriegeln. Kommt aus der AndroidX-Biometric-Bibliothek. Android prüft Fingerabdruck, Gesicht oder Displaysperre; ATA erfährt nur „bestätigt“ oder „nicht bestätigt“. |
| `android.permission.USE_FINGERPRINT` | Ältere Biometrie-Berechtigung. Die AndroidX-Biometric-Bibliothek führt sie weiterhin mit. Derselbe Zweck wie `USE_BIOMETRIC`. |
| `android.permission.WAKE_LOCK` | Von Bibliotheken zusammengeführt (WorkManager und Google Play-Dienste), damit kurze Hintergrundarbeit die CPU wach halten kann. ATA sendet damit keine Daten. |
| `android.permission.ACCESS_NETWORK_STATE` | Von den Google-Play-Diensten zusammengeführt. Meldet nur, ob ein Netz verbunden ist. Das ist nicht die Internet-Berechtigung, und ATA überträgt damit keine Daten. |
| `<applicationId>.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` | Signatur-Berechtigung, die die App für AndroidX definiert. Nur ATA selbst darf bestimmte interne Broadcasts zustellen. `applicationId` ist `org.tfv.ata` (GitHub) oder `de.juliandigitalproducts.ata` (Play). |

### Uhr

| Berechtigung | Zweck |
|---|---|
| `android.permission.NFC` | Die Uhr als Schlüsselkarte für das Auto nutzen (Kartenemulation). |
| `android.permission.BLUETOOTH_CONNECT` | Verbindung zum Auto per Bluetooth Low Energy, wenn die Uhr einen eigenen Schlüssel hat. |
| `android.permission.BLUETOOTH_SCAN` | Das Auto per Bluetooth Low Energy suchen. |
| `android.permission.ACCESS_COARSE_LOCATION` | Android meldet die Bluetooth-Meldung des Autos nur an Apps mit Standortzugriff. |
| `android.permission.ACCESS_FINE_LOCATION` | Derselbe Standortzweck wie die ungefähre Berechtigung auf der Uhr. |
| `<applicationId>.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` | Dieselbe Signatur-Berechtigung wie auf dem Handy, mit der Anwendungs-ID der Uhr. |

Das Manifest der Uhr enthält kein `INTERNET`, kein `ACCESS_NETWORK_STATE`, kein `WAKE_LOCK`, keine
Benachrichtigungen, kein Einblenden über anderen Apps, keine Biometrie und kein Starten beim Hochfahren.

## Weitergabe an Dritte

ATA enthält keine Drittanbieter-SDKs für Analyse, Werbung oder Absturzberichte und sendet keine Daten
an den Entwickler.

- **Wear OS Data Layer / Google Play-Dienste:** Aktionen, Einstellungen und der letzte Status werden
  zwischen deinem eigenen Handy und deiner Uhr über die Google-Play-Dienste abgeglichen. Google ist
  der technische Kanal. Dafür gilt die [Datenschutzerklärung von Google](https://policies.google.com/privacy).
  `com.google.android.gms:play-services-wearable` ist proprietär (Android-SDK- / Google-Play-Dienste-Bedingungen),
  nicht Open Source.
- **Andere Apps öffnen:** Wenn du navigierst, übergibt ATA das Ziel an die App deiner Wahl (z. B. Google
  Maps oder Waze). Die App des Fahrzeugherstellers wird nur gestartet. Von Google Maps, Waze und der
  Tesla-App ist nichts in ATA enthalten.
- **Fehlerbericht (nur wenn du ihn antippst):** ATA zeigt den Bericht, kopiert ihn in die Zwischenablage
  und kann im Browser ein vorausgefülltes Issue auf GitHub öffnen. Er enthält App- und Android-Version,
  Handymodell, Einstellungen, eine maskierte FIN und die Verbindungs-Logs, aber keinen Standort und keine
  Schlüssel. Gesendet wird nur, was du selbst abschickst. Für Beiträge auf GitHub gilt dessen
  Datenschutzerklärung.
- **Links:** Links zu GitHub öffnen sich im Browser. Dort gelten deren Datenschutzerklärungen.

## Kinder

ATA richtet sich nicht an Kinder.

## Änderungen

Änderungen dieser Erklärung werden in dieser Datei im Repository der App veröffentlicht.

## Kontakt

juliandigitalproducts — [juliandigitalproducts+kontakt@gmail.com](mailto:juliandigitalproducts+kontakt@gmail.com)

ATA ist eine unabhängige App und steht in keiner Verbindung zu Tesla, Inc. „Tesla“ ist eine Marke von Tesla, Inc.
