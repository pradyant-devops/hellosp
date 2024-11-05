pipeline {
    agent any
    
    environment {
        MAVEN_HOME = 'C:/Users/pradyantprakashkhara/Downloads/apache-maven-3.9.9-bin/apache-maven-3.9.9'  // Define path to Maven installation
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/pradyant-devops/hellosp.git'
            }
        }
        
        stage('Build') {
            steps {
                script {
                    // Run Maven build
                    sh '"${tool "Maven 3.8.6"}" clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run tests (if any)
                    sh '"${tool "Maven 3.8.6"}" test'
                }
            }
        }
        
        stage('Deploy') {
            steps {
                script {
                    // Deploy the application (e.g., using Docker or just running the jar)
                    sh 'java -jar target/helloworld-0.0.1-SNAPSHOT.jar'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
