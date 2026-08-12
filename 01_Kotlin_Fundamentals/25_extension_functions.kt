// 25: Extension functions
// Add functions to types you don't own. `this` is the receiver.

fun String.isPalindrome(): Boolean = this == this.reversed()

fun Int.isEven(): Boolean = this % 2 == 0

fun main() {
    println("racecar".isPalindrome())  // true
    println("hello".isPalindrome())    // false
    println(4.isEven())                // true
    println(listOf(1, 2, 3, 4).filter { it.isEven() })  // [2, 4]
}

// Exercise:
// 1. Add an extension `String.addExclamation()` returning "$this!".
// 2. Add `Int.double()` and use it on 5.
// TODO: fun Int.double(): Int = this * 2