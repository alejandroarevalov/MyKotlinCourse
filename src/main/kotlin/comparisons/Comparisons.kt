package comparisons

fun main() {
    // if-else statement
    val age = 23
    if (age >= 21) {
        println("You are allowed to drink in the USA")
    } else {
        println("You are NOT allowed to drink in the USA")
    }

    // if-else as variable
    val anotherAge = 14
    val result = if (anotherAge >= 21) "You are allowed to drink" else "You are NOT allowed to drink in the USA"
    println(result)

    // Multiple comparisons using 'when'
    println("What day is today?")
    val day = readLine() //Input from the stdin
    when(day) {
        "Monday" -> println("Chicken")
        "Wednesday" -> println("Pork")
        "Thursday" -> println("Salmon")
        else -> println("Steak")
    }

    // When expression with variable
    val meal = when(day) {
        "Monday" -> "Chicken"
        "Wednesday" -> "Pork"
        "Thursday" -> "Salmon"
        else -> "Steak"
    }
    println("You should eat $meal today")

    // Multiple conditions evaluation in the same line using 'when'
    val anotherMeal = when(day) {
        "Monday", "Tuesday" -> "Chicken"
        "Wednesday", "Friday" -> "Pork"
        "Thursday" -> "Salmon"
        else -> "Steak"
    }

    println("Ohhh, what the hell... Let's eat $anotherMeal")

    // When without arguments (Compiler highlights it as a warning - seems to be a bad practice
    val food = when {
        day == "Monday" -> "Chicken"
        day == "Friday" -> "Salmon"
        day == "Sunday" -> "Steak"
        else -> "Bacon"
    }
    println("When with no arguments suggests that we should eat $food")
}