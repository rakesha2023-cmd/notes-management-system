pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/rakesha2023-cmd/notes-management-system.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t notes-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8080:8080 notes-app'
            }
        }
    }
}