node {
   stage('Preparation') {
      git 'https://github.com/OluwatoyinAguiyi/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
   stage('Deploy') {
     sh "git push https://git.heroku.com/still-brook-79897.git master"
   }
}