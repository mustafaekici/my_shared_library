package com.dai

def PythonLinter(){
    return true;
}

def Blackduck(){
    return true;
}

def Documentation(){
    return true;
}

def ArtifactoryCleanup(){
    return true;
}

def foo(){
   pipeline {
    agent any
    stages{
        stage("Run factory for statemachine"){
          
        }
    }
}
    
}

return this