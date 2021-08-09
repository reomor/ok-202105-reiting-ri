rootProject.name = "otuskotlin-rating"

pluginManagement {
  val kotlinVersion: String by settings

  plugins {
    kotlin("jvm") version kotlinVersion
    kotlin("multiplatform") version kotlinVersion
  }
}

include(
  "ok-m2l2-testing",
  "ok-common"
)
