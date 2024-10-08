plugins {
    kotlin("jvm") version "2.0.10"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
}

group = "mrpo.practics"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}

ktlint {
    version = "0.38.2"
    android = true // to use the Android Studio KtLint plugin style
    ignoreFailures = false
}