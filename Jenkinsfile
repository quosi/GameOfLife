#!/usr/bin/env groovy

def gitURL = "https://github.com/quosi/GameOfLife.git"
def gitURL_push = "https://github.com/quosi/GameOfLife.git"
def git_timeout = 60

def project = "Game of Life"
def shortProject = "GoL"
def archs = ["mac"]

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        script {
          echo "---------------- Build on MacOS ----------------\n ${env.NODE_NAME}\n ----------------\n"
    			sh '''
          	export MACOSX_DEPLOYMENT_TARGET=10.15
						mkdir -p mac
						cd mac
            pwd
            ls -alt
            '''
            echo "building now with ant ..."
            echo "${env.BRANCH_NAME}"


          
        }
        
        stash name: "${shortProject}_mac", includes: 'mac/'
				archiveArtifacts artifacts: 'mac/'

        }
      }

    }
  }