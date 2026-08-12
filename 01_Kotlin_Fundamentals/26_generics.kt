// 26: Generics
// One definition, any type. Bounds: T : SomeType.

class Box<T>(val value: T)

fun <T> repeatValue(v: T, times: Int): List<T> = List(times) { v }

fun <T : Comparable<T>> maxVal(a: T, b: T): T = if (a > b) a else b

fun main() {
    val intBox = Box(42)          // Box<Int>
    val strBox = Box("hello")     // Box<String>
    println(repeatValue("a", 3))  // [a, a, a]
    println(maxVal(3, 7))         // 7
    println(maxVal("apple", "banana"))  // banana
}

// Exercise:
// 1. Make a generic `Pair<A, B>` with two different types.
// 2. Write `safeFirst(list)` that returns the first element or null.
// TODO: data class Pair2<A, B>(val a: A, val b: B)