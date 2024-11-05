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
                sh 'chmod +x ./mvnw'        // Ensure mvnw has execute permissions
                sh './mvnw clean package -DskipTests'  // Run the maven wrapper
            }
        }
    }
}
