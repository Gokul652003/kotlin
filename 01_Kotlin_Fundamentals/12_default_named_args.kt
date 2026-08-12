// 12: Default and named arguments
// Call with fewer args, or call in any order using names.

fun greet(name: String, greeting: String = "Hello") {
    println("$greeting, $name!")
}

fun createOrder(item: String, qty: Int = 1, urgent: Boolean = false): String {
    return "$qty x $item" + if (urgent) " (URGENT)" else ""
}

fun main() {
    greet("Gokul")                        // Hello, Gokul!
    greet("Gokul", "Namaste")             // Namaste, Gokul!
    println(createOrder(item = "Laptop", urgent = true))
    println(createOrder("Mouse", qty = 3))
}

// Exercise:
// 1. Add a parameter `tone` (default "normal") to greet and use it.
// 2. Call createOrder only with item and qty, in qty-then-item order.
// TODO: