pipeline{
    agent any
    stages{
        stage('Test'){
            tasks{
                sh "./gradlew test"
            }
        }
        stage('CodeNarc'){
            tasks{
                sh "./gradlew codenarcMain codenarcTest"
            }
        }
        stage('Compile'){
            tasks{
                sh "./gradlew assemble"
            }
        }
    }
}