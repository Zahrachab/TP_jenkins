pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'gradle build'
      }
    }
    stage('Mail notification') {
      steps {
        emailext(subject: 'Notification', body: 'Build ....')
      }
    }
  }
}