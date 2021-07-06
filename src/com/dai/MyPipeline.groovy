package com.dai
public class mypipeline{

    def steps
    
    mypipeline(steps) {this.steps=steps}
    
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