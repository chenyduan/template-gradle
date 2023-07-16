plugins {
    id("java-platform")
    id("maven-publish")
}

// all projects in this build can use this platform
javaPlatform {
    allowDependencies()
}

// publish as BOM, need maven-publish plugin
publishing {
    publications {
        create<MavenPublication>("myPlatform") {
            from(components["javaPlatform"])
        }
    }
}


dependencies {
    // other platform dependencies
    api(platform("com.fasterxml.jackson:jackson-bom:2.9.8"))
    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-parent
    api(platform("org.springframework.boot:spring-boot-starter-parent:3.1.1"))
    api(platform("org.junit:junit-bom:5.9.1"))

    // subprojects and other dependencies
    constraints {
        // common-lib
        api(project(":common-lib"))
        runtime("org.postgresql:postgresql:42.2.5")
        api("org.apache.commons:commons-lang3:3.8.1")

    }
}




