package net.sourcecodeexamples.kotlin

fun main() {

	val nums = setOf(1,2,3,4,5,6,7,8,9)
	val nums2 = setOf(-3, -4, -2, -5, -7, -8)

	// testing for positive only values
	val r = nums.all { e -> e > 0 }

	if (r) {
		println("nums list contains only positive values")
	} else {
		println("nums list does not contain only positive values")
	}


	// testing for negative only values
	val r2 = nums2.all { e -> e < 0 }

	if (r2) {
		println("nums2 list contains only negative values")
	} else {
		println("nums2 list does not contain only negative values")
	}
}