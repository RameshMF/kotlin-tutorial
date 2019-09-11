package net.sourcecodeexamples.kotlin

fun main() {

	val nums = setOf(1,2,3,4,5,6,7,-1,-2)

	val r = nums.any { e -> e > 10 }
	if (r) {
		println("There is a value greater than ten")
	} else {
		println("There is no value greater than ten")
	}

	val r2 = nums.any { e -> e < 0 }

	if (r2) {
		println("There is a negative value")
	} else {
		println("There is no negative value")
	}
}

