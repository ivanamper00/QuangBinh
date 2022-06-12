object Versions{
    const val KOTLIN = "1.7.0"
    const val GRADLE = "7.1.3"
    const val MATERIAL = "1.6.1"
    const val APP_COMPAT = "1.4.2"
    const val CONSTRAINT_LAYOUT = "2.1.4"
    const val kotlinxDatetime = "0.1.1"
    const val kotlinxSerialization = "1.1.0"
    const val kotlinxCoroutines = "1.3.2"
    const val KODE_IN = "7.2.0"
    const val NAV_COMPONENT = "2.4.2"
    const val MOKO = "0.13.0"
}

object Kotlin {
    const val PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
    const val SERIALIZATION_PLUGIN = "org.jetbrains.kotlin:kotlin-serialization:${Versions.KOTLIN}"
    const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.kotlinxDatetime}"
    const val SERIALIZATION = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinxSerialization}"
    const val COROUTINES_NATIVE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutines}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
}

object Gradle {
    const val PLUGIN = "com.android.tools.build:gradle:${Versions.GRADLE}"
}

object AndroidX {
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
}

object KodeIn {
    const val CORE = "org.kodein.di:kodein-di:${Versions.KODE_IN}"
}

object Navigation {
    const val PLUGIN = "androidx.navigation.safeargs:androidx.navigation.safeargs.gradle.plugin:${Versions.NAV_COMPONENT}"
    const val FRAGMENT_KTX = "androidx.navigation:navigation-fragment-ktx:${Versions.NAV_COMPONENT}"
    const val UI_KTX = "androidx.navigation:navigation-ui-ktx:${Versions.NAV_COMPONENT}"
}


object Config {
    const val COMPILED_SDK = 32
    const val APP_ID = "com.wayneall.dongthap.android"
    const val MIN_SDK = 21
    const val TARGET_SDK = 32
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
}

object Moko {
    const val CORE = "dev.icerock.moko:mvvm-core:${Versions.MOKO}"
    const val FLOW = "dev.icerock.moko:mvvm-flow:${Versions.MOKO}"
    const val LIVE_DATA = "dev.icerock.moko:mvvm-livedata:${Versions.MOKO}"
    const val LIVE_DATA_RESOURCE = "dev.icerock.moko:mvvm-livedata-resources:${Versions.MOKO}"
    const val STATE = "dev.icerock.moko:mvvm-state:${Versions.MOKO}"
}


