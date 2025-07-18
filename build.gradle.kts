plugins {
    id("application")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
application{
    mainClass="aplicacion.Programa"
}
javafx{
    modules("javafx.controls","javafx.fxml")
    version="21"
}

dependencies {
    implementation("junit:junit:4.13.1")
    testImplementation("junit:junit:4.13.2")
}

tasks.test {
    useJUnit()
}
