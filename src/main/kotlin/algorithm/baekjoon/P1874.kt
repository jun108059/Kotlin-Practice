package algorithm.baekjoon

import java.util.Stack

/**
 * 스택 수열(스택)
 *
 * - baekjoon 1874(https://www.acmicpc.net/problem/1874)
 */
fun main() {
    val stackCount = readln().toInt()
    val stack = Stack<Int>()
    val sb = StringBuilder()
    var current = 1
    for (i in 0 until stackCount) {
        val command = readln().toInt()
        while (current <= command) {
            stack.push(current)
            sb.append("+\n")
            current += 1
        }
        if (command == stack.last()) {
            stack.pop()
            sb.append("-\n")
        } else {
            println("NO")
            return
        }
    }
    println(sb.toString())
}
