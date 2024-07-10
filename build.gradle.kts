plugins {
    id("base")
}

tasks.register<Zip>("createZip") {
    from("src")
    archiveFileName.set("trainSchedule.zip")
    destinationDirectory.set(file("$buildDir/dist"))
}

tasks.named("build") {
    dependsOn("createZip")
}
