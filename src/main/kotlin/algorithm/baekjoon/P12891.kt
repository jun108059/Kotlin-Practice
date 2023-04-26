package algorithm.baekjoon

/**
 * DNA 비밀번호(슬라이딩 윈도우)
 *
 * - [baekjoon 12891](https://www.acmicpc.net/problem/12891)
 */
fun main() {
    val (totalLength, windowLength) = readln().split(" ").map { it.toInt() }
    val totalString = readln().toCharArray()
    val minimumRule = readln().split(" ").map { it.toInt() }.toIntArray()

    var count = 0
    val checkRule = arrayOf(0, 0, 0, 0)
    for (i in 0 until windowLength) {
        when (totalString[i]) {
            'A' -> checkRule[0]++
            'C' -> checkRule[1]++
            'G' -> checkRule[2]++
            'T' -> checkRule[3]++
        }
    }

    if (checkValid(minimumRule, checkRule)) {
        count++
    }

    var startPoint = 0
    var endPoint = windowLength

    while (endPoint < totalLength) {
        when (totalString[startPoint]) {
            'A' -> checkRule[0]--
            'C' -> checkRule[1]--
            'G' -> checkRule[2]--
            'T' -> checkRule[3]--
        }
        when (totalString[endPoint]) {
            'A' -> checkRule[0]++
            'C' -> checkRule[1]++
            'G' -> checkRule[2]++
            'T' -> checkRule[3]++
        }
        if (checkValid(minimumRule, checkRule)) {
            count++
        }
        endPoint++
        startPoint++
    }
    println(count)
}

private fun checkValid(minimumRule: IntArray, checkRule: Array<Int>): Boolean {
    var isValid = true
    for (i in minimumRule.indices) {
        if (checkRule[i] < minimumRule[i]) {
            isValid = false
            break
        }
    }
    return isValid
}
