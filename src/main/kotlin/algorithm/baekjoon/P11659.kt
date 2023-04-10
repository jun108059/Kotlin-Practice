package algorithm.baekjoon

/**
 * 구간 합 구하기 4(구간 합)
 *
 * - `StringBuilder`에 개행 추가하기 (한번만 print 할 수 있도록)
 * - [baekjoon 11659](https://www.acmicpc.net/problem/11659)
 */
fun main() {
    /*
5 3
5 4 3 2 1
1 3
2 4
5 5
     */
    p11659()
}

fun p11659() {
    val (numbersCount, rangeCount) = readln().split(" ").map { it.toInt() }
    val numbersArray = readln().split(" ").map { it.toInt() }.toIntArray()
    val prefixSumArray = IntArray(numbersCount)
    prefixSumArray[0] = numbersArray[0]
    val sb = StringBuilder()
    // 구간 합 배열 생성
    for (i in 1 until numbersCount) {
        prefixSumArray[i] = prefixSumArray[i - 1] + numbersArray[i]
    }
    repeat(rangeCount) {
        val (startIndex, endIndex) = readln().split(" ").map { it.toInt() }
        if (startIndex == 1) {
            sb.append(prefixSumArray[endIndex - 1]).append('\n')
        } else {
            sb.append(prefixSumArray[endIndex - 1] - prefixSumArray[startIndex - 2]).append('\n')
        }
    }
    println(sb)
}
