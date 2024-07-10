plugins {
    id("base")
}

tasks.register<Zip>("createZip") {
    from("src") {
        include("**/*") // Include all files in the src directory
    }
    archiveFileName.set("trainSchedule.zip")
    destinationDirectory.set(file("$buildDir/dist"))
}

tasks.named("build") {
    dependsOn("createZip")
}
