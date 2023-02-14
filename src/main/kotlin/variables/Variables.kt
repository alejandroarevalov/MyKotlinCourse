package variables

fun main() {
    //Variables
    val name = "Java"
    var language = "Kotlin"
    language = "Python"
    // name = "C++" --> Not possible. Variables with val are immutable
    val variableWithType : String = "I am a String"
    var anotherVariableWithType : Int = 3
    var variableWithNoType = true // Can be reassigned, but to same type values
    variableWithNoType = false

    // Null safety variables
    var nullSafeVariable : String? = "Java"
    nullSafeVariable = null
    var nonNullSafeVariable : String = "Kotlin"
    //nonNullSafeVariable = null --> Null can not be a value of a non-null type String

}