pipeline {
  agent any
  stages {
    stage('aaa') {
      withCredentials([
          string(credentialsId: 'SIGNING_USEDID', variable: 'SIGNING_USEDID'),
          string(credentialsId: 'SIGNING_PASSWORD', variable: 'SIGNING_PASSWORD')
      ]) {
        steps {
          sh echo "SIGNING_USEDID=$SIGNING_USEDID"
          sh echo "SIGNING_PASSWORD=$SIGNING_PASSWORD"
        }
      }
    }
    stage('initialize') {
      steps {
        sh 'pwd'
        sh 'env'
        sh 'ls -la'
        sh 'java -version'
        sh './gradlew -version'
      }
    }
    stage('build') {
      steps {
        sh './gradlew build'
      }
    }
  }
}