pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat(script: 'gradle test', encoding: 'UTF-8')
      }
    }
  }
}