package algorithm.baekjoon

import java.util.*

/**
 * A + B - 7
 *
 * - [baekjoon 11021](https://www.acmicpc.net/problem/11021)
 */
fun main() = with(Scanner(System.`in`)) {
    for (i in 1..nextInt()) {
        println("Case #$i: ${nextInt() + nextInt()}")
    }
}