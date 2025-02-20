plugins {
    id("java-library")
    id("maven-publish")
}

group = "com.example"
version = "1.0.2"

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

