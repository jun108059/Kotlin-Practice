package algorithm.baekjoon

/**
 * 영수증
 *
 * - [baekjoon 5565](https://www.acmicpc.net/problem/5565)
 */
fun main() {
    val total = readln().toInt()
    val sumOfNineNumbers = Array(9) { readln().toInt() }.sum()
    println(total - sumOfNineNumbers)
}
