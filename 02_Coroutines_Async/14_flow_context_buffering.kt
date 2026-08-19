// 14: Flow context & buffering
// flowOn switches which dispatcher the upstream (producer) runs on.
// buffer lets the producer keep emitting without waiting for the
// collector; conflate drops intermediate values if the collector is slow.

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun producer(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100L)
        println("Emitting $i on ${Thread.currentThread().name}")
        emit(i)
    }
}.flowOn(Dispatchers.Default)

fun main() = runBlocking {
    producer()
        .buffer()               // producer doesn't wait for slow collector
        .collect { value ->
            delay(300L)          // slow collector
            println("Collected $value on ${Thread.currentThread().name}")
        }
}

// Exercise:
// 1. Swap `.buffer()` for `.conflate()` and observe that some intermediate
//    values get skipped because the collector is slower than the producer.
// TODO: .conflate()
