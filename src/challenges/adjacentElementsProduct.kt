package challenges

import kotlin.test.assertEquals

fun main() {
    val items = mutableListOf(3, 6, -2, -5, 7, 3)

    val result = adjacentElementsProduct(items)
    assertEquals(21, result)
}

fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    val elementsProduct = mutableListOf<Int>()

    var elementIndex = 0
    while (elementIndex != inputArray.size - 1) {
        val element = inputArray[elementIndex]
        val adjacentElement = inputArray[elementIndex + 1]
        val product = element * adjacentElement
        elementsProduct.add(product)

        elementIndex++
    }
    return elementsProduct.max()!!
}