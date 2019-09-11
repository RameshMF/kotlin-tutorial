package net.sourcecodeexamples.kotlin

fun main() {

	val nums = listOf(10, 5, 3, 4, 2, 1, 11, 14, 12)

	val sortAsc = nums.sorted()
	println("sortAsc -> " + sortAsc)

	val sortDesc = nums.sortedDescending()
	println("sortDesc -> " + sortDesc)

	val revNums = nums.reversed()
	println("revNums -> " + revNums)
}