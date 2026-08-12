// 20: Enum classes
// A fixed set of constants — can carry data and behavior.

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

enum class Operation {
    ADD { override fun apply(a: Int, b: Int) = a + b },
    MULTIPLY { override fun apply(a: Int, b: Int) = a * b };

    abstract fun apply(a: Int, b: Int): Int
}

fun describe(dir: Direction) = when (dir) {
    Direction.NORTH -> "up"
    Direction.SOUTH -> "down"
    Direction.EAST -> "right"
    Direction.WEST -> "left"
}

fun main() {
    println(describe(Direction.EAST))    // right
    println(Operation.MULTIPLY.apply(3, 4))  // 12
    println(Direction.values().size)     // 4
}

// Exercise:
// 1. Create a Color enum with RED, GREEN, BLUE and a hex property.
// 2. Add a Status enum (Started, Running, Done) and print its name.
// TODO: enum class Color(val hex: String) { RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF") }