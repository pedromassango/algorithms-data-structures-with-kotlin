package challenges

import kotlin.test.assertEquals

fun main() {
    val items = mutableListOf(8, 4, 6, 2, 6, 4, 7, 9, 5, 8)

    val firstDuplicate = firstDuplicate(items)
    assertEquals(firstDuplicate, 8, "Result does not match!")
}

fun firstDuplicate(a: MutableList<Int>) : Int {
    val sorted = a.sortedDescending()
    var lastIteratedItem = 0
    for (x in sorted) {
        if (lastIteratedItem == x)
            return x
        lastIteratedItem = x
    }
    return -1
}