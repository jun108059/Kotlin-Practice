package algorithm.baekjoon

import java.time.LocalTime

fun main() {
    val (hour, minute) = readln().split(" ").map { it.toInt() }
    val time = LocalTime.of(hour, minute).minusMinutes(45)
    print("${time.hour} ${time.minute}")
}