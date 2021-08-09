plugins {
  kotlin("jvm")
}

dependencies {

  val kotestVersion: String by project

  testImplementation(kotlin("test-junit5"))
  testImplementation("io.kotest:kotest-runner-junit5-jvm:$kotestVersion")
}

tasks.withType<Test>() {
  useJUnitPlatform()
}
