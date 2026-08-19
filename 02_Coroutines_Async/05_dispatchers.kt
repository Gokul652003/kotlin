// 05: Dispatchers
// Dispatchers decide which thread(s) a coroutine runs on:
//   Dispatchers.Main    -> UI thread (Android/Swing)
//   Dispatchers.IO      -> blocking I/O, network/disk calls
//   Dispatchers.Default -> CPU-heavy work
// `withContext` switches the dispatcher for a block and returns its result.

import kotlinx.coroutines.*

suspend fun readFromDisk(): String = withContext(Dispatchers.IO) {
    println("Reading on: ${Thread.currentThread().name}")
    "file contents"
}

fun main() = runBlocking {
    println("Main on: ${Thread.currentThread().name}")
    val data = readFromDisk()
    println("Got: $data")
}

// Exercise:
// 1. Write `suspend fun computeSquares(): List<Int>` that runs on
//    Dispatchers.Default and returns (1..5).map { it * it }.
// TODO: withContext(Dispatchers.Default) { (1..5).map { it * it } }
