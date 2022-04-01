pipeline{
 agent any
  stages{
    stage('verift git branch'){
      steps{
      echo "$GIT_BRANCH"
       sh "cd jenkinspractice && mvn clean install"
      }
    }
    stage('Docker Build'){
      steps{
      echo '------------------ Docker build started ---------------------'
     sh 'pwd'
     sh 'cd jenkinspractice/'
     sh 'pwd'
     sh '''cd jenkinspractice/ docker images -a
     docker build -t jenkinspractice .
     docker images -a
     cd ..
    '''
      echo '------------------ Docker build Ended ------------------------' 
      }
    }
   stage('Start test app') {
         steps {
            sh '''
            cd jenkinspractice
            chmod 777 jenkinspractice/scripts/test_container.sh
            ./scripts/test_container.sh
            '''
         }
         post {
            success {
               echo "App started successfully :)"
            }
            failure {
               echo "App failed to start :("
            }
         }
      }
  }
  
}
