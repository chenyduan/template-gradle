plugins {
    id("application")
    id("org.springframework.boot") version "3.1.0"
    idea
}

apply(plugin = "io.spring.dependency-management")

dependencies {
    implementation(platform(project(":platform")))
    implementation(project(":common-lib"))
    implementation("org.springframework.boot:spring-boot-devtools")
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.test {
    useJUnitPlatform()
}

