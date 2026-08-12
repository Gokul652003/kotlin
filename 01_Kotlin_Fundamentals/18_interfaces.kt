// 18: Interfaces
// A contract of behavior. Implement with : and override members.

interface Drivable {
    fun start()
    fun stop()
    fun honk() {              // default implementation
        println("Beep!")
    }
}

class Car : Drivable {
    override fun start() = println("Car starting")
    override fun stop() = println("Car stopping")
}

class Bike : Drivable {
    override fun start() = println("Bike ready")
    override fun stop() = println("Bike stopped")
    override fun honk() = println("Ring!")
}

fun go(d: Drivable) {
    d.start()
    d.honk()
}

fun main() {
    go(Car())
    go(Bike())
}

// Exercise:
// 1. Create a Playable interface with play() and pause().
// 2. Implement it with a MusicPlayer class.
// TODO: interface Playable { fun play(); fun pause() }