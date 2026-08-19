// 07: Cancellation
// Cancellation is cooperative: a coroutine must check `isActive` (or call a
// suspending function like delay, which checks automatically) to notice it
// was cancelled. Tight loops that never suspend won't be cancellable.

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        var i = 0
        while (isActive) {          // cooperative check
            println("working $i")
            i++
            delay(100L)
        }
    }

    delay(350L)
    println("Cancelling...")
    job.cancel()
    job.join()
    println("Cancelled")
}

// Exercise:
// 1. Replace the `while (isActive)` loop with a plain `while (true)` loop
//    that has no delay/suspension inside — notice job.cancel() no longer
//    stops it promptly. Revert once you've seen the difference.
// TODO: experiment, then put isActive/delay back
