pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'gradle build'
      }
    }
    stage('Mail notification') {
      steps {
        emailext(subject: 'Notification', body: 'Build ....', to: 'fz_chabanechaouch@esi.dz')
      }
    }
  }
}