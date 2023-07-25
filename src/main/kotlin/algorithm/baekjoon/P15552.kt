package algorithm.baekjoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

/**
 * 빠른 A + B
 *
 * - [baekjoon 15552](https://www.acmicpc.net/problem/15552)
 */
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readln().toInt()) {
        val num = readln().split(" ")
        writer.write("${num[0].toInt() + num[1].toInt()}\n")
    }

    writer.flush()
    writer.close()
    close()
}
