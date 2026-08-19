// 06: Job lifecycle
// launch returns a Job. It moves through states: New -> Active ->
// Completing -> Completed (or Cancelled). join() suspends until it's done.

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        delay(300L)
        println("Job running: isActive=$isActive")
    }

    println("isActive=${job.isActive}, isCompleted=${job.isCompleted}")
    job.join()
    println("isActive=${job.isActive}, isCompleted=${job.isCompleted}")
}

// Exercise:
// 1. Store two launch Jobs in a list and use `joinAll(*jobs.toTypedArray())`
//    (from kotlinx.coroutines) to wait for both at once.
// TODO: val jobs = listOf(launch { delay(100L) }, launch { delay(200L) })
// TODO: jobs.joinAll()
