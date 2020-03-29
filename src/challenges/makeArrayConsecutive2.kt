package challenges

import kotlin.test.assertEquals

fun main() {
    var input = mutableListOf(6, 2, 3, 8)

    var result = makeArrayConsecutive2(input)

    assertEquals(3, result)

    input = mutableListOf(0, 3)
    result = makeArrayConsecutive2(input)
    assertEquals(2, result)
}

fun makeArrayConsecutive2(statues: MutableList<Int>) : Int {
    var maxValue = 0
    var minValue = 20

    for (current in statues) {
        minValue = kotlin.math.min(minValue, current)
        maxValue = kotlin.math.max(maxValue, current)
    }

    println(maxValue)
    println(minValue)
    return maxValue - minValue - statues.size + 1
}