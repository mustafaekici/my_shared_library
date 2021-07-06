package com.dai
public class MyPipeline{

    def steps
    
    MyPipeline(steps) {this.steps=steps}
    
    public def foo(){
        steps.pipeline {
        steps.agent any
        steps.stages{
            steps.stage("Run factory for statemachine"){
               
                }
            }
        }
    }
    
    
}