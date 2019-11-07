import groovy.transform.Field

@Field def stepsInvoked = []

@BeforeStep
void before(context){
  println stepsInvoked
  stepsInvoked[context.step] = [
    startTime: currentBuild.startTimeInMillis
  ]
}

@AfterStep
void after(context){
  stepsInvoked[context.step].endTime = currentBuild.startTimeInMillis
}

@CleanUp
void done(context){
  println stepsInvoked
}
