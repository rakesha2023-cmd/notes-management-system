pipeline {
    agent any

    tools {
        maven 'Maven'   // Must match Jenkins tool name
    }

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

        stage('Run Application') {
            steps {
                bat 'java -cp target/notes-app-1.0.jar NotesController'
            }
        }
    }

    post {
        success {
            echo '✅ Build and Test Successful!'
        }
        failure {
            echo '❌ Build Failed!'
        }
    }
}
