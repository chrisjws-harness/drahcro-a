plugins {
    id("java-library")
    id("maven-publish")
}

group = "com.example"
version = "1.0.0"

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

