package net.sourcecodeexamples.kotlin

fun main() {

	val nums = listOf(1, 2, 3, 7, 6, 5, 4)

	val r = nums.contains(4)

	if (r) {
		println("The list contains 4")
	} else {
		println("The list does not contain 4")
	}
	val r2 = nums.containsAll(listOf(1, 6))

	if (r2) {
		println("The list contains 1 and 6")
	} else {
		println("The list does not contain 1 and 6")
	}
}
