plugins {
    id("java")
}

val  javaVersion:Int = 17
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(javaVersion))
    }
}



/**
 * Current and all subprojects will have the same group and version.
 */

allprojects {
    group = "com.universeparticle"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenLocal()
        // for cn
        //        maven { url = uri("https://maven.aliyun.com/repository/public") }
        //        maven { url = uri("https://maven.aliyun.com/repository/google") }
        //        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        gradlePluginPortal()
        maven { url = uri("https://repo.spring.io/milestone") }
        mavenCentral()
    }



}
/**
 * son projects
 */
subprojects {
    dependencies {

    }
}
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.compileJava {
    options.isIncremental = true
    options.isFork = true
    options.isFailOnError = false
    options.encoding = "UTF-8"
    options.release.set(javaVersion)
}
