pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") } // ✅ THÊM VÀO ĐÂY NẾU CÓ THƯ VIỆN PLUGIN TỪ JITPACK
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // ✅ CỰC KỲ QUAN TRỌNG
    }
}

rootProject.name = "App Travel"
include(":app")
