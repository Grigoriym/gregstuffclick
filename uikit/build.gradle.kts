import com.varabyte.kobweb.gradle.library.util.configAsKobwebLibrary

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.library)
    alias(libs.plugins.kobwebx.markdown)
}

group = "com.grappim.gregstuffclick"
version = "1.0"

kotlin {
    configAsKobwebLibrary(includeServer = true)

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
        }
        jsMain.dependencies {
            implementation(libs.compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            implementation(project(":core"))
        }
    }
}
