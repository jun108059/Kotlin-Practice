package algorithm.baekjoon

/**
 * "좋은 수" 구하기(투 포인터)
 *
 * - baekjoon 1253(https://www.acmicpc.net/problem/1253)
 */
fun main() {
    val targetNumber = readln().toInt()
    val numberArray = readln().split(" ").map { it.toLong() }.toLongArray().sortedArray()

    var count = 0

    repeat(targetNumber) { pointer ->
        var left = 0
        var right = targetNumber - 1

        while (left < right) {
            val sum = numberArray[left] + numberArray[right]

            if (sum == numberArray[pointer]) {
                if (left == pointer || right == pointer) {
                    if (left == pointer) left++
                    if (right == pointer) right--
                } else {
                    count++
                    break
                }
            } else if (sum < numberArray[pointer]) {
                left++
            } else {
                right--
            }
        }
    }
    println(count)
}
