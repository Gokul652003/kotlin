// 02: val and var
// val = read-only (assigned once). var = mutable (can be reassigned).

fun main() {
    val name = "Gokul"      // cannot be reassigned
    var score = 42          // can change

    score += 10
    println("$name scored $score")

    // Exercise:
    // 1. Try reassigning `name` — see the compiler error, then fix it.
    // 2. Create a val for your age and a var for your current level in Kotlin.
    // TODO: val age = ___
    // TODO: var level = ___
    // TODO: println(...)
}