package algorithm.baekjoon

/**
 * 나머지 합(구간 합)
 *
 * - 조합 : nC2 계산 방법 `(n * (n-1) / 2)`
 * - 구간합 원리 : `result = S[j] - S[i - 1]`
 * - [baekjoon 11659](https://www.acmicpc.net/problem/10986)
 */
fun main() {
    /*
5 3
1 2 3 1 2
     */
    p10986()
}

fun p10986() {
    val (numbersCount, divideNumber) = readln().split(" ").map { it.toInt() }
    val numbersArray = readln().split(" ").map { it.toLong() }.toLongArray()
    val prefixSumArray = LongArray(numbersCount)
    prefixSumArray[0] = numbersArray[0]
    // 구간 합 배열 생성
    for (i in 1 until numbersCount) {
        prefixSumArray[i] = prefixSumArray[i - 1] + numbersArray[i]
    }

    val remainingNumberArray = LongArray(divideNumber)
    var result = 0L
    for (i in 0 until numbersCount) {
        val remainingNumber = (prefixSumArray[i] % divideNumber).toInt()
        if (remainingNumber == 0) {
            result++
        }
        remainingNumberArray[remainingNumber]++
    }

    for (i in 0 until divideNumber) {
        result += (remainingNumberArray[i] * (remainingNumberArray[i] - 1) / 2)
    }
    println(result)
}
