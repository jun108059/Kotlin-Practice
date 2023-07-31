package algorithm.baekjoon

import java.util.Scanner

/**
 * A + B - 3
 *
 * - [baekjoon 10950](https://www.acmicpc.net/problem/10950)
 */
fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()

    for (i in 1..num) {
        val a = nextInt()
        val b = nextInt()

        println("${a + b}")
    }
}
