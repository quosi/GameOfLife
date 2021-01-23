#!/usr/bin/env groovy

def gitURL = "https://github.com/quosi/GameOfLife.git"
def gitURL_push = "https://github.com/quosi/GameOfLife.git"
def git_timeout = 60

def project = "Game of Life"
def shortProject = "GoL"
def archs = ["mac"]
def getAnt = "/usr/local/bin/ant"

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {

        script {
          echo "----> Build on MacOS | Node: ${env.NODE_NAME} <----"
          echo "----> Build Branch ${env.BRANCH_NAME} | BuildNr. ${env.BUILD_NUMBER} <----"
          echo "building Project ${project} with Ant ..."
          sh "${getAnt} -version"
          sh "${getAnt}"
        }
        
        stash name: "${shortProject}_mac", includes: 'ant_build/'
				archiveArtifacts artifacts: 'ant_build/'

      }
    }
    stage('PyTest') {
      steps {
        echo "----> Build on MacOS | Node: ${env.NODE_NAME} <----"
        echo "----> Build Branch ${env.BRANCH_NAME} | BuildNr. ${env.BUILD_NUMBER} <----"
        sh "${getPython()} --version"
        sh "pytest"

      }
    }
  
  }
}

// return python binary name
def getPython() {
    if ( isUnixNode() ) {
        return "python3"
    }
    return "python"
}