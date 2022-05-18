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
    }
}
