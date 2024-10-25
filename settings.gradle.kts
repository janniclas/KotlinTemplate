enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "YOUR_PROJECT_NAME"

include(":core")

include(":model")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins { id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0" }
