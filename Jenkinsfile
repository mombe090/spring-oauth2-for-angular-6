pipeline {
  agent any
  stages {
    stage('build and clean') {
      parallel {
        stage('build and clean') {
          steps {
            sh 'mvn clean package'
          }
        }

        stage('shell') {
          steps {
            echo 'coucou'
          }
        }

      }
    }

  }
}