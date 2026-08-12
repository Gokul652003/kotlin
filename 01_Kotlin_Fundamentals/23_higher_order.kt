// 23: Higher-order functions
// Functions that take functions or return them.

fun repeat(times: Int, action: () -> Unit) {
    for (i in 1..times) action()
}

fun multiplier(factor: Int): (Int) -> Int = { it * factor }

fun main() {
    repeat(3) { println("Hello!") }

    val timesTwo = multiplier(2)
    println(timesTwo(5))     // 10

    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.filter { it % 2 == 0 })   // [2, 4]
    println(numbers.map { it * it })          // [1, 4, 9, 16, 25]
}

// Exercise:
// 1. Write `applyAndPrint(n, f)` that applies f to n and prints the result.
// 2. Use filter+map to get squares of only odd numbers from 1..10.
// TODO: numbers.filter { it % 2 != 0 }.map { it * it }