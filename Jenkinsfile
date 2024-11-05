pipeline {
    agent any
    
    environment {
        MAVEN_HOME = 'C:/Users/pradyantprakashkhara/Downloads/apache-maven-3.9.9-bin/apache-maven-3.9.9'  // Define path to Maven installation
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/pradyant-devops/hellosp.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Deploy') {
            steps {
                bat 'start java -jar target/helloworld-0.0.1-SNAPSHOT.jar'
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
