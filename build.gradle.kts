plugins {
    id("java")
    id("application")
}

application {
    mainClass.set("io.hexlet.code.App")
}


group = "org.example"
version = "1.0-SNAPSHOTD"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
