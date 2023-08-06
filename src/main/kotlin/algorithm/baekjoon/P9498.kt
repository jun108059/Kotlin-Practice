package algorithm.baekjoon

/**
 * 시험 성적
 *
 * - [baekjoon 9498](https://www.acmicpc.net/problem/9498)
 */
fun main() {
    val score = readln().toInt()
    println(
        when (score) {
            in 90..100 -> "A"
            in 80 until 90 -> "B"
            in 70 until 80 -> "C"
            in 60 until 70 -> "D"
            else -> "F"
        }
    )
}