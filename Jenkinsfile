pipeline {
  agent any
  stages {
    stage('initialize') {
      steps {
        sh 'pwd'
        sh 'env'
        sh 'java -version'
        sh 'gradle -version'
      }
    }
  }
}