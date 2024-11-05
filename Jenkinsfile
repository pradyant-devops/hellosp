pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/pradyant-devops/hellosp.git'
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
                
    }
}
