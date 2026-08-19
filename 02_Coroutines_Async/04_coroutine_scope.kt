// 04: CoroutineScope
// A scope defines the lifetime for the coroutines launched in it.
// `coroutineScope { }` suspends until all its children finish.
// GlobalScope lives for the whole app — avoid it outside of demos like this.

import kotlinx.coroutines.*

suspend fun loadDashboard() = coroutineScope {
    launch {
        delay(300L)
        println("Loaded profile")
    }
    launch {
        delay(200L)
        println("Loaded settings")
    }
    println("Dashboard scope waiting for children...")
}

fun main() = runBlocking {
    loadDashboard()
    println("All dashboard data ready")
}

// Exercise:
// 1. Add a third `launch` inside loadDashboard() that loads "notifications"
//    after delaying 100L.
// TODO: launch { delay(100L); println("Loaded notifications") }
