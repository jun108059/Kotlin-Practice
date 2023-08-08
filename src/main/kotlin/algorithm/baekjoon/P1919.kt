package algorithm.baekjoon

/**
 * 애너그램 만들기
 *
 * - [baekjoon 1919](https://www.acmicpc.net/problem/1919)
 */

fun main() {
    val str1 = readln()
    val str2 = readln()
    val arr = IntArray(26) {0}

    str1.forEach { arr[it - 'a']++ }
    str2.forEach { arr[it - 'a']-- }

    print(arr.sumOf { kotlin.math.abs(it) })
}
