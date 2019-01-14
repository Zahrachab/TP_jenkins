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
        emailext(subject: 'Notification', body: 'Build ....', to: 'fs_berrichi@esi.dz')
      }
    }
    stage('Test reporting') {
      steps {
        jacoco(changeBuildStatus: true)
      }
    }
    stage('Deployment') {
      steps {
        bat 'gradle uploadArchives'
      }
    }
    stage('Slack') {
      steps {
        slackSend(baseUrl: 'https://equipezahra.slack.com/services/hooks/jenkins-ci/', token: 'ODPkPjymvesSoLXg6vtc82g0', message: 'un nouveau déploiment ')
      }
    }
  }
}