plugins {
    id 'base'
}

task createZip(type: Zip) {
    from 'src'
    archiveFileName = 'trainSchedule.zip'
    destinationDirectory = file("$buildDir/dist")
}

build.dependsOn createZip
