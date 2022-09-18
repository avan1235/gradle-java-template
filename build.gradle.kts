plugins {
    id("java")
    kotlin("jvm") version "1.4.32"
}

group = "ml.dev.kotlin"
version = "1.0"

ant.importBuild("build.xml") { "ant-$it" }

dependencies {
    implementation(files("${System.getenv("NXJ_HOME")}/lib/nxt/classes.jar"))
    implementation(files("/opt/env/kotlinc/lib/kotlin-stdlib.jar"))
}