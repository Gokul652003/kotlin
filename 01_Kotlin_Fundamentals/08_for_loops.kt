// 08: for loops
// Ranges (.. inclusive, until exclusive), step, downTo, collections

fun main() {
    for (i in 1..5) print("$i ")           // 1 2 3 4 5
    println()
    for (i in 10 downTo 1 step 3) print("$i ")  // 10 7 4 1
    println()

    val fruits = listOf("apple", "banana", "cherry")
    for ((index, f) in fruits.withIndex()) {
        println("$index: $f")
    }

    // Exercise:
    // 1. Print only even numbers from 1..20.
    // 2. Print each character of your name.
    // TODO: for (i in 1..20) if (i % 2 == 0) print("$i ")
}