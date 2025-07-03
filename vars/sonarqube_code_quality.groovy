def call(){
  timeout(time: 6, unit: "MINUTES"){
      waitForQualityGate abortPipeline: false
  }
}
