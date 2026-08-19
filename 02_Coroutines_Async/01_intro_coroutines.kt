// 01: Intro to coroutines
// A coroutine is a lightweight, suspendable unit of work. `runBlocking`
// starts one and blocks the current thread until it (and its children)
// finish — mainly useful for `main()` and tests. `launch` starts a new
// coroutine without blocking the caller.

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start")

    launch {
        delay(1000L)          // suspends this coroutine only, not the thread
        println("World!")     // prints after the delay
    }

    println("Hello,")         // prints immediately, before "World!"
}

// Exercise:
// 1. Add a second `launch` that delays 500L and prints "Kotlin".
//    Expected order: "Hello," -> "Kotlin" -> "World!"
// TODO: launch { delay(500L); println("Kotlin") }
