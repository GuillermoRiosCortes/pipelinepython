pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/GuillermoRiosCortes/appMensaje.git'
                
            }
        }
        stage('test'){
            steps {
                echo 'prueba prueba'
            }
        }
        stage('Scan') {
            steps {
                withSonarQubeEnv('sonarscanner') {
                    sh './aplicaciones sonarqube'
                }
            }
        }
     }
}
