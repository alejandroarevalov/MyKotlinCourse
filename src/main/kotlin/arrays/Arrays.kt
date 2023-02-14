package arrays

fun main() {
    // Arrays in general
    var anArray = arrayOf(1, 2, 3, "Is this possible?") //Can combine multiple data types
    println(anArray[0])
    println(anArray[1])
    println(anArray[2])
    println(anArray[3])

    //Integer Arrays
    var anIntegerArray = intArrayOf(2, 5, 41, 0) // Can only contain Integers
    println(anIntegerArray[0])
    println(anIntegerArray[1])
    println(anIntegerArray[2])
    println(anIntegerArray[3])

    val aStringArray : Array<String> = arrayOf("Str1", "Str2") // Can only contain Strings
    println(aStringArray[0])
    println(aStringArray[1])
    // println(aStringArray[2]) --> Throws an ArrayIndexOutOfBoundsException
}