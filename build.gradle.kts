plugins {
    application
    id("org.openjfx.javafxplugin").version("0.1.0")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation(libs.guava)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

javafx {
    version = "26"
    modules("javafx.controls", "javafx.fxml")
}

application {
//    mainClass = "org.example.App"
//    mainClass = "org.example.FXMLExample"
    mainClass = "org.example.circles.ColorfulCircles"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
