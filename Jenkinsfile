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
        stage('Cypress') {
            steps {
                // contruction du chemin des sources pour docker-compose
                sh 'echo "SRC_PATH=/var/lib/docker/volumes/jenkins_home/_data/workspace/$(basename $WORKSPACE)" > .env'
                sh "docker compose up -d serveur"
                sh "sleep 20"
                sh "docker compose up cypress"
            }
            when {
                branch "main"
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