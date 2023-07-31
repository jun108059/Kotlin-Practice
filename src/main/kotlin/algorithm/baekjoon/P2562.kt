package algorithm.baekjoon

/**
 * 최댓값
 *
 * - [baekjoon 2562](https://www.acmicpc.net/problem/2562)
 */
fun main() {
    val arr = Array(9) { readln().toInt() }
    val max = arr.maxOrNull()
    println(max)
    println(arr.indexOf(max) + 1)
}