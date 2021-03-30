node {
   def gradleHome
   gradleHome = tool name: 'gradle', type: 'gradle'
try{
    
   stage('SCM Chekout') {
      git credentialsId: 'git-cred', url: 'https://github.com/pawankct91/devopstest.git'
   }
   stage('Compile-Pacakge') {
       sh "${gradleHome}/bin/gradle build"
   }
   stage('Sonar Testing') {
     withSonarQubeEnv {
       sh "${gradleHome}/bin/gradle sonarqube"
     }
   }
   stage('Docker Build And Push Image') {
    sh  "docker build -f Dockerfile -t pawankct91/dev-ssm ."
    
    withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPwd')]) {
     sh "docker login -u pawankct91 -p ${dockerHubPwd}"
    }
    sh "docker push pawankct91/dev-ssm"
   }
   
    stage('Deploying On Kubernetes') {
       sh "kubectl apply -f namespaces.yaml"
       sh "kubectl apply -f dev.yaml"
   }
} catch(exc){
   mail bcc: '', body: 'Error', cc: '', from: '', replyTo: '', subject: 'Error Ocurred', to: 'pawankct91@gmail.com'

}
}
