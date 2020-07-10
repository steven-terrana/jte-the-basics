void call(){
    stage("Gradle: Build"){ 
        node{
           sh "gradle -v"    
        }
    }
}
