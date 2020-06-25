pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        sh 'mvn clean'
      }
    }

    stage('package') {
      steps {
        sh 'mvn package'
      }
    }

    stage('artifactory') {
      parallel {
        stage('artifactory') {
          steps {
            archiveArtifacts(artifacts: 'target/*.jar', onlyIfSuccessful: true)
          }
        }

        stage('build image') {
          steps {
            sh 'docker build -t mombe090/$name .'
          }
        }

      }
    }

    stage('push image') {
      steps {
        sh 'docker pushmombe090/$name'
      }
    }

  }
  environment {
    name = 'mombesoft'
  }
}