package algorithm.baekjoon

/**
 * 거스름돈
 *
 * - [baekjoon 14916](https://www.acmicpc.net/problem/14916)
 */
fun main() {
    var n = readln().toInt()
    var result = 0

    while (n > 0) {
        if (n % 5 == 0) {
            result += n / 5
            println(result)
            return
        } else {
            n -= 2
            result++
        }
    }

    if (n < 0) {
        println(-1)
    } else {
        println(result)
    }
}
