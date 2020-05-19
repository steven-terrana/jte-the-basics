void call(){
    stage("Gradle: Build"){
        if(config.shouldFail){
            error "gradle build: failing because of configuration" 
        }else{
            println "build step from gradle library" 
        }
    }
}
