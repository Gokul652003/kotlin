// 21: Sealed classes
// A restricted hierarchy — all subtypes known to the compiler.
// Combine with when for exhaustive (no-else) handling.

sealed class Result<out T> {
    data class Success<T>(val value: T) : Result<T>()
    data class Error(val message: String) : Result<Nothing>()
}

fun handle(r: Result<Int>): String = when (r) {
    is Result.Success -> "Got ${r.value}"
    is Result.Error -> "Failed: ${r.message}"
}

fun main() {
    println(handle(Result.Success(42)))     // Got 42
    println(handle(Result.Error("timeout"))) // Failed: timeout
}

// Exercise:
// 1. Add a Loading state to Result and handle it in the when.
// 2. Model a UiState with Loading / Ready / Error and write a renderer.
// TODO: sealed class UiState { object Loading : UiState(); data class Ready(val data: String) : UiState(); data class Error(val message: String) : UiState() }