package algorithm.baekjoon

/**
 * baekjoon 2750
 * https://www.acmicpc.net/problem/2750
 */
fun main() {
    val numArray = intArrayOf(5, 2, 3, 4, 1)
    val sortedNumbers = bubbleSort(numArray)
    println(sortedNumbers.joinToString(","))
}

fun bubbleSort(numArray: IntArray): IntArray {
    val size = numArray.size
    var temp: Int
    for (i in 0 until size) {
        for (j in 0 until size - i - 1) {
            if (numArray[j] > numArray[j + 1]) {
                temp = numArray[j]
                numArray[j] = numArray[j + 1]
                numArray[j + 1] = temp
            }
        }
    }
    return numArray
}

fun p2750(args: Array<String>) {
    val count = readln().toInt()
    val numList = mutableListOf<Int>()
    for (i in 0 until count) {
        numList.add(readln().toInt())
    }
    val sortedList = numList.sorted()

    for (number in sortedList) {
        println(number)
    }
}
