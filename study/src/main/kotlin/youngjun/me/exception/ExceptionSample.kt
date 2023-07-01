package youngjun.me.exception

class ExceptionSample {

    val result = try {
        // 예외가 발생할 수 있는 코드
        "Success"
    } catch (e: Exception) {
        // 예외 처리
        "Failure"
    } finally {
        "Finally"
    }
}
