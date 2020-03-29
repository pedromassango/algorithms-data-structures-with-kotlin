package challenges
import kotlin.test.assertEquals

fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    if (input == null || input.isEmpty()) return arrayOf()
    val countPositives = input.filter { it > 0 }.size
    val sumNegatives = input.filter { it < 0 }.sum()
    return arrayOf(countPositives, sumNegatives)
}

fun main() {
    assertEquals(arrayOf(10, -65),
        countPositivesSumNegatives(
            arrayOf(
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                10,
                -11,
                -12,
                -13,
                -14,
                -15
            )
        )
    )
    assertEquals(arrayOf(8, -50),
        countPositivesSumNegatives(
            arrayOf(
                0,
                2,
                3,
                0,
                5,
                6,
                7,
                8,
                9,
                10,
                -11,
                -12,
                -13,
                -14
            )
        )
    )


}

