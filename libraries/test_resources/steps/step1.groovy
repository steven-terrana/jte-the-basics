void call(){
  println "step 1 from test_resources library"
  println resource("somethingElse.json")
  node{
    sh resource("someresource.sh")
  }
  println resource("nestedDirectory/someOtherFile.txt")
}
