pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'gradle build'
        archiveArtifacts 'build/libs/*.jar'
      }
    }
    stage('Mail notification') {
      steps {
        emailext(subject: 'Notification', body: 'Build ....', to: 'fz_chabanechaouch@esi.dz')
      }
    }
    stage('Test reporting') {
      steps {
        jacoco(changeBuildStatus: true)
      }
    }
  }
}