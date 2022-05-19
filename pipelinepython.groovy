pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/GuillermoRiosCortes/appMensaje.git'
                
            }
        }
        stage('Scan') {
            environment {
                scannerHome = tool 'sonarscanner'
            }
            steps {
                withSonarQubeEnv('sonarscanner') {
                    sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=sonarqube2 -Dsonar.sources=aplicaciones/"
                }
            }
        }
        stage('test'){
            steps {
                echo 'prueba prueba'
            }
        }
     }
}
