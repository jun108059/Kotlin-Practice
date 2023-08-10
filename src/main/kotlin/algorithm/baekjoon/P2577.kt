package algorithm.baekjoon

/**
 * 숫자의 개수
 *
 * - [baekjoon 2577](https://www.acmicpc.net/problem/2577)
 */

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val result = (a * b * c).toString()
    val arr = IntArray(10) { 0 }

    result.forEach { digit ->
        arr[digit - '0']++
    }

    arr.forEach {
        println(it)
    }
}