package computer_science

fun main() {
    val item = 10
    val items = intArrayOf(11, 23, 8, 14, 30, 9, 6, 17, 22, 28, 25, 15, 7, 10, 19)

    val time = kotlin.time.measureTime {
        val itemExist = binarySearch(items, item)
        println(itemExist)
    }
    println("Binary Search duration: $time")
}

fun binarySearch(items: IntArray, item: Int): Boolean {
    val sortedList = items.sortedArray()

    val subArraySize = sortedList.size / 2

    while (subArraySize != 0) {
        val middleItem = sortedList.elementAt(subArraySize)
        if (item == middleItem) {
            return true
        }
        if (item < middleItem) {
            return linearSearch(sortedList.copyOfRange(0, subArraySize), item)
        }
        return linearSearch(
            sortedList.copyOfRange(subArraySize, sortedList.size),
            item
        )
    }
    return false
}