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
    agent none

    parameters {
        string (
            name: 'Jira_Key',
            defaultValue: "",
            description: 'OPTIONAL. Add the Jira ticket to the Testrun / Real deployment. E.g ITFADAS-1501'
        )

        string (
            name: 'API',
            defaultValue: "",
            description: 'OPTIONAL. Docu https://gsep.daimler.com/confluence/x/dymhGw Comma separated list of key-value pairs with double "::". E.g: Target_Env::DASK_MTC_TEST, Jira_Key::ITFADAS-1501'
        )

        choice (
            name: "DEBUG", choices: ['', 'false', 'true'], description: "Set True to verbose the console output."
        )
    }

    options {
        buildDiscarder(logRotator(numToKeepStr: '20'))
        timeout(time: 120, unit: 'MINUTES')
        disableConcurrentBuilds()
        timestamps()
    }
}

return this