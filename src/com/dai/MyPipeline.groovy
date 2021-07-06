package com.dai
class MyPipeline{

    def steps
    
    MyPipeline(steps) {this.steps=steps}
    
    def foo(){
        // steps.pipeline {
        // steps.agent any
        steps.stages{
            steps.stage("Run factory for statemachine"){
               
                }
            }
        }
    }
    
    
}