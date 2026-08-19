// 17: Channels
// A Channel is a pipe for sending values between coroutines — like a
// blocking queue, but suspend-based. `produce` builds a channel from a
// coroutine that sends values.

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun CoroutineScope.produceSquares(): ReceiveChannel<Int> = produce {
    for (i in 1..5) {
        delay(100L)
        send(i * i)
    }
}

fun main() = runBlocking {
    val squares = produceSquares()
    for (value in squares) {           // suspends until each value arrives
        println("Received: $value")
    }
    println("Channel closed")
}

// Exercise:
// 1. Write a plain `Channel<String>()`, send three greetings from a
//    `launch` block, then `close()` it and receive them all in a `for` loop
//    in main().
// TODO: val channel = Channel<String>()
