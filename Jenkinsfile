pipeline{
 agent any
  stages{
    stage('verift git branch'){
      
      steps{
      echo '$GIT_BRANCH'
       sh "cd jenkinspractice && mvn clean install"
      }
    }
    stage('good bye'){
      
      steps{
      echo 'goodbye'
      }
    }
  }
  
}
