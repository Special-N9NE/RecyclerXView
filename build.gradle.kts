// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library") version "8.1.0" apply false
    java
    kotlin("jvm") version "1.6.0"
    `maven-publish`
}
allprojects{
    repositories {
        google()
        mavenCentral()
    }

}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
    testImplementation("junit", "junit", "4.12")
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "Special-N9NE"
            artifactId = "RecyclerXView"
            version = "0.1.1"

            from(components["java"])
        }
    }
}
