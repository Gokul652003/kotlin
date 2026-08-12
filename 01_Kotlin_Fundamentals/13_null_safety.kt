// 13: Null safety
// ?. safe call, ?: elvis, !! assertion, smart casts

fun main() {
    var nick: String? = "goku"
    println(nick?.length)        // 4
    println(nick?.length ?: 0)   // 4

    nick = null
    println(nick?.length ?: 0)   // 0 (no crash)

    println(lenOf(nick))         // 0
    println(lenOf("hello"))      // 5
}

fun lenOf(s: String?): Int {
    if (s != null) {
        return s.length          // smart cast — safe
    }
    return 0
}

// Exercise:
// 1. Write a function that returns the string or "unknown" if null.
// 2. Use ?. on a nullable list to get its size safely.
// TODO: fun getOrDefault(v: String?): String = v ?: "unknown"