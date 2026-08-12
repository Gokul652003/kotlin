// 16: Constructors
// Primary constructor with val/var -> automatic properties. init blocks. Secondary constructors.

class Car(val color: String, val brand: String = "unknown") {
    var speed = 0

    init {
        println("Car $color created")
    }

    constructor(color: String, brand: String, speed: Int) : this(color, brand) {
        this.speed = speed
    }
}

fun main() {
    val c1 = Car("red")
    println(c1.brand)        // unknown
    val c2 = Car("blue", "Toyota", 60)
    println(c2.speed)        // 60
}

// Exercise:
// 1. Create a Person class with name and age in the primary constructor.
// 2. Add a secondary constructor that defaults the age.
// TODO: class Person(val name: String, val age: Int = 0)