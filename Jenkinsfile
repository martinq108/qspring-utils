pipeline {
  agent {
    docker {
      image 'martinq/build-image'
    }

  }
  stages {
    stage('Init') {
      steps {
        echo 'Initializing'
        sh '''env
ls -al'''
      }
    }
    stage('Build') {
      steps {
        sh './gradlew tasks'
        build 'job1'
      }
    }
  }
}