package algorithm.baekjoon

import java.util.*

/**
 * 오큰수 (스택)
 *
 * - [baekjoon 17298](https://www.acmicpc.net/problem/17298)
 */
fun main() {
    val numberParamCount = readln().toInt() // 숫자 param 개수
    val numberArray = readln().split(" ").map { it.toInt() }.toIntArray()

    val stack = Stack<Int>()

    for (i in numberArray.indices) {
        while (stack.isNotEmpty() && numberArray[stack.peek()] < numberArray[i]) {
            numberArray[stack.pop()] = numberArray[i]
        }
        stack.push(i)
    }

    while (stack.isNotEmpty()) {
        numberArray[stack.pop()] = -1
    }
    println(numberArray.joinToString(separator = " "))
}
