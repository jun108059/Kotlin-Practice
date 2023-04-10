package algorithm.baekjoon

/**
 * 구간 합 구하기 5(구간 합)
 *
 * - kotlin : `repeat` 메서드 활용
 * - kotlin : 2차원 배열 선언 `Array(N) { IntArray(N) }`
 * - [baekjoon 11660](https://www.acmicpc.net/problem/11660)
 */
fun main() {
    /*
4 3
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
2 2 3 4
3 4 3 4
1 1 4 4
     */
    p11660()
}

fun p11660() {
    // 배열 크기, 질의 개수
    val (arraySize, rangeCount) = readln().split(" ").map { it.toInt() }
    // 2차원 배열 생성
    val originArray = Array(arraySize + 1) { IntArray(arraySize + 1) }
    for (i in 1..arraySize) {
        val rowNumbers = readln().split(" ").map { it.toInt() }
        for (j in 1..arraySize) {
            originArray[i][j] = rowNumbers[j - 1]
        }
    }
    // 구간 합 2차원 배열
    val prefixSumArray = Array(arraySize + 1) { IntArray(arraySize + 1) }
    for (i in 1..arraySize) {
        for (j in 1..arraySize) {
            prefixSumArray[i][j] =
                prefixSumArray[i][j - 1] +
                prefixSumArray[i - 1][j] -
                prefixSumArray[i - 1][j - 1] +
                originArray[i][j]
        }
    }
    val sb = StringBuilder()
    // 구간 합 질의 처리
    repeat(rangeCount) {
        val (x1, y1, x2, y2) = readln().split(" ").map { it.toInt() }
        sb.append(
            prefixSumArray[x2][y2] -
                prefixSumArray[x1 - 1][y2] -
                prefixSumArray[x2][y1 - 1] +
                prefixSumArray[x1 - 1][y1 - 1],
        ).append('\n')
    }
    println(sb)
}
