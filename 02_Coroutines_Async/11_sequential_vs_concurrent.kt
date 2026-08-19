// 11: Sequential vs concurrent
// Calling suspend functions one after another runs them sequentially.
// Wrapping them in separate `async` blocks runs them concurrently.

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun task(id: Int): Int {
    delay(300L)
    return id * id
}

fun main() = runBlocking {
    val sequentialTime = measureTimeMillis {
        val a = task(1)
        val b = task(2)
        println("Sequential: $a, $b")
    }
    println("Sequential took ${sequentialTime}ms")   // ~600ms

    val concurrentTime = measureTimeMillis {
        val a = async { task(1) }
        val b = async { task(2) }
        println("Concurrent: ${a.await()}, ${b.await()}")
    }
    println("Concurrent took ${concurrentTime}ms")   // ~300ms
}

// Exercise:
// 1. Add a third task() call to both blocks and confirm sequential grows to
//    ~900ms while concurrent stays around ~300ms.
// TODO: val c = async { task(3) } in the concurrent block
