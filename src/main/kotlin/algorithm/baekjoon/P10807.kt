package algorithm.baekjoon

/**
 * 개수 세기
 *
 * - [baekjoon 10807](https://www.acmicpc.net/problem/10807)
 */
fun main() {
    readln()
    val numbers = readln().split(" ").map { it.toInt()}
    val target = readln().toInt()
    println(numbers.count { it == target })
}
