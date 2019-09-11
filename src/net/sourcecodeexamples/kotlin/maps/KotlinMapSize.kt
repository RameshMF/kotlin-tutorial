package net.sourcecodeexamples.kotlin

fun main() {

	val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("Map has ${numbersMap.size} items")
    println("Map has ${numbersMap.count()} items")

    val n = numbersMap.count { it.value > 1 }
    println("# of values greater that 1: $n")
}