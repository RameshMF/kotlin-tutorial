package net.sourcecodeexamples.kotlin.maps

fun main() {
	val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
	println("Entries: " + numbersMap.entries)
	println("All keys: ${numbersMap.keys}")
	println("All values: ${numbersMap.values}")
}