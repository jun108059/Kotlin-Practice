package youngjun.me.self

enum class Category(
    private val code: String,
    private val koreanName: String,
) {
    TODO("001", "할 일"),
    PLAY("002", "놀기"),
    MEETING("003", "회의"),
    REST("004", "휴식"),
    ;

    fun getCode() = code
    fun getKoreanName() = koreanName

    companion object {
        @JvmStatic
        fun of(code: String?): Category? = values().firstOrNull { it.code == code }
    }
}
