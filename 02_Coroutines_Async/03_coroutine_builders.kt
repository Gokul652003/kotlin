// 03: Coroutine builders
// launch  -> fire-and-forget, returns a Job, doesn't return a value
// async   -> returns a Deferred<T>, use .await() to get the result
// runBlocking -> bridges blocking code (like main) into coroutine world

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        delay(200L)
        println("launch: done")
    }
    job.join()                   // wait for it to finish

    val deferred: Deferred<Int> = async {
        delay(200L)
        42
    }
    val result = deferred.await()
    println("async result: $result")
}

// Exercise:
// 1. Start two `async` blocks that each delay 300L and return a number.
// 2. Await both and print their sum.
// TODO: val a = async { delay(300L); 10 }; val b = async { delay(300L); 20 }
// TODO: println(a.await() + b.await())
