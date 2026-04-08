pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/rakesha2023-cmd/notes-management-system.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t notes-app .'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8080:8080 notes-app'
            }
        }
    }
}
