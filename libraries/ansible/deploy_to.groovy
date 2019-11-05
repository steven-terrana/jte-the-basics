void call(app_env){
    stage("Deploy To: ${app_env.long_name}"){
        println "performing a deployment through ansible.."
        app_env.ip_addresses.each{ ip ->
            println "deploying to ${ip}"
        }
    }
}
