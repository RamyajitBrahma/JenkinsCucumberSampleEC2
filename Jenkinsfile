pipeline {
  agent { label 'Jenkins-Slave1' }
  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/RamyajitBrahma/JenkinsCucumberSampleEC2.git'
      }
    }
    stage('Build & Test') {
      steps {
        sh 'mvn clean test'
      }
    }
  }
}
