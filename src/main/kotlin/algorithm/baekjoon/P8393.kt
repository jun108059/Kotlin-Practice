package algorithm.baekjoon

/**
 * 합
 *
 * - [baekjoon 8393](https://www.acmicpc.net/problem/8393)
 */
fun main() {
    val num = readln().toInt()
    val total = (1..num).sum()
    println(total)
}