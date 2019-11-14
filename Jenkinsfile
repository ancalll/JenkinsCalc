pipeline {
  agent any
  stages {
    stage("Cleaning stage") {
      steps {
        bat "mvn clean"
      }
    }
    stage("Testing stage") {
      steps {
        bat "mvn test"
      }
    }
    stage("Packaging stage") {
      steps {
        bat "mvn package"
      }
    }
    stage("Consolidate results") {
      steps {
        input("Do you want to capture results?")
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
      }
    }
    stage("Email build status") {
      steps {
        mail body: "${env.JOB_NAME} - Build#${env.BUILD_NUMBER} - ${currentBuild.currentResult} \n\n Check console output at ${env.BUILD_URL} to view results",  bcc: '', body: 'JenkinsSampleBody', cc: '', from: '', replyTo: '', subject: 'JenkinsSampleSubject', to: 'anca.lupu03@gmail.com', subject: 'JenkinsSampleSubject', to: 'anca.lupu03@gmail.com'
      }
  }
}
}
