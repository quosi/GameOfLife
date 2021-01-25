
// *******************************************************************************************
// * Implementation of General Helpers 
// *******************************************************************************************

// return true if agent is unix
def isUnixNode() {
    return "${env.IS_UNIX}" == "true"
}
// return true if agent is mac
def isMac() {
    return "${env.IS_MAC}" == "true"
}

// return python binary name/path
def getPython() {
    if ( isUnixNode() ) {
        return "python3"
    }
    return "python"
}