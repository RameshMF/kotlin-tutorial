package net.sourcecodeexamples.kotlin

fun main() {

	val nums = setOf(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)

	val nums2 = nums.drop(3)
	println(nums2)

	val nums3 = nums.sorted().dropWhile { e -> e < 0 }
	println(nums3)

	val nums4 = nums.sorted().dropLastWhile { e -> e > 0 }
	println(nums4)
}