pipeline{
    agent any
    stages {
        stage('Test and Lint'){
            steps{
                sh "./gradlew --no-daemon clean check"
                stash name: 'testResults', includes: "build/test-results/**"
            }
        }
        stage('Compile'){
            steps{
                sh "./gradlew --no-daemon assemble"
            }
        }
    }
    post {
        always{
            unstash name: 'testResults'
            junit 'build/test-results/test/**.*'
        }
    }
}