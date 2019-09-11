package net.sourcecodeexamples.kotlin

fun main() {

	val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

	numbersMap.forEach { (k, v) -> println("There are $v $k") }
}