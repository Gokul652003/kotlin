// 15: StateFlow
// StateFlow is a hot, observable state holder — it always has a current
// value and replays it to new collectors. Common for UI state.

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class CounterViewModel {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count

    fun increment() {
        _count.value += 1
    }
}

fun main() = runBlocking {
    val vm = CounterViewModel()

    val job = launch {
        vm.count.collect { println("Count is now: $it") }
    }

    delay(100L)
    vm.increment()
    delay(100L)
    vm.increment()
    delay(100L)

    job.cancel()
}

// Exercise:
// 1. Add a `reset()` function to CounterViewModel that sets _count.value = 0
//    and call it after the two increments above.
// TODO: fun reset() { _count.value = 0 }
