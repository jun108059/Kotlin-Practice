package algorithm.baekjoon

/**
 * 과제 안 내신 분
 *
 * - [baekjoon 5597](https://www.acmicpc.net/problem/5597)
 */
fun main() {
    val set = HashSet<Int>()
    repeat(28) {
        set.add(readln().toInt())
    }
    (1..30).filter { it !in set }.forEach(::println)
}
