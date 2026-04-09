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
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

javafx {
    version = "25"
    modules("javafx.controls", "javafx.fxml");
}

application {
    // Define the main class for the application.
    mainClass = "com.pupupucat.joyredactor.JoyRedactor"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
