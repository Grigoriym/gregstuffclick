pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
    }
}

rootProject.name = "gregstuffclick"

include(":site")
include(":uikit")
include(":core")
