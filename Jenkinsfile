pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'gradle build'
      }
    }
  }
  environment {
    gradle = 'C:\\Program Files (x86)\\gradle-4.10\\bin'
  }
}