pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven {
            url = uri("https://jitpack.io")
        }


    }
}

rootProject.name = "Seasson 1 All Class And Practice"
include(":app")
 