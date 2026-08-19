// 12: Flow basics
// Flow is a cold, asynchronous stream of values. Nothing runs until a
// collector calls `collect` — each collection re-runs the builder block.

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun numbers(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(200L)
        emit(i)             // emit a value into the flow
    }
}

fun main() = runBlocking {
    println("Calling numbers()...")
    val flow = numbers()      // nothing happens yet, flow is cold

    println("Collecting...")
    flow.collect { value -> println("Got: $value") }
}

// Exercise:
// 1. Collect `numbers()` a second time in the same main() and confirm it
//    emits 1, 2, 3 again from scratch (proving it's cold).
// TODO: flow.collect { println("Again: $it") }
