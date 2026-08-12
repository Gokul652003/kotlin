# Phase 1 — Kotlin Fundamentals

Hands-on practice files, one per topic. They run in this order and mirror the
**Complete Kotlin Course** on the Course Platform (module by module).

## How to run

You need **JDK 17+** (already installed) and the **Kotlin compiler** (`kotlinc`).

```bash
# Install kotlinc if you don't have it yet
curl -s "https://get.sdkman.io" | bash
sdk install kotlin
```

Run a single file:

```bash
kotlinc 01_hello.kt -include-runtime -d out.jar && java -jar out.jar
```

Or simple one-liner (compiles + runs in one step):

```bash
kotlinc -script 01_hello.kts   # for scripts
```

## Progress checklist

Each file has examples plus `// TODO` exercises. Mark your progress here.

### Module 1 · Hello, Kotlin
- [ ] `01_hello.kt` — Kotlin setup + first program
- [ ] `02_val_var.kt` — val and var
- [ ] `03_data_types.kt` — data types
- [ ] `04_operators.kt` — operators

### Module 2 · Strings & Control Flow
- [ ] `05_strings.kt` — strings
- [ ] `06_if_else.kt` — if / else
- [ ] `07_when.kt` — when
- [ ] `08_for_loops.kt` — for loops
- [ ] `09_while_loops.kt` — while / do-while

### Module 3 · Functions
- [ ] `10_functions.kt` — functions
- [ ] `11_parameters_returns.kt` — function parameters and return values
- [ ] `12_default_named_args.kt` — default and named arguments

### Module 4 · Null Safety & Collections
- [ ] `13_null_safety.kt` — null safety
- [ ] `14_collections.kt` — collections

### Module 5 · Object-Oriented Kotlin
- [ ] `15_classes_objects.kt` — classes and objects
- [ ] `16_constructors.kt` — constructors
- [ ] `17_inheritance.kt` — inheritance
- [ ] `18_interfaces.kt` — interfaces
- [ ] `19_data_classes.kt` — data classes
- [ ] `20_enum_classes.kt` — enum classes
- [ ] `21_sealed_classes.kt` — sealed classes

### Module 6 · Functional & Advanced
- [ ] `22_lambdas.kt` — lambda functions
- [ ] `23_higher_order.kt` — higher-order functions
- [ ] `24_scope_functions.kt` — scope functions
- [ ] `25_extension_functions.kt` — extension functions
- [ ] `26_generics.kt` — generics

## Tip

Finish a file, tick its checkbox here, and also mark the matching lesson
"complete" in the Course Platform so both stay in sync.