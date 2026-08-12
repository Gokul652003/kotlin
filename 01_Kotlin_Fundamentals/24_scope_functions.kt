// 24: Scope functions
// let, run, with, apply, also — run code in an object's context.
// Pick by: object back? (apply/also) or result? (let/run/with). `it` vs `this`.

data class Person(var name: String, var age: Int)

fun main() {
    val person = Person("", 0).apply {
        name = "Gokul"
        age = 30
    }
    println(person)   // Person(name=Gokul, age=30)

    val doubled = "42".let { it.toInt() * 2 }
    println(doubled)  // 84

    val length = "Kotlin".run { this.length }
    println(length)   // 6

    with(person) {
        println("$name is $age")
    }

    person.also { println("Logging: ${it.name}") }

    // Exercise:
    // 1. Use let with a nullable string so nothing runs when it's null.
    // 2. Use apply to set up a mutable list with three numbers.
    // TODO: val maybe: String? = null; maybe?.let { println(it.uppercase()) }
}