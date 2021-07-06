// Internally, scripts in the vars directory are instantiated on-demand as singletons.
//  This allows multiple methods to be defined in a single .groovy file for convenience. For example:

//vars/log.groovy
def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}


// @Library('utils') _

// log.info 'Starting'
// log.warning 'Nothing to do!'