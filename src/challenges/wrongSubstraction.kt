package challenges

// Refer to: https://codeforces.com/problemset/problem/977/A
fun main() {
    var n = readLine()?.toInt()!!
    val k = readLine()?.toInt()!!

    for (i in 1..k) {
        if (n % 10 == 0) {
            n /= 10
        } else {
            n--
        }
    }
    print(n)
}