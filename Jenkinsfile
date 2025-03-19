pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                echo 'Building the project...'
                sh 'chmod +x ./mvnw'
                sh './mvnw clean install'
            }
        }
        stage('Test'){
            steps{
                echo 'Testing the project...'
            }
        }
        stage('Deploy'){
            steps{
                echo 'Deploying the project...'
            }
        }
    }
}