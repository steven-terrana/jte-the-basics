@BeforeStep({ context.step.equals("deploy_to") })
void call(context){
  println "running before ${context.step}"
  println "args -> ${context.args}" 
}
