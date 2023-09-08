pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
  }
}

plugins {
  id("com.gradle.enterprise") version "3.13"
}

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

rootProject.name = "paywall"
includeBuild("./build-conventions/")
include(":tests:test-utils")

include(
  ":modules:template-kmp-library-core",
  ":tests:template-kmp-library-core-tests"
)

include(
  ":modules:template-kmp-library-dsl",
  ":tests:template-kmp-library-dsl-tests"
)
