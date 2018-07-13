pipeline{
    agent any
    stages {
        stage('Test'){
            steps{
                sh "./gradlew test"
            }
        }
        stage('CodeNarc'){
            steps{
                sh "./gradlew codenarcMain codenarcTest"
            }
        }
        stage('Compile'){
            steps{
                sh "./gradlew assemble"
            }
        }
    }
    post {
        always{ 
            junit 'build/test-results/**.*'
        }
    }
}