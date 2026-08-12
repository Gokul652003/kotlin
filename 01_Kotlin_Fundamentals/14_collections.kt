// 14: Collections
// List (ordered), Set (unique), Map (key->value). Read-only vs mutable.

fun main() {
    val fruits = listOf("apple", "banana", "apple")
    println(fruits.size)             // 3 — dupes allowed
    println(fruits[1])               // banana

    val unique = setOf(1, 2, 2, 3)
    println(unique)                  // [1, 2, 3]

    val scores = mapOf("A" to 90, "B" to 78)
    println(scores["A"])             // 90

    val mutable = mutableListOf(1, 2)
    mutable.add(3)
    println(mutable)

    // Exercise:
    // 1. Build a set of your favorite languages and check if "Kotlin" is in it.
    // 2. Use filter and map on a list of numbers.
    // TODO: val langs = setOf("Kotlin", "Python", "Bash")
    // TODO: println("Kotlin" in langs)
}