package algorithm.baekjoon

import java.util.*
val bw = System.`out`.bufferedWriter()

/**
 * 최솟값 찾기(슬라이딩 윈도우)
 *
 * - [baekjoon 11003](https://www.acmicpc.net/problem/11003)
 *
 * 12 3
 * 1 5 2 3 6 2 3 7 3 5 2 6
 */
fun main() {
    var st = StringTokenizer(readln())

    val totalNumberCount = st.nextToken().toInt()
    val windowLength = st.nextToken().toInt()

    val myDeque: Deque<Node> = ArrayDeque(totalNumberCount)

    st = StringTokenizer(readln())
    for (i in 0 until totalNumberCount) {
        val number = st.nextToken().toInt()
        while (myDeque.isNotEmpty() && (myDeque.last().value >= number)) {
            myDeque.removeLast()
        }
        myDeque.addLast(Node(number, i))

        if (myDeque.first().index <= i - windowLength) {
            myDeque.removeFirst()
        }
        bw.write("${myDeque.first().value} ")
    }
    bw.flush()
}

data class Node(val value: Int, val index: Int)
