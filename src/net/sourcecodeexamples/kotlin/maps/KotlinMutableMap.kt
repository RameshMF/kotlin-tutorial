package net.sourcecodeexamples.kotlin

fun main() {
	val numbersMap = mutableMapOf("one" to 1, "two" to 2)
	numbersMap.put("three", 3)
	numbersMap["one"] = 11

	println(numbersMap)
}