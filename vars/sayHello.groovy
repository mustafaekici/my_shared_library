// vars/sayHello.groovy
def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name}."
}

//The Pipeline would then be able to reference and invoke this variable:
// sayHello 'Joe'
// sayHello() /* invoke with default arguments */