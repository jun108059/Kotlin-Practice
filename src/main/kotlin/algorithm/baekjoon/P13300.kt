package algorithm.baekjoon

/**
 * 방 배정
 *
 * - [baekjoon 13300](https://www.acmicpc.net/problem/13300)
 */
fun main() {
    val (n, lim) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(12) { 0 }

    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        arr[(b - 1) * 2 + a]++
    }

    val result = arr.sumOf { (it + lim - 1) / lim }
    println(result)
}
