plugins {
  kotlin("multiplatform")
}

kotlin {

  jvm {
    withJava()
  }
  js(IR) {
    browser()
  }
  linuxX64 {
    binaries {
      executable {
        baseName = "kmpApp"
        debuggable
        entryPoint = "com.github.reomor.main"
      }
      sharedLib {
        baseName = "kmpAppSharedLib"
      }
      staticLib {
        baseName = "kmpAppStaticLib"
      }
    }
  }

  sourceSets {

    val kotlinCoroutines: String by project

    val commonMain by getting {
      dependencies {
        implementation(kotlin("stdlib-common"))
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutines") {
          version {
            strictly(kotlinCoroutines)
          }
        }
      }
    }
    val commonTest by getting {
      dependencies {
        implementation(kotlin("test-common"))
        implementation(kotlin("test-annotations-common"))
      }
    }

    val jsMain by getting {
      dependencies {
        implementation(npm("js-big-decimal", "~1.3.4"))
        implementation(npm("is-sorted", "~1.0.5"))
      }
    }
    val jsTest by getting {
      dependencies {
        implementation(kotlin("test-js"))
      }
    }

    val jvmMain by getting {
      dependencies {
      }
    }
    val jvmTest by getting {
      dependencies {
        implementation(kotlin("test-junit"))
      }
    }

    val linuxX64Main by getting {
      dependencies {
      }
    }
    val linuxX64Test by getting {
      dependencies {
        implementation(kotlin("test"))
      }
    }
  }
}
