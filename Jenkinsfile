pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat(script: 'gradle build', returnStatus: true, returnStdout: true, encoding: 'UTF-8')
        archiveArtifacts(artifacts: 'build/libs/*.jar', allowEmptyArchive: true)
      }
    }
  }
}