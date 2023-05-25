package study

/**
 * val = value (java final과 비슷)
 * var = variable
 */
fun main() {
    val a: Int = 1
    val b = 1
    val c: Int
    c = 3

    var e: String = "Hello"
    e = "World"

    print("$a, $b, $c, $e")

    val name = "박영준"
    println(name.hello())

    printMessage("안녕하세요!")
}

fun String.hello(): String {
    return "안녕하세요, $this!"
}

val printMessage: (String) -> Unit = { message -> println(message) }
