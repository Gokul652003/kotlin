# Phase 2 — Coroutines & Async

Hands-on practice files, one per topic, continuing from Phase 1
(`01_Kotlin_Fundamentals`). Same format: examples plus `// TODO` exercises.

## How to run

Coroutines need the `kotlinx-coroutines-core` dependency. Easiest way to run
a single file with `kotlinc`:

```bash
kotlinc -cp $(kotlinc -version 2>&1 >/dev/null; echo) \
  01_intro_coroutines.kt -include-runtime -d out.jar
```

In practice it's simplest to open this folder in IntelliJ / Android Studio
with a Gradle module that has:

```kotlin
dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
}
```

Then just run each file's `main()`.

## Progress checklist

### Module 1 · Coroutine Basics
- [ ] `01_intro_coroutines.kt` — what coroutines are, runBlocking, launch
- [ ] `02_suspend_functions.kt` — the `suspend` keyword, delay
- [ ] `03_coroutine_builders.kt` — launch vs async vs runBlocking

### Module 2 · Scope & Context
- [ ] `04_coroutine_scope.kt` — CoroutineScope, coroutineScope{}, GlobalScope
- [ ] `05_dispatchers.kt` — Dispatchers.Main/IO/Default, withContext
- [ ] `06_job_lifecycle.kt` — Job, lifecycle states, join()

### Module 3 · Structured Concurrency
- [ ] `07_cancellation.kt` — cancelling coroutines, cooperative cancellation
- [ ] `08_timeouts.kt` — withTimeout, withTimeoutOrNull
- [ ] `09_exception_handling.kt` — try/catch, CoroutineExceptionHandler, SupervisorJob

### Module 4 · Async Patterns
- [ ] `10_async_await.kt` — async/await, Deferred, parallel decomposition
- [ ] `11_sequential_vs_concurrent.kt` — comparing timing of sequential vs concurrent work

### Module 5 · Flow Basics
- [ ] `12_flow_basics.kt` — Flow builder, collect
- [ ] `13_flow_operators.kt` — map, filter, transform, and friends
- [ ] `14_flow_context_buffering.kt` — flowOn, buffer, conflate

### Module 6 · Advanced Flow & Channels
- [ ] `15_stateflow.kt` — StateFlow
- [ ] `16_sharedflow.kt` — SharedFlow
- [ ] `17_channels.kt` — Channel, produce, actor

## Tip

Finish a file, tick its checkbox here, and also mark the matching lesson
"complete" in the Course Platform so both stay in sync.
