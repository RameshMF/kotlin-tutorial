package net.sourcecodeexamples.kotlin


fun main() {

	val fruits = setOf("banana", "mango", "apple", "orange", "banana")

	// using forEach() method
	fruits.forEach { e -> print("$e ") }
	println()

	// using for loop
	for (fruit in fruits) {

		print("$fruit ")
	}

	println()

	// An alternative for cycle utilizes the size of the list
	for (i in 0 until fruits.size) {

		print("${fruits.elementAt(i)} ")
	}

	println()
	// using forEachIndexed() method
	fruits.forEachIndexed({ i, e -> println("fruits[$i] = $e") })

	val it: Iterator<String> = fruits.asIterable().iterator();

	while (it.hasNext()) {

		val e = it.next()
		print("$e ")
	}
	println()
}