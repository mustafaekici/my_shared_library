//If called with a block, the call method will receive a Closure.
// The type should be defined explicitly to clarify the intent of the step,
// for example:
// vars/windows.groovy
def call(Closure body) {
    node('windows') {
        body()
    }
}

//The Pipeline can then use this variable like 
//any built-in step which accepts a block:
// windows {
//     bat "cmd /?"
// }