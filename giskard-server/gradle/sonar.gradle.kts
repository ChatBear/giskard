//jacoco {
//    toolVersion = "0.8.7"
//}

//jacocoTestReport {
//    executionData tasks.withType(Test)
//    classDirectories.from = files(sourceSets.main.output.classesDirs)
//    sourceDirectories.from = files(sourceSets.main.java.srcDirs)
//
//    reports {
//        xml.required = true
//        html.required = false
//    }
//}
//
//file("sonar-project.properties").withReader {
//    val sonarProperties: Properties = new Properties()
//    sonarProperties.load(it)
//
//    sonarProperties.each { key, value ->
//        sonarqube {
//            properties {
//                property key, value
//            }
//        }
//    }
//}
