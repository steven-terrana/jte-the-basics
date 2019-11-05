void call(app_env){
    println "performing a deployment through ansible.."
    app_env.ip_addresses.each{ ip ->
        println "deploying to ${ip}"
    }
}
