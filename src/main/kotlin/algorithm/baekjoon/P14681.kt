package algorithm.baekjoon

import java.util.*

/**
 * 사분면 고르기
 *
 * - baekjoon 14681(https://www.acmicpc.net/problem/14681)
 */
fun main() = with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()
    println(if(x < 0 && 0 < y) "2" else if(x > 0 && 0 < y) "1" else if(x < 0 && 0 > y) "3" else "4")
}