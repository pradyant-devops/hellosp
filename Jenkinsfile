pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/pradyant-devops/hellosp.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    // Use Maven to build the project
                    sh './mvnw clean package -DskipTests'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    // Run tests (optional)
                    sh './mvnw test'
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Deploy to a server (e.g., copy .jar to the remote server)
                    // sh 'scp target/*.jar user@yourserver:/path/to/deployment/folder'
                    // Or if deploying to a cloud provider, you can configure respective commands.
                }
            }
        }
    }
}