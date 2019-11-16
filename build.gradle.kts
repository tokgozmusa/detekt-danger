import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.50"
    id("io.gitlab.arturbosch.detekt").version("1.0.1")
}

version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.0.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

detekt {
    toolVersion = "1.0.1"
    input = files("./")
    parallel = false
    config = files("./detekt-ruleset.yml")
    // baseline = file("path/to/baseline.xml")
    autoCorrect = true
    reports {
        xml {
            enabled = true
            destination = file("./build/detekt/reports/detekt.xml")
        }
        html {
            enabled = true
            destination = file("./build/detekt/reports/detekt.html")
        }
    }
}

/**
 * `detektOnFiles` task runs `detekt` on given files
 * INPUT is a string that contains comma separated paths to Kotlin files
 * ./gradlew detektOnFiles -PkotlinFiles=$INPUT
 * E.g `./gradlew detektOnFiles -PkotlinFiles="build.gradle.kts,src/main/kotlin/HelloWorld.kt"`
 */
task<io.gitlab.arturbosch.detekt.Detekt>("detektOnFiles") {
    val argumentName = "kotlinFiles"
    if (project.hasProperty(argumentName)) {
        val kotlinFiles: String by project
        val listOfFiles: List<String>? = kotlinFiles.takeIf { it.isNotBlank() }?.split(",")
        listOfFiles?.let { fileList ->
            setSource(files(fileList))
            config.setFrom(files("./detekt-ruleset.yml"))
            autoCorrect = true
            reports {
                xml {
                    enabled = true
                    destination = file("./build/detekt/reports/detekt.xml")
                }
                html {
                    enabled = true
                    destination = file("./build/detekt/reports/detekt.html")
                }
            }
        }
    }
}
