@BeforeStep({ context.step.equals("deploy_to") })
void call(context){
  println "running before ${context.step}"
  println "args -> ${context.args}" 
  def app_env = context.args.first() 
  
  println "getting information about ${app_env.short_name}"
}
