// 08: Timeouts
// withTimeout throws TimeoutCancellationException if the block takes too
// long. withTimeoutOrNull instead just returns null.

import kotlinx.coroutines.*

suspend fun slowOperation(): String {
    delay(1000L)
    return "result"
}

fun main() = runBlocking {
    val result = withTimeoutOrNull(300L) {
        slowOperation()
    }
    println("Result: $result")   // null, timed out

    try {
        withTimeout(300L) { slowOperation() }
    } catch (e: TimeoutCancellationException) {
        println("Caught timeout: ${e.message}")
    }
}

// Exercise:
// 1. Change the timeout to 1500L so slowOperation() finishes in time and
//    print the actual "result" value.
// TODO: withTimeoutOrNull(1500L) { slowOperation() }
