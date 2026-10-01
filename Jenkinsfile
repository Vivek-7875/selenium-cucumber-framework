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
            publishHTML(target: [
                reportDir: 'target',
                reportFiles: 'cucumber-report.html',
                reportName: 'Cucumber HTML Report',
                keepAll: true,
                alwaysLinkToLastBuild: true,
                allowMissing: true
            ])

            echo 'Pipeline execution finished.'
        }
    }
}
