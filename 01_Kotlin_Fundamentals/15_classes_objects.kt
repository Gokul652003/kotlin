// 15: Classes and objects
// Blueprint (class) -> instances (objects) with properties and methods.

class Car {
    var color = "red"
    var speed = 0

    fun accelerate() {
        speed += 10
    }
}

fun main() {
    val myCar = Car()
    println(myCar.color)     // red
    myCar.accelerate()
    println(myCar.speed)     // 10

    val other = Car()        // independent instance
    println(other.speed)     // 0
}

// Exercise:
// 1. Add a `brake()` method that reduces speed.
// 2. Create a `Dog` class with a name property and a bark() method.
// TODO: