pipeline {
  agent { label 'jenkins-slave' }
  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/yourname/cucumber-selenium-sample.git'
      }
    }
    stage('Build & Test') {
      steps {
        sh 'mvn clean test'
      }
    }
  }
}
