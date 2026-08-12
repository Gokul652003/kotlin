// 09: while / do-while
// while checks first; do-while runs at least once. break/continue control flow.

fun main() {
    var count = 0
    while (count < 3) {
        println("while count: $count")
        count++
    }

    var x = 10
    do {
        println("do-while runs once: $x")
        x++
    } while (x < 3)

    // Exercise:
    // 1. Print powers of 2 below 1000 using while.
    // 2. Use continue to skip all numbers divisible by 3 in 1..20.
    // TODO: var n = 1
    // TODO: while (n < 1000) { println(n); n *= 2 }
}