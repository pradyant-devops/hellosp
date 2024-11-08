pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/pradyant-devops/hellosp.git'
            }
        }
        stage('Deploy') {
    steps {
        script {
            // Set the path to the generated WAR file
            def warFile = '/var/lib/jenkins/workspace/hello-ci/target/hellosp-0.0.1-SNAPSHOT.war'
            def contextPath = '/hellosp'  // Set your desired context path
            def tomcatUrl = 'http://51.20.5.220:8080/manager/html'  // Tomcat manager URL
            def tomcatUser = 'admingui'      // Tomcat manager username
            def tomcatPassword = 'admin'  // Tomcat manager password
            
            // Deploying the WAR file using curl command with authentication
            sh """
                curl -u ${tomcatUser}:${tomcatPassword} --upload-file ${warFile} \
                ${tomcatUrl}/deploy?path=${contextPath}&update=true
            """
        }
    }
}
}
}
