buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Kotlin.PLUGIN)
        classpath(Kotlin.SERIALIZATION_PLUGIN)
        classpath(Gradle.PLUGIN)
        classpath(Navigation.PLUGIN)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}