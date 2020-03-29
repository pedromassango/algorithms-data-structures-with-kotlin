package challenges

fun main() {
    val input = intArrayOf(3, 3)
    val expected = intArrayOf(0, 1)

    val result = twoSum(input, 6)
    println("Expected: ${expected.joinToString(", ")}")
    println("Result: ${result.joinToString(", ")}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var i = 0
    while (i <= nums.size) {
        var j = 1
        while (j <= nums.size) {
            if (nums[i] + nums[j] == target) {
                println("Found at: {I:$i J: $j}")
                val result = IntArray(2)
                result[0] = if (i > j) j else i
                result[1] = if (i > j) i else j
                return result
            }
            j++
        }
        i++
    }
    return intArrayOf()
}