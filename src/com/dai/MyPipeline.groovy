package com.dai
class MyPipeline{

    def pipeline
    
    MyPipeline(pipeline) {this.pipeline=pipeline}
    
    def foo(){
        // steps.pipeline {
        pipeline.agent=any
        pipeline.stages{
            steps.stage("Run factory for statemachine"){
               
                }
            }
        
    }
    
    
}