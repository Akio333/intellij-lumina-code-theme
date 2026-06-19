plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.16.0"
}

group = "com.akio.lumina"
version = "1.0.2"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
        intellijDependencies()
    }
}

dependencies {
    intellijPlatform {
        val localApp = file("/Applications/IntelliJ IDEA.app")
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
        id = "com.akio.lumina.theme"
        name = "Lumina Code"
        version = "1.0.2"
        description = "Sleek Tech-Minimalism dark theme with deep space backgrounds, vibrant purples, and teal accents."
        vendor {
            name = "Akio333"
            email = "smulye10@gmail.com"
            url = "https://github.com/Akio333/intellij-lumina-code-theme"
        }
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
