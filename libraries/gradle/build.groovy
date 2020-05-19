void call(){
    stage("Gradle: Build"){
        if(config.shouldFail){
            error "build from the gradle library failed" 
        } else {
            println "build from the gradle library"
        }
    }
}
