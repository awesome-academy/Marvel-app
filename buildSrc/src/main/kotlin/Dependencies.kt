object BuildPlugins {
    const val androidApplication = "com.android.application"
    const val library = "com.android.library"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val ktlint = "org.jlleitschuh.gradle.ktlint"
}

object Version {
    const val androidApplication = "7.3.1"
    const val kotlinAndroid = "1.7.20"
    const val ktlint = "11.0.0"
}

object Libraries {
    const val appCompat = "androidx.appcompat:appcompat:1.5.1"
    const val ktxCore = "androidx.core:core-ktx:1.7.0"
    const val androidMaterial = "com.google.android.material:material:1.7.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
}

object TestLibraries {
    const val junit = "junit:junit:4.13.2"
    const val junitExt = "androidx.test.ext:junit:1.1.3"
    const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
}

object AppConfig {
    const val applicationId = "com.ndt.marvelapp"
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object AndroidSdk {
    const val min = 21
    const val target = 33
    const val compile = 33
}
