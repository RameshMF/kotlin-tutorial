package net.sourcecodeexamples.kotlin


fun main() {

	val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

	if (numbersMap.containsKey("key1")) {

		println("contains key1")
	} else {

		println("does not contain key1")
	}

	val value = 1

	if (numbersMap.containsValue(value)) {

		println("contains value $value")
	} else {

		println("does not contain value $value")
	}
}