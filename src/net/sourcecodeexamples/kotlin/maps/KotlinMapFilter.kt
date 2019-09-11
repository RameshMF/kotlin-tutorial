package net.sourcecodeexamples.kotlin


fun main() {

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    val filtered = numbersMap.filterKeys { it == "key1" || it == "key2" }
    println(filtered)

    val filtered2 = numbersMap.filterValues { it >= 2 }
    println(filtered2)

    val filtered3 = numbersMap.filter { it.key == "key3" || it.value == 3 }
    println(filtered3)
}