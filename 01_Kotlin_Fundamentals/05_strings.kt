// 05: Strings
// Templates, common functions, comparison

fun main() {
    val fruit = "apple"
    val count = 5
    println("$fruit: $count")              // apple: 5
    println("I have ${count + 1} apples")  // I have 6 apples

    val s = "  Kotlin Fundamentals  "
    println(s.trim().uppercase().length)

    // Exercise:
    // 1. Print "HELLO" — first letter capital, rest upper.
    // 2. Check if your name contains the letter 'o'.
    // TODO: val name = "gokul"
    // TODO: println(name.replaceFirstChar { it.uppercase() })
    // TODO: println(name.contains('o'))
}