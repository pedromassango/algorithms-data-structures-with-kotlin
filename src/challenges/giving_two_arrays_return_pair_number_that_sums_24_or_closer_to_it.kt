package challenges
fun <T> measureTime(message: String = "", block: () -> T): T {
    val start = System.currentTimeMillis()
    val r = block()
    val end = System.currentTimeMillis()
    println("$message: ${end - start}ms")
    return r
}

fun main() {
    val array1 = arrayOf(1, 3, 8, 2, 9, 5)
    val array2 = arrayOf(4, 1, 2, 10, 5, 20)

    val result = measureTime(message = "Execution time") {
        findTheClosestOr24(array1, array2)
    }

    println("Result: $result")
}

fun findTheClosestOr24(array1: Array<Int>, array2: Array<Int>): Int {
    array1.forEach { val1 ->
        array2.forEach { val2 ->
            if (val1 + val2 == 24 || val1 + val2 == 23 || val1 + val2 == 25)
                return val1 + val2
            if (val1 - val2 == 24 || val1 - val2 == 23 || val1 - val2 == 25)
                return val1 - val2
        }
    }
    return 0
}