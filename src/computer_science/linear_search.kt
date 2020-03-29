package computer_science

fun main() {
    val item = 10
    val items = intArrayOf(11, 23, 8, 14, 30, 9, 6, 17, 22, 28, 25, 15, 7, 10, 19)

    val itemExist = linearSearch(items, item)
    println("Item exist: $itemExist")
}

fun linearSearch(items: IntArray, item: Int): Boolean {
    for (element in items) {
        if (element == item) {
            return true
        }
    }
    return false
}