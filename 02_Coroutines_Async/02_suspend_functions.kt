// 02: Suspend functions
// `suspend` marks a function that can pause and resume without blocking
// the thread. It can only be called from another suspend function or a
// coroutine builder (launch, async, runBlocking...).

import kotlinx.coroutines.*

suspend fun fetchUser(): String {
    delay(500L)                 // pretend network call
    return "Gokul"
}

suspend fun greet() {
    val name = fetchUser()      // suspends here, doesn't block the thread
    println("Hello, $name!")
}

fun main() = runBlocking {
    greet()
    println("Done")
}

// Exercise:
// 1. Write `suspend fun fetchAge(): Int` that delays 300L and returns 22.
// 2. Call both fetchUser() and fetchAge() from a new suspend fun `profile()`
//    and print "Gokul is 22".
// TODO: val age = fetchAge(); println("$name is $age")
