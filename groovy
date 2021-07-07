pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
                stage('building') {
            steps {
                echo 'building'
            }
        }
                stage('testing') {
            steps {
                echo 'testing is going'
            }
        }
                    stage('release') {
            steps {
                echo 'releaseddd'
            }
        
        }
    }
    

}
