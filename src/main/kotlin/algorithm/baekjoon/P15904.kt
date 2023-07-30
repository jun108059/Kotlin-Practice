package algorithm.baekjoon

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * UCPC는 무엇의 약자일까?
 *
 * - [baekjoon 15904](https://www.acmicpc.net/problem/15904)
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()

    var currentIndex = 0
    val target = "UCPC"

    for (c in target) {
        currentIndex = input.indexOf(c, currentIndex)

        if (currentIndex == -1) {
            println("I hate UCPC")
            return
        }

        currentIndex++
    }

    println("I love UCPC")
}