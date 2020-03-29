package challenges

import kotlin.test.assertEquals

fun main() {
    val input = 1534236469
    val result = reverse(input)

    println( 9646324351.toInt() == result)
    //assertEquals(9646324351, result)
}

fun reverse(input: Int): Int {
    var inputString = input.toString()
    var result = ""

    if (input < 0) {
        result = "-"
        inputString = inputString.removePrefix("-")
    }

    var index = inputString.length -1
    while (index > -1) {
        result += inputString[index]
        index--
    }

    return try {
        result.toInt()
    } catch (e: NumberFormatException) {
        0
    }
}