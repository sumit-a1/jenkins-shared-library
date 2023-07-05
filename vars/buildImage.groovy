#!/user/bin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t sumitjha1/my-repo:jenkinssl-1.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push sumitjha1/my-repo:jenkinssl-1.0'
    }
}