// 10: async/await — parallel decomposition
// Use async when you need a result back, and start several at once to run
// independent work concurrently instead of one after another.

import kotlinx.coroutines.*

suspend fun fetchWeather(): String {
    delay(500L)
    return "Sunny"
}

suspend fun fetchNews(): String {
    delay(500L)
    return "Kotlin 2.0 released"
}

fun main() = runBlocking {
    val weather = async { fetchWeather() }
    val news = async { fetchNews() }

    // Both run concurrently; total time ~500ms, not ~1000ms.
    println("Weather: ${weather.await()}, News: ${news.await()}")
}

// Exercise:
// 1. Add a third async call `fetchSports()` (delay 500L, return "Draw")
//    and print all three results.
// TODO: val sports = async { delay(500L); "Draw" }
