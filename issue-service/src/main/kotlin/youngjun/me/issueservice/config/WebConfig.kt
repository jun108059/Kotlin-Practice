package youngjun.me.issueservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.core.MethodParameter
import org.springframework.stereotype.Component
import org.springframework.web.bind.support.WebDataBinderFactory
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.method.support.ModelAndViewContainer
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport

@Configuration
class WebConfig(
    private val authUserHandlerArgumentResolver: AuthUserHandlerArgumentResolver
) : WebMvcConfigurationSupport() {

    /**
     * Add argument resolvers
     * 스프링 내부적으로 등록한 리스트를 순회하면서 supportsParameter 검사
     *
     * @param argumentResolvers HandlerMethodArgumentResolver 리스트
     */
    override fun addArgumentResolvers(argumentResolvers: MutableList<HandlerMethodArgumentResolver>) {
        // scope 설정
        argumentResolvers.apply {
            add(authUserHandlerArgumentResolver)
        }
    }
}

/**
 * Auth user handler argument resolver
 * 컨트롤러에 설정한 인자가 넘어온 경우 객체나 에너테이션에 값을 설정해줄 수 있음
 *
 * @constructor Create empty Auth user handler argument resolver
 */
@Component
class AuthUserHandlerArgumentResolver : HandlerMethodArgumentResolver {

    /**
     * Supports parameter (파라미터와 AuthUser 타입 검사)
     * 리플렉션을 활용해 파라미터 타입과 AuthUser 타입이 동일하면 resolveArgument 동작
     *
     * @param parameter 메서드 파라미터
     * @return True or False
     */
    override fun supportsParameter(parameter: MethodParameter): Boolean =
        AuthUser::class.java.isAssignableFrom(parameter.parameterType)

    override fun resolveArgument(
        parameter: MethodParameter,
        mavContainer: ModelAndViewContainer?,
        webRequest: NativeWebRequest,
        binderFactory: WebDataBinderFactory?
    ): Any? {
        // FIXME 인증 서버가 개발되면 수정해야 함
        // JWT 복화화하여 값 가져오도록 바꾸기
        return AuthUser(
            userId = 1,
            username = "테스트"
        )
    }

}

data class AuthUser(
    val userId: Long,
    val username: String,
    val profileUrl: String? = null
)