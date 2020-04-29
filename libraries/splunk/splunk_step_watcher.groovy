@BeforeStep({ currentBuild.getDisplayName().equals("#30") })
void before(context){
  println currentBuild.getDisplayName()
  println "Splunk: running before the ${context.library} library's ${context.step} step" 
}

@AfterStep({ config.afterSteps ?  (context.step in config.afterSteps) : true })
void after(context){
  println "Splunk: running after the ${context.library} library's ${context.step} step" 
}
