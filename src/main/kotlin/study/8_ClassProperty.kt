package study

class Coffee(
    var name: String = "",
    var price: Int = 0,
)

fun main() {
    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
}
