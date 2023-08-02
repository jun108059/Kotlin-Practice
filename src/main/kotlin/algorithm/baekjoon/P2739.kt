package algorithm.baekjoon

/**
 * 구구단
 *
 * - [baekjoon 2739](https://www.acmicpc.net/problem/2739)
 */
fun main() {
    val num = readln().toInt()
    for (i in 1..9) {
        println("$num * $i = ${i * num}")
    }
}