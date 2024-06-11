package algorithm.baekjoon

/**
 * X보다 작은 수
 *
 * - [baekjoon 10871](https://www.acmicpc.net/problem/10871)
 */
fun main() {
    val (n, limit) = readln().split(" ").map { it.toInt() }
    val filteredNums = readln().split(" ").map { it.toInt() }.filter { it < limit }
    println(filteredNums.joinToString(" "))
}
