package algorithm.baekjoon

/**
 * "좋은 수" 구하기(투 포인터)
 *
 * - baekjoon 1253(https://www.acmicpc.net/problem/1253)
 */
fun main() {
    val targetNumber = readln().toInt()
    val arr = readln().split(" ").map { it.toLong() }.toLongArray().sortedArray()

    var cnt = 0

    repeat(targetNumber) { ptr ->
        var left = 0
        var right = targetNumber - 1

        while (left < right) {
            val sum = arr[left] + arr[right]

            if (sum == arr[ptr]) {
                if (left == ptr || right == ptr) {
                    if (left == ptr) left++
                    if (right == ptr) right--
                } else {
                    cnt++
                    break
                }
            } else if (sum < arr[ptr]) {
                left++
            } else {
                right--
            }
        }
    }
    println(cnt)
}
