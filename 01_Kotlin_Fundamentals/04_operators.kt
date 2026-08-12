// 04: Operators
// Arithmetic (+, -, *, /, %), comparison, logical, assignment

fun main() {
    println("10 / 3 = ${10 / 3}")       // 3  (Int division!)
    println("10.0 / 3 = ${10.0 / 3}")   // 3.333...
    println("10 % 3 = ${10 % 3}")       // 1

    val isEven = 8 % 2 == 0             // true
    val both = true && false            // false
    val either = true || false          // true

    // Exercise:
    // 1. Check if the number 17 is even or odd.
    // 2. Compute (5 + 3) * 2 and 2 + 3 * 2 — notice the difference.
    // TODO: val seventeen = 17
    // TODO: println("17 is even: ${seventeen % 2 == 0}")
}