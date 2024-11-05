pipeline {
    agent any
    stages {
        stage('Check Environment') {
            steps {
                bat 'echo %PATH%'  // Print PATH variable to check if System32 is included
                bat 'echo %SystemRoot%'  // Print the SystemRoot to ensure Windows environment is configured correctly
                bat 'dir C:\\Windows\\System32\\cmd.exe'  // Verify cmd.exe exists and is accessible
            }
        }
        stage('Build') {
            steps {
                bat 'cmd /c echo Building...'
            }
        }
    }
}
