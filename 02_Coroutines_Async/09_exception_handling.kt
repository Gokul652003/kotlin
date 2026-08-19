// 09: Exception handling
// Plain try/catch works inside a coroutine like normal code. For
// uncaught exceptions from `launch`, install a CoroutineExceptionHandler.
// SupervisorJob stops one child's failure from cancelling its siblings.

import kotlinx.coroutines.*

fun main() = runBlocking {
    val handler = CoroutineExceptionHandler { _, e ->
        println("Caught: ${e.message}")
    }

    // Without SupervisorJob, one failing child cancels all siblings.
    supervisorScope {
        launch(handler) {
            throw RuntimeException("boom")
        }
        launch {
            delay(200L)
            println("This still runs, thanks to supervisorScope")
        }
    }
}

// Exercise:
// 1. Wrap `slowOperation()` from file 08 in a try/catch inside a coroutine
//    and catch a generic Exception, printing "recovered".
// TODO: try { throw RuntimeException() } catch (e: Exception) { println("recovered") }
