plugins {
    id("java-library")
}


/*
* version  from platform
* */
dependencies {
    implementation(platform(project(":platform")))
    testImplementation("org.junit.jupiter:junit-jupiter")
    api("org.apache.commons:commons-lang3")


}

tasks.test {
    useJUnitPlatform()
}