// 10: Functions
// fun declarations, main(), single-expression functions

fun greet() {
    println("Hello!")
}

fun square(x: Int) = x * x   // single expression, inferred return type

fun main() {
    greet()
    println(square(5))
}

// Exercise:
// 1. Write a function `isAdult` that returns true if age >= 18.
// 2. Write a single-expression function that doubles a number.
// TODO: fun isAdult(age: Int): Boolean = age >= 18