package algorithm.baekjoon

/**
 * 주몽의 명령(투 포인터)
 *
 * - [baekjoon 1940](https://www.acmicpc.net/problem/1940)
 */
fun main() {
    /**
     * 6
     * 9
     * 2 7 4 1 5 3
     */
    val numberParamCount = readln().toInt() // 숫자 param 개수
    val targetNumber = readln().toInt() // 구하려는 값
    val numbersArray = readln().split(" ").map { it.toInt() }.toIntArray().sorted()

    var count = 0 // 총 몇개의 조합인지 count
    var startPointer = 0 // 구간 시작 포인터
    var endPointer = numberParamCount - 1 // 구간 종료 포인터

    while (startPointer < endPointer) {
        val sum = numbersArray[startPointer] + numbersArray[endPointer]
        if (sum < targetNumber) {
            startPointer++
        } else if (sum > targetNumber) {
            endPointer--
        } else {
            count++
            startPointer++
            endPointer--
        }
    }
    print(count)
}
