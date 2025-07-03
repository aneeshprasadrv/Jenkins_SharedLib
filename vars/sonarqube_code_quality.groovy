def call(int timeoutMinutes = 6){
  timeout(time: timeoutMinutes, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
