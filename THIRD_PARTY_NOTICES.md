# Third-party notices

ATA ships the libraries below. Versions and licenses are taken from the release builds of the phone module (`app`) and the watch module (`wear`), including transitive dependencies. The phone shows the same data offline under Settings → About → Open source licenses (AboutLibraries). The watch shows the same list offline under About → Licenses.

Google Play services, including `com.google.android.gms:play-services-wearable`, is proprietary. It is not open source. It is covered by the Android Software Development Kit License and the Google Play services terms.

`teslamotors/vehicle-command` is not a Gradle dependency and is not bundled as a library. The BLE features follow that publicly documented protocol. It is Apache License 2.0, and that attribution also stays in [NOTICE](NOTICE): https://github.com/teslamotors/vehicle-command

Google Maps, Waze and the Tesla app are not bundled. Nothing from those apps is included in ATA. When you choose navigation or “open the Tesla app”, ATA only starts the already installed app with an Android intent.

All images and graphics — the logo, the launcher and start graphics, and the store graphics — are the author's own works.

| Component | Version | License | Link | Modules |
|---|---|---|---|---|
| Activity (`androidx.activity:activity`) | 1.9.3 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/activity#1.9.3 | phone, wear |
| Activity Compose (`androidx.activity:activity-compose`) | 1.9.3 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/activity#1.9.3 | phone, wear |
| Activity Kotlin Extensions (`androidx.activity:activity-ktx`) | 1.9.3 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/activity#1.9.3 | phone, wear |
| Annotation (`androidx.annotation:annotation`) | phone 1.10.0; wear 1.9.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/annotation#1.10.0 | phone, wear |
| Experimental annotation (`androidx.annotation:annotation-experimental`) | 1.4.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/annotation#1.4.1 | phone, wear |
| Android AppCompat Library v7 (`androidx.appcompat:appcompat`) | phone 1.2.0; wear 1.1.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx | phone, wear |
| Android Resources Library (`androidx.appcompat:appcompat-resources`) | phone 1.2.0; wear 1.1.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx | phone, wear |
| Android Arch-Common (`androidx.arch.core:core-common`) | 2.2.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/arch-core#2.2.0 | phone, wear |
| Android Arch-Runtime (`androidx.arch.core:core-runtime`) | 2.2.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/arch-core#2.2.0 | phone, wear |
| Support Async Layout Inflater (`androidx.asynclayoutinflater:asynclayoutinflater`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| AndroidX Autofill (`androidx.autofill:autofill`) | 1.0.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx | phone, wear |
| Biometric (`androidx.biometric:biometric`) | 1.1.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/biometric#1.1.0 | phone |
| collections (`androidx.collection:collection`) | 1.5.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/collection#1.5.0 | phone, wear |
| Collections Kotlin Extensions (`androidx.collection:collection-ktx`) | 1.5.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/collection#1.5.0 | phone, wear |
| Compose Animation (`androidx.compose.animation:animation`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-animation#1.12.1 | phone, wear |
| Compose Animation Core (`androidx.compose.animation:animation-core`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-animation#1.12.1 | phone, wear |
| Compose Foundation (`androidx.compose.foundation:foundation`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-foundation#1.12.1 | phone, wear |
| Compose Layouts (`androidx.compose.foundation:foundation-layout`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-foundation#1.12.1 | phone, wear |
| Compose Material3 Components (`androidx.compose.material3:material3`) | 1.4.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-material3#1.4.0 | phone |
| Compose Material Icons Core (`androidx.compose.material:material-icons-core`) | 1.7.8 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-material#1.7.8 | phone, wear |
| Compose Material Icons Extended (`androidx.compose.material:material-icons-extended`) | 1.7.8 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-material#1.7.8 | phone, wear |
| Compose Material Ripple (`androidx.compose.material:material-ripple`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-material#1.12.1 | phone, wear |
| Compose Runtime (`androidx.compose.runtime:runtime`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-runtime#1.12.1 | phone, wear |
| Compose Runtime Annotation (`androidx.compose.runtime:runtime-annotation`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-runtime#1.12.1 | phone, wear |
| Compose Runtime Retain (`androidx.compose.runtime:runtime-retain`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-runtime#1.12.1 | phone, wear |
| Compose Saveable (`androidx.compose.runtime:runtime-saveable`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-runtime#1.12.1 | phone, wear |
| Compose UI (`androidx.compose.ui:ui`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-ui#1.12.1 | phone, wear |
| Compose Geometry (`androidx.compose.ui:ui-geometry`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-ui#1.12.1 | phone, wear |
| Compose Graphics (`androidx.compose.ui:ui-graphics`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-ui#1.12.1 | phone, wear |
| Compose UI Text (`androidx.compose.ui:ui-text`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-ui#1.12.1 | phone, wear |
| Compose UI Preview Tooling (`androidx.compose.ui:ui-tooling-preview`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-ui#1.12.1 | phone, wear |
| Compose Unit (`androidx.compose.ui:ui-unit`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-ui#1.12.1 | phone, wear |
| Compose Util (`androidx.compose.ui:ui-util`) | 1.12.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/compose-ui#1.12.1 | phone, wear |
| Jetpack Compose Libraries BOM (`androidx.compose:compose-bom`) | 2026.09.00 | Apache License 2.0 | https://developer.android.com/jetpack | phone, wear |
| AndroidX Futures (`androidx.concurrent:concurrent-futures`) | phone 1.1.0; wear 1.2.0 | Apache License 2.0 | https://developer.android.com/topic/libraries/architecture/index.html | phone, wear |
| AndroidX Futures Kotlin Extensions (`androidx.concurrent:concurrent-futures-ktx`) | phone 1.1.0; wear 1.2.0 | Apache License 2.0 | https://developer.android.com/topic/libraries/architecture/index.html | phone, wear |
| Support Coordinator Layout (`androidx.coordinatorlayout:coordinatorlayout`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| Core (`androidx.core:core`) | phone 1.19.1; wear 1.16.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/core#1.19.1 | phone, wear |
| Core Kotlin Extensions (`androidx.core:core-ktx`) | phone 1.19.1; wear 1.16.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/core#1.19.1 | phone, wear |
| RemoteViews (`androidx.core:core-remoteviews`) | 1.1.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/core#1.1.0 | phone |
| SplashScreen (`androidx.core:core-splashscreen`) | 1.0.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/core#1.0.1 | phone |
| androidx.core:core-viewtree (`androidx.core:core-viewtree`) | 1.0.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/core#1.0.0 | phone, wear |
| Support Cursor Adapter (`androidx.cursoradapter:cursoradapter`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | phone, wear |
| Support Custom View (`androidx.customview:customview`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | phone, wear |
| androidx.customview:poolingcontainer (`androidx.customview:customview-poolingcontainer`) | 1.0.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/customview#1.0.0 | phone, wear |
| DataStore (`androidx.datastore:datastore`) | 1.1.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/datastore#1.1.1 | phone |
| DataStore Core (`androidx.datastore:datastore-core`) | 1.1.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/datastore#1.1.1 | phone |
| DataStore Core Okio (`androidx.datastore:datastore-core-okio`) | 1.1.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/datastore#1.1.1 | phone |
| Preferences DataStore (`androidx.datastore:datastore-preferences`) | 1.1.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/datastore#1.1.1 | phone |
| Preferences DataStore Core (`androidx.datastore:datastore-preferences-core`) | 1.1.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/datastore#1.1.1 | phone |
| Support Document File (`androidx.documentfile:documentfile`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| Support Drawer Layout (`androidx.drawerlayout:drawerlayout`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | phone, wear |
| Emoji2 (`androidx.emoji2:emoji2`) | 1.4.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/emoji2#1.4.0 | phone, wear |
| fragment (`androidx.fragment:fragment`) | phone 1.8.5; wear 1.1.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/fragment#1.8.5 | phone, wear |
| Fragment Kotlin Extensions (`androidx.fragment:fragment-ktx`) | 1.8.5 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/fragment#1.8.5 | phone |
| Glance (`androidx.glance:glance`) | 1.1.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/glance#1.1.1 | phone |
| Glance For App Widgets (`androidx.glance:glance-appwidget`) | 1.1.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/glance#1.1.1 | phone |
| Glance AppWidget External Protobuf (`androidx.glance:glance-appwidget-external-protobuf`) | 1.1.1 | BSD 3-Clause "New" or "Revised" License | https://developer.android.com/jetpack/androidx/releases/glance#1.1.1 | phone |
| Glance AppWidget Protos (`androidx.glance:glance-appwidget-proto`) | 1.1.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/glance#1.1.1 | phone |
| Android Graphics Path (`androidx.graphics:graphics-path`) | 1.0.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/graphics#1.0.1 | phone, wear |
| Support Interpolators (`androidx.interpolator:interpolator`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | phone, wear |
| Support core UI (`androidx.legacy:legacy-support-core-ui`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| Support core utils (`androidx.legacy:legacy-support-core-utils`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| Lifecycle-Common (`androidx.lifecycle:lifecycle-common`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle-Common for Java 8 (`androidx.lifecycle:lifecycle-common-java8`) | 2.10.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone |
| Lifecycle LiveData (`androidx.lifecycle:lifecycle-livedata`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle LiveData Core (`androidx.lifecycle:lifecycle-livedata-core`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| LiveData Core Kotlin Extensions (`androidx.lifecycle:lifecycle-livedata-core-ktx`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle Process (`androidx.lifecycle:lifecycle-process`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle Runtime (`androidx.lifecycle:lifecycle-runtime`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle Runtime Compose (`androidx.lifecycle:lifecycle-runtime-compose`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle Kotlin Extensions (`androidx.lifecycle:lifecycle-runtime-ktx`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle Service (`androidx.lifecycle:lifecycle-service`) | 2.10.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone |
| Lifecycle ViewModel (`androidx.lifecycle:lifecycle-viewmodel`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle ViewModel Compose (`androidx.lifecycle:lifecycle-viewmodel-compose`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle ViewModel Kotlin Extensions (`androidx.lifecycle:lifecycle-viewmodel-ktx`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Lifecycle ViewModel with SavedState (`androidx.lifecycle:lifecycle-viewmodel-savedstate`) | phone 2.10.0; wear 2.9.4 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/lifecycle#2.10.0 | phone, wear |
| Support loader (`androidx.loader:loader`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | phone, wear |
| Support Local Broadcast Manager (`androidx.localbroadcastmanager:localbroadcastmanager`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| Navigation Common (`androidx.navigation:navigation-common`) | phone 2.8.5; wear 2.6.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/navigation#2.8.5 | phone, wear |
| Navigation Common Kotlin Extensions (`androidx.navigation:navigation-common-ktx`) | phone 2.8.5; wear 2.6.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/navigation#2.8.5 | phone, wear |
| Compose Navigation (`androidx.navigation:navigation-compose`) | phone 2.8.5; wear 2.6.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/navigation#2.8.5 | phone, wear |
| Navigation Runtime (`androidx.navigation:navigation-runtime`) | phone 2.8.5; wear 2.6.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/navigation#2.8.5 | phone, wear |
| Navigation Runtime Kotlin Extensions (`androidx.navigation:navigation-runtime-ktx`) | phone 2.8.5; wear 2.6.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/navigation#2.8.5 | phone, wear |
| AndroidX Preference (`androidx.preference:preference`) | 1.1.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx | wear |
| Support Print (`androidx.print:print`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| Profile Installer (`androidx.profileinstaller:profileinstaller`) | 1.4.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/profileinstaller#1.4.0 | phone, wear |
| Support RecyclerView v7 (`androidx.recyclerview:recyclerview`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| Room-Common (`androidx.room:room-common`) | 2.6.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/room#2.6.1 | phone |
| Room Kotlin Extensions (`androidx.room:room-ktx`) | 2.6.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/room#2.6.1 | phone |
| Room-Runtime (`androidx.room:room-runtime`) | 2.6.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/room#2.6.1 | phone |
| Saved State (`androidx.savedstate:savedstate`) | phone 1.4.0; wear 1.3.2 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/savedstate#1.4.0 | phone, wear |
| Saved State Compose (`androidx.savedstate:savedstate-compose`) | phone 1.4.0; wear 1.3.2 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/savedstate#1.4.0 | phone, wear |
| SavedState Kotlin Extensions (`androidx.savedstate:savedstate-ktx`) | phone 1.4.0; wear 1.3.2 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/savedstate#1.4.0 | phone, wear |
| Support Sliding Pane Layout (`androidx.slidingpanelayout:slidingpanelayout`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| SQLite (`androidx.sqlite:sqlite`) | 2.4.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/sqlite#2.4.0 | phone |
| SQLite Framework Integration (`androidx.sqlite:sqlite-framework`) | 2.4.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/sqlite#2.4.0 | phone |
| Android App Startup Runtime (`androidx.startup:startup-runtime`) | 1.1.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/startup#1.1.1 | phone, wear |
| Support Custom View (`androidx.swiperefreshlayout:swiperefreshlayout`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | wear |
| Android Tracing (`androidx.tracing:tracing`) | 1.2.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/tracing#1.2.0 | phone, wear |
| Android Tracing Runtime Kotlin Extensions (`androidx.tracing:tracing-ktx`) | 1.2.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/tracing#1.2.0 | phone |
| Support VectorDrawable (`androidx.vectordrawable:vectordrawable`) | 1.1.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx | phone, wear |
| Support AnimatedVectorDrawable (`androidx.vectordrawable:vectordrawable-animated`) | 1.1.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx | phone, wear |
| VersionedParcelable (`androidx.versionedparcelable:versionedparcelable`) | 1.1.1 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | phone, wear |
| Support View Pager (`androidx.viewpager:viewpager`) | 1.0.0 | Apache License 2.0 | http://developer.android.com/tools/extras/support-library.html | phone, wear |
| Android Wear Compose Foundation (`androidx.wear.compose:compose-foundation`) | 1.4.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-compose#1.4.1 | wear |
| Android Wear Compose Material (`androidx.wear.compose:compose-material`) | 1.4.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-compose#1.4.1 | wear |
| Android Wear Compose Material Core (`androidx.wear.compose:compose-material-core`) | 1.4.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-compose#1.4.1 | wear |
| Android Wear Compose Navigation (`androidx.wear.compose:compose-navigation`) | 1.4.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-compose#1.4.1 | wear |
| ProtoLayout (`androidx.wear.protolayout:protolayout`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-protolayout#1.2.1 | wear |
| ProtoLayout Expression (`androidx.wear.protolayout:protolayout-expression`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-protolayout#1.2.1 | wear |
| ProtoLayout Expression Pipeline (`androidx.wear.protolayout:protolayout-expression-pipeline`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-protolayout#1.2.1 | wear |
| androidx.wear.protolayout:protolayout-external-protobuf (`androidx.wear.protolayout:protolayout-external-protobuf`) | 1.2.1 | BSD 3-Clause "New" or "Revised" License | https://developer.android.com/jetpack/androidx/releases/wear-protolayout#1.2.1 | wear |
| androidx.wear.protolayout:protolayout-material (`androidx.wear.protolayout:protolayout-material`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-protolayout#1.2.1 | wear |
| androidx.wear.protolayout:protolayout-material-core (`androidx.wear.protolayout:protolayout-material-core`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-protolayout#1.2.1 | wear |
| Wear ProtoLayout Proto (`androidx.wear.protolayout:protolayout-proto`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-protolayout#1.2.1 | wear |
| Android Wear Tiles (`androidx.wear.tiles:tiles`) | 1.4.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-tiles#1.4.1 | wear |
| Android Wear Tiles Material (`androidx.wear.tiles:tiles-material`) | 1.4.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-tiles#1.4.1 | wear |
| Wear Tiles Proto (`androidx.wear.tiles:tiles-proto`) | 1.4.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-tiles#1.4.1 | wear |
| Android Wear Complications (`androidx.wear.watchface:watchface-complications`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-watchface#1.2.1 | wear |
| Android Wear Complications Data (`androidx.wear.watchface:watchface-complications-data`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-watchface#1.2.1 | wear |
| Android Wear Complications Data Source (`androidx.wear.watchface:watchface-complications-data-source`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-watchface#1.2.1 | wear |
| Android Wear Complications Data Source Ktx (`androidx.wear.watchface:watchface-complications-data-source-ktx`) | 1.2.1 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear-watchface#1.2.1 | wear |
| Android Wear Remote Interactions (`androidx.wear:wear-remote-interactions`) | 1.1.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/wear#1.1.0 | wear |
| WindowManager (`androidx.window:window`) | 1.5.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/window#1.5.0 | phone, wear |
| WindowManager Core (`androidx.window:window-core`) | 1.5.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/window#1.5.0 | phone, wear |
| WorkManager Runtime (`androidx.work:work-runtime`) | 2.10.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/work#2.10.0 | phone |
| WorkManager Kotlin Extensions (`androidx.work:work-runtime-ktx`) | 2.10.0 | Apache License 2.0 | https://developer.android.com/jetpack/androidx/releases/work#2.10.0 | phone |
| play-services-base (`com.google.android.gms:play-services-base`) | 18.5.0 | Proprietary (Android SDK / Google Play services terms) | https://developer.android.com/studio/terms.html | phone, wear |
| play-services-basement (`com.google.android.gms:play-services-basement`) | 18.4.0 | Proprietary (Android SDK / Google Play services terms) | https://developer.android.com/studio/terms.html | phone, wear |
| play-services-tasks (`com.google.android.gms:play-services-tasks`) | 18.2.0 | Proprietary (Android SDK / Google Play services terms) | https://developer.android.com/studio/terms.html | phone, wear |
| Google Play services (Wearable) (`com.google.android.gms:play-services-wearable`) | 19.0.0 | Proprietary (Android SDK / Google Play services terms) | https://developers.google.com/android/guides/overview | phone, wear |
| Guava ListenableFuture only (`com.google.guava:listenablefuture`) | 1.0 | Apache License 2.0 | https://github.com/google/guava/listenablefuture | phone, wear |
| AboutLibraries Compose UI Library (`com.mikepenz:aboutlibraries-compose-core`) | 15.3.0 | Apache License 2.0 | https://github.com/mikepenz/AboutLibraries | phone |
| AboutLibraries Compose Material 3 Library (`com.mikepenz:aboutlibraries-compose-m3`) | 15.3.0 | Apache License 2.0 | https://github.com/mikepenz/AboutLibraries | phone |
| AboutLibraries Core Library (`com.mikepenz:aboutlibraries-core`) | 15.3.0 | Apache License 2.0 | https://github.com/mikepenz/AboutLibraries | phone, wear |
| okio (`com.squareup.okio:okio`) | 3.4.0 | Apache License 2.0 | https://github.com/square/okio/ | phone |
| Lifecycle-Common (`org.jetbrains.androidx.lifecycle:lifecycle-common`) | 2.9.6 | Apache License 2.0 | https://github.com/JetBrains/compose-jb | phone |
| Lifecycle Runtime (`org.jetbrains.androidx.lifecycle:lifecycle-runtime`) | 2.9.6 | Apache License 2.0 | https://github.com/JetBrains/compose-jb | phone |
| Lifecycle Runtime Compose (`org.jetbrains.androidx.lifecycle:lifecycle-runtime-compose`) | 2.9.6 | Apache License 2.0 | https://github.com/JetBrains/compose-jb | phone |
| Saved State (`org.jetbrains.androidx.savedstate:savedstate`) | 1.3.6 | Apache License 2.0 | https://github.com/JetBrains/compose-jb | phone |
| Saved State Compose (`org.jetbrains.androidx.savedstate:savedstate-compose`) | 1.3.6 | Apache License 2.0 | https://github.com/JetBrains/compose-jb | phone |
| Compose Animation (`org.jetbrains.compose.animation:animation`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose Animation Core (`org.jetbrains.compose.animation:animation-core`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Annotation (`org.jetbrains.compose.annotation-internal:annotation`) | 1.9.1 | Apache License 2.0 | https://github.com/JetBrains/compose-jb | phone |
| collections (`org.jetbrains.compose.collection-internal:collection`) | 1.9.1 | Apache License 2.0 | https://github.com/JetBrains/compose-jb | phone |
| Compose Foundation (`org.jetbrains.compose.foundation:foundation`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose Layouts (`org.jetbrains.compose.foundation:foundation-layout`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose Material3 Components (`org.jetbrains.compose.material3:material3`) | 1.9.0 | Apache License 2.0 | https://github.com/JetBrains/compose-jb | phone |
| Compose Material Ripple (`org.jetbrains.compose.material:material-ripple`) | 1.9.1 | Apache License 2.0 | https://github.com/JetBrains/compose-jb | phone |
| Compose Runtime (`org.jetbrains.compose.runtime:runtime`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose Saveable (`org.jetbrains.compose.runtime:runtime-saveable`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose UI (`org.jetbrains.compose.ui:ui`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose BackHandler (`org.jetbrains.compose.ui:ui-backhandler`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose Geometry (`org.jetbrains.compose.ui:ui-geometry`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose Graphics (`org.jetbrains.compose.ui:ui-graphics`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose UI Text (`org.jetbrains.compose.ui:ui-text`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose UI Preview Tooling (`org.jetbrains.compose.ui:ui-tooling-preview`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose Unit (`org.jetbrains.compose.ui:ui-unit`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Compose Util (`org.jetbrains.compose.ui:ui-util`) | 1.12.1 | Apache License 2.0 | https://github.com/JetBrains/compose-multiplatform | phone |
| Kotlin Android Extensions Runtime (`org.jetbrains.kotlin:kotlin-android-extensions-runtime`) | 1.9.22 | Apache License 2.0 | https://kotlinlang.org/ | phone |
| Parcelize Runtime (`org.jetbrains.kotlin:kotlin-parcelize-runtime`) | 1.9.22 | Apache License 2.0 | https://kotlinlang.org/ | phone |
| Kotlin Stdlib (`org.jetbrains.kotlin:kotlin-stdlib`) | 2.4.21 | Apache License 2.0 | https://kotlinlang.org/ | phone, wear |
| Kotlin Stdlib Common (`org.jetbrains.kotlin:kotlin-stdlib-common`) | 2.4.21 | Apache License 2.0 | https://kotlinlang.org/ | phone, wear |
| Kotlin Stdlib Jdk7 (`org.jetbrains.kotlin:kotlin-stdlib-jdk7`) | 1.8.22 | Apache License 2.0 | https://kotlinlang.org/ | phone |
| Kotlin Stdlib Jdk8 (`org.jetbrains.kotlin:kotlin-stdlib-jdk8`) | 1.8.22 | Apache License 2.0 | https://kotlinlang.org/ | phone |
| kotlinx-coroutines-android (`org.jetbrains.kotlinx:kotlinx-coroutines-android`) | 1.9.0 | Apache License 2.0 | https://github.com/Kotlin/kotlinx.coroutines | phone, wear |
| kotlinx-coroutines-bom (`org.jetbrains.kotlinx:kotlinx-coroutines-bom`) | 1.9.0 | Apache License 2.0 | https://github.com/Kotlin/kotlinx.coroutines | phone, wear |
| kotlinx-coroutines-core (`org.jetbrains.kotlinx:kotlinx-coroutines-core`) | 1.9.0 | Apache License 2.0 | https://github.com/Kotlin/kotlinx.coroutines | phone, wear |
| kotlinx-coroutines-play-services (`org.jetbrains.kotlinx:kotlinx-coroutines-play-services`) | 1.9.0 | Apache License 2.0 | https://github.com/Kotlin/kotlinx.coroutines | wear |
| kotlinx-serialization-bom (`org.jetbrains.kotlinx:kotlinx-serialization-bom`) | 1.12.0 | Apache License 2.0 | https://github.com/Kotlin/kotlinx.serialization | phone, wear |
| kotlinx-serialization-core (`org.jetbrains.kotlinx:kotlinx-serialization-core`) | 1.12.0 | Apache License 2.0 | https://github.com/Kotlin/kotlinx.serialization | phone, wear |
| kotlinx-serialization-json (`org.jetbrains.kotlinx:kotlinx-serialization-json`) | 1.12.0 | Apache License 2.0 | https://github.com/Kotlin/kotlinx.serialization | phone, wear |
| JetBrains Java Annotations (`org.jetbrains:annotations`) | 23.0.0 | Apache License 2.0 | https://github.com/JetBrains/java-annotations | phone, wear |
| JSpecify annotations (`org.jspecify:jspecify`) | 1.0.0 | Apache License 2.0 | http://jspecify.org/ | phone, wear |
