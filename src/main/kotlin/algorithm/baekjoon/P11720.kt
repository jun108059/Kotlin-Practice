package algorithm.baekjoon

/**
 * 숫자의 합 구하기(배열/리스트)
 *
 * - baekjoon 11720(https://www.acmicpc.net/problem/11720)
 */
fun main() {
    val numberString = "54321"
    val result = sumOfNumbers(numberString)
    println(result)
}

fun sumOfNumbers(numberString: String) =
    numberString.map { it.toString().toLong() }.sum()
//    numberString.map { it - '0' }.sum()

fun p11720() {
    val unUseCount = readln().toInt()
    val numberString = readln()
    println(numberString.map { it.toString().toLong() }.sum())
}
