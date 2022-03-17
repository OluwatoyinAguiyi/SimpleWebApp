node {
   stage('Preparation') {
      git 'https://github.com/OluwatoyinAguiyi/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}