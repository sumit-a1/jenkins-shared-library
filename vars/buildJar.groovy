#!/usr/bin/env groovy

def call() {
    echo "building the application for brannch $BRANCH_NAME"
    sh 'mvn package'
}
