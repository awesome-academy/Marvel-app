// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(BuildPlugins.androidApplication) version Version.androidApplication apply false
    id(BuildPlugins.library) version Version.androidApplication apply false
    id(BuildPlugins.kotlinAndroid) version Version.kotlinAndroid apply false
    id(BuildPlugins.ktlint) version Version.ktlint apply true
}