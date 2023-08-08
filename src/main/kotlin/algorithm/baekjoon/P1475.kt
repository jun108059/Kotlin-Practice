package algorithm.baekjoon

/**
 * 방 번호
 *
 * - [baekjoon 1475](https://www.acmicpc.net/problem/1475)
 */

fun main() {
    val n = readln()

    val arr = IntArray(10) { 0 }
    n.forEach {
        val num = it - '0'
        if (num == 6 || num == 9) arr[6]++
        else arr[num]++
    }

    arr[6] = (arr[6] + 1) / 2  // 6과 9를 함께 고려하여 카운트를 조정

    println(arr.maxOrNull()!!)  // 최대 스티커 세트 개수 출력
}