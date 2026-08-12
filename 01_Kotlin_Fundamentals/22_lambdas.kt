// 22: Lambda functions
// Anonymous functions: { params -> body }. The last expression is the result.

val add: (Int, Int) -> Int = { a, b -> a + b }
val square: (Int) -> Int = { it * it }

fun apply(op: (Int, Int) -> Int, a: Int, b: Int): Int = op(a, b)

fun main() {
    println(add(3, 4))              // 7
    println(square(6))              // 36
    println(apply({ x, y -> x * y }, 3, 4))  // 12
    println(apply({ x, y -> x - y }, 3, 4))  // -1
}

// Exercise:
// 1. Write a lambda that concatenates two strings.
// 2. Make a lambda that returns "even"/"odd" for an Int.
// TODO: val concat: (String, String) -> String = { a, b -> a + b }