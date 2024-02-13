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
  }
}