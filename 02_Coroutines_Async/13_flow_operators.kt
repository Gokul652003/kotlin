// 13: Flow operators
// Flows support the familiar collection operators — map, filter, take,
// onEach — but lazily, applied as each value flows through.

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    (1..10).asFlow()
        .filter { it % 2 == 0 }
        .map { it * it }
        .onEach { println("Processing: $it") }
        .take(3)
        .collect { println("Collected: $it") }
}

// Exercise:
// 1. Use `reduce` (a terminal operator) to sum (1..5).asFlow() and print
//    the total.
// TODO: val sum = (1..5).asFlow().reduce { acc, v -> acc + v }
