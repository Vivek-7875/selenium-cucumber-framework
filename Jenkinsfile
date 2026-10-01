pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution finished.'
        }
    }
}