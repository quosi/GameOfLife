pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''withAnt(installation: \'myinstall\') {
    dir("scoring") {
    if (isUnix()) {
      sh "ant mytarget"
    } else {
      bat "ant mytarget"
    }
}'''
        }
      }

    }
  }