package algorithm.baekjoon

/**
 * 평균 구하기(배열/리스트)
 *
 * - baekjoon 1546(https://www.acmicpc.net/problem/1546)
 */
fun main() {
    val scores = "40 80 60"
    // val scores = "10 20 30"
    val testScores = scores.split(" ").map { it.toInt() }
    val result = calculateAverage(testScores)
    println(result)
}

fun calculateAverage(scoreList: List<Int>): Double {
    return scoreList.map { it.toDouble() / maxOf(it) * 100 }.average()
}

fun p1546() {
    val numberOfSubjects = readln().toInt()
    val scoreList = readln().split(" ").map { it.toInt() }
    val maxScore = scoreList.maxOrNull() ?: 1
    print(scoreList.map { it.toDouble() / maxScore * 100 }.average())
}
