plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "twee3_language_tools"
include("src:main:java_content")
findProject(":src:main:java_content")?.name = "java_content"
