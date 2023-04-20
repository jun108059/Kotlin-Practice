package algorithm.baekjoon

/**
 * 연속된 자연수의 합 구하기(투 포인터)
 *
 * - [baekjoon 2018](https://www.acmicpc.net/problem/2018)
 */
fun main() {
    val targetNumber = readln().toInt() // 구하는 숫자 : 15
    var count = 1 // 총 몇개의 조합인지 count
    var startPointer = 1 // 구간 시작 포인터
    var endPointer = 1 // 구간 종료 포인터
    var sum = 1

    while (endPointer != targetNumber) {
        if (sum == targetNumber) {
            // 현재 연속 합이 targetNumber 같은 경우
            count++
            endPointer++
            sum += endPointer
        } else if (sum > targetNumber) {
            // 현재 연속 합이 targetNumber 보다 큰 경우
            sum -= startPointer
            startPointer++
        } else if (sum < targetNumber) {
            // 현재 연속 합이 targetNumber 보다 작은 경우
            endPointer++
            sum += endPointer
        }
    }
    print(count)
}
