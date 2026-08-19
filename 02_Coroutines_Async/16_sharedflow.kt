// 16: SharedFlow
// SharedFlow is a hot stream for broadcasting events to multiple
// collectors. Unlike StateFlow it has no required current value, and you
// control replay/history with the `replay` parameter.

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class EventBus {
    private val _events = MutableSharedFlow<String>(replay = 1)
    val events: SharedFlow<String> = _events

    suspend fun send(event: String) {
        _events.emit(event)
    }
}

fun main() = runBlocking {
    val bus = EventBus()

    val job = launch {
        bus.events.collect { println("Subscriber received: $it") }
    }

    delay(100L)
    bus.send("user-logged-in")
    delay(100L)
    bus.send("user-logged-out")
    delay(100L)

    job.cancel()
}

// Exercise:
// 1. Change `replay = 1` to `replay = 0` and notice a *new* subscriber
//    started after the first send() no longer receives it.
// TODO: replay = 0
