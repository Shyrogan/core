repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("wtf.mizu", "oshanraina", "0.1.0")
    implementation(project(":common"))
    implementation(project(":mod"))
    implementation("com.squareup", "javapoet", "1.13.0")
}