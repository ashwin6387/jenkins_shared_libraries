def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([UsernamePassword(credentialId: 'dockercred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
