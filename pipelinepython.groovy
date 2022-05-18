pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                
                git 'https://github.com/GuillermoRiosCortes/appMensaje.git'

            
            }
        }
        stage('test'){
            steps {
                echo 'prueba prueba'
            }
        }
        stage('stage 1'){
            steps {
                sh 'docker build -t mensajeapp .'
            }
        }
        stage('stage 2'){
            steps {
                sh 'docker run -it -p 7000:4000 -d mensajeapp'
            }
        }
    }
}
