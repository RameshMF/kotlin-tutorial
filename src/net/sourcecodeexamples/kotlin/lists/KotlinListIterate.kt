package net.sourcecodeexamples.kotlin


fun main() {

	val fruits = listOf("banana", "mango", "apple", "orange")

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

		print("${fruits[i]} ")
	}

	println()

	// using forEachIndexed() method
	fruits.forEachIndexed({ i, e -> println("fruits[$i] = $e") })

	// using a ListIterator and a while loop
	val it: ListIterator<String> = fruits.listIterator()

	while (it.hasNext()) {

		val e = it.next()
		print("$e ")
	}

	println()
}