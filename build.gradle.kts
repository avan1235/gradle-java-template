plugins {
    id("java")
}

group = "ml.dev.kotlin"
version = "1.0"

ant.importBuild("build.xml") { "ant-$it" }
