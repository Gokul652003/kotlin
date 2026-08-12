// 07: when
// Kotlin's switch — matches values, ranges, and types.

fun main() {
    val day = "Fri"

    val type = when (day) {
        "Mon", "Tue", "Wed", "Thu" -> "weekday"
        "Fri" -> "tgif"
        "Sat", "Sun" -> "weekend"
        else -> "unknown"
    }
    println("$day is a $type")

    // Exercise:
    // 1. Map a number 1..5 to words "one".."five".
    // 2. Describe any value: Int / String / Double.
    // TODO: fun describe(x: Any): String = when (x) { ... }
}