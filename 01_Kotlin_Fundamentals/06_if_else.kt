// 06: if / else
// if is an EXPRESSION in Kotlin — it returns a value.

fun main() {
    val score = 75

    val grade = if (score >= 90) "A"
        else if (score >= 75) "B"
        else if (score >= 60) "C"
        else "F"
    println("Grade: $grade")

    // Exercise:
    // 1. Check a temperature: above 30 = hot, above 20 = warm, else cold.
    // 2. Return the larger of two numbers using if.
    // TODO: val temp = 28
    // TODO: val weather = if (temp > 30) "hot" else if (temp > 20) "warm" else "cold"
}