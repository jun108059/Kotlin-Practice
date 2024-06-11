package algorithm.baekjoon

/**
 * A + B - 5
 *
 * - [baekjoon 10952](https://www.acmicpc.net/problem/10952)
 */
fun main() {
    while (true) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        if (a == 0 && b == 0) break
        println(a + b)
    }
}