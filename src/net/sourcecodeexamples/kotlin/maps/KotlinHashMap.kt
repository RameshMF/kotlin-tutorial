package net.sourcecodeexamples.kotlin

fun main() {

	val items = HashMap<String, Int>()

	items["X"] = 1
	items["Y"] = 2
	items["Z"] = 3

	for ((k, v) in items) {
		println("$k = $v")
	}
}