// 19: Data classes
// equals, hashCode, toString, copy, destructuring for free.

data class Point(val x: Int, val y: Int)

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(1, 2)
    val p3 = p1.copy(y = 99)

    println(p1 == p2)     // true — value equality
    println(p1)           // Point(x=1, y=2)
    println(p3)           // Point(x=1, y=99)

    val (x, y) = p1       // destructuring
    println("x=$x y=$y")
}

// Exercise:
// 1. Make a data class Book(title, author, pages) and compare two instances.
// 2. Destructure a 3-field data class.
// TODO: data class Book(val title: String, val author: String, val pages: Int)