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
    private object Versions {
        const val appCompat = "1.5.1"
        const val ktx = "1.5.1"
        const val constraintLayout = "2.1.4"
        const val masterial = "1.7.0"
        const val coroutinesCore = "1.6.4"
        const val coroutinesAndroid = "1.6.4"
    }

    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val androidMaterial = "com.google.android.material:material:${Versions.masterial}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    //coroutines
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"

    //nav
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:2.5.3"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:2.5.3"
    const val navigationDynamic = "androidx.navigation:navigation-dynamic-features-fragment:2.5.3"

    //roomdb
    const val roomRuntime = "androidx.room:room-runtime:2.5.0-beta01"
    const val roomKtx = "androidx.room:room-ktx:2.5.0-beta01"
    const val roomCompiler = "androidx.room:room-compiler:2.5.0-beta01"

    //load image
    const val imageGlide = "com.github.bumptech.glide:glide:4.13.2"

    //koin
    const val koinCore = "io.insert-koin:koin-core:3.2.0"
    const val koinAndroid = "io.insert-koin:koin-android:3.2.0"
    const val lifecycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1"

    //retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
    const val converterGson = "com.squareup.retrofit2:converter-gson:2.9.0"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:3.9.0"

    //scrollingPagerIndicator
    const val scrollingPagerIndicator = "ru.tinkoff.scrollingpagerindicator:scrollingpagerindicator:1.2.1"
}

object TestLibraries {
    const val junit = "junit:junit:4.13.2"
    const val junitExt = "androidx.test.ext:junit:1.1.3"
    const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
}

object AppConfig {
    const val namespace = "com.ndt.marvelapp"
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
