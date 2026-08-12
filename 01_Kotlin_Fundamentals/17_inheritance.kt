// 17: Inheritance
// open class, : Parent(...), override, super, polymorphism

open class Animal(val name: String) {
    open fun speak() {
        println("$name makes a sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun speak() {
        super.speak()
        println("$name barks")
    }
}

fun main() {
    val pet: Animal = Dog("Rex")
    pet.speak()
}

// Exercise:
// 1. Create a Bird subclass that overrides speak() to say "chirp".
// 2. Add a `move()` method to Animal and override it in a Fish subclass.
// TODO: class Bird(name: String) : Animal(name) { override fun speak() { println("$name chirps") } }