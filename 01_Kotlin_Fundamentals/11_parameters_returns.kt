// 11: Function parameters and return values
// Types in, types out. Unit means "returns nothing".

fun add(a: Int, b: Int): Int = a + b

fun greet(name: String) {           // returns Unit (omitted)
    println("Hi, $name")
}

fun main() {
    println(add(3, 4))      // 7
    greet("Gokul")
}

// Exercise:
// 1. Function `multiply(a, b)` returning Int.
// 2. Function `describeAge(age)` returning a String about the age group.
// TODO: fun multiply(a: Int, b: Int): Int = a * b