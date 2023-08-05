package algorithm.baekjoon

import java.util.Scanner

/**
 * 수 찾기
 *
 * - [baekjoon 1920](https://www.acmicpc.net/problem/1920)
 */
fun main() = with(Scanner(System.`in`)) {
    val numCount = nextInt()
    val numberSet = (0 until numCount).map { nextInt() }.toSet()
    val targetNumCount = nextInt()

    repeat(targetNumCount) {
        println(if (numberSet.contains(nextInt())) 1 else 0)
    }
}