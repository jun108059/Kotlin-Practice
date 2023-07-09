package algorithm.baekjoon


/**
 * 영수증
 *
 * - [baekjoon 25304](https://www.acmicpc.net/problem/25304)
 */
fun main() {
    val total = readln().toInt()
    val number = readln().toInt()
    var result = 0

    for (i in 1..number) {
        val numberArray = readln().split(" ").map { it.toInt() }.toIntArray()
        result += numberArray[0] * numberArray[1]
    }

    if (total == result) {
        print("Yes")
    } else {
        print("No")
    }
}
