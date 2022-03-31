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
     sh '''docker images -a
     docker build -t jenkinspractice .
     docker images -a
     cd ..
    '''
      echo '------------------ Docker build Ended ------------------------' 
      }
    }
  }
  
}
