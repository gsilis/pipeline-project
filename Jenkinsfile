pipeline {
  agent any
  stages {
    stage("Compile project") {
      steps {
        sh "./gradlew compileJava"
      }
    }
    stage("Unit tests") {
      steps {
        sh "./gradlew test"
      }
    }
    stage("Code coverage") {
      steps {
        sh "./gradlew jacocoTestReport"
        // Requires the html publisher plugin in jenkins
        publishHTML (target: [
          reportDir: 'build/reports/jacoco/test/html',
          reportFiles: 'index.html',
          reportName: 'JaCoCo Report'
        ])
        sh "./gradlew jacocoTestCoverageVerification"
      }
    }
    stage("Static code analysis") {
      steps {
        sh "./gradlew checkstyleMain"
        // Requires the html publisher plugin for jenkins
        publishHTML (target: [
          reportDir: 'build/reports/checkstyle/',
          reportFiles: 'main.html',
          reportName: 'Checkstyle Report'
        ])
      }
    }
  }
}