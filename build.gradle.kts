plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation (
            "org.junit.jupiter:junit-jupiter:5.9.3"
            )
}

tasks.test {
    useJUnitPlatform()
}


