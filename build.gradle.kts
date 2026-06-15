plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.16.0"
}

group = "com.akio.lumina"
version = "1.0.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
        intellijDependencies()
    }
}

import java.io.File

dependencies {
    intellijPlatform {
        val localApp = File("/Applications/IntelliJ IDEA.app")
        if (localApp.exists()) {
            local(localApp.absolutePath)
        } else {
            intellijIdeaCommunity("2023.3") // Minimum supported version by the plugin
        }
    }
}

intellijPlatform {
    instrumentCode = false
    pluginConfiguration {
        ideaVersion {
            sinceBuild = "232"
            untilBuild = "262.*"
        }
    }
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
    }
}
