pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat(script: 'gradle build', encoding: 'UTF-8')
      }
    }
  }
  environment {
    cmd = 'C:\\Windows\\System32'
  }
}