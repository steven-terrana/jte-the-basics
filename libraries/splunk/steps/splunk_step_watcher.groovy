@BeforeStep
void before(){
  println "Splunk: running before the ${hookContext.library} library's ${hookContext.step} step" 
}

@AfterStep({ config.afterSteps ? (hookContext.step in config.afterSteps) : true })
void after(){
  println "Splunk: running after the ${hookContext.library} library's ${hookContext.step} step" 
}

@AfterStep({ currentBuild.result.toString() == "FAILURE" })
void afterFailure(){
  println "Splunk: running after the ${hookContext.library} library's ${hookContext.step} step failure"  
}
