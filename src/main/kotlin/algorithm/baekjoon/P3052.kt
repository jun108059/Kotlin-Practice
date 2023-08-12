package algorithm.baekjoon

/**
 * 나머지
 *
 * - [baekjoon 3052](https://www.acmicpc.net/problem/3052)
 */
fun main() {
    val remainders = ArrayList<Int>()
    repeat(10) {
        val num = readln().toInt()
        remainders.add(num % 42)
    }
    println(remainders.distinct().size)
}
