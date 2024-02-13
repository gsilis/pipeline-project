pipeline {
  agent any
  stages {
    stage("Checkout") {
      steps {
        git url: 'https://github.com/gsilis/pipeline-project.git', branch: 'main'
      }
    }
    stage("Compile") {
      steps {
        sh "./gradlew compileJava"
      }
    }
    stage("Unit test") {
      steps {
        sh "./gradlew test"
      }
    }
  }
}