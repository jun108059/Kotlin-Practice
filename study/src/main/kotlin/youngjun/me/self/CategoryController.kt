package youngjun.me.self

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView

@Controller
class CategoryController {

    companion object {
        private val log = mu.KotlinLogging.logger {}
    }

    @GetMapping("/category")
    fun getCategoryInfo(
        @RequestParam("categoryId") categoryId: String
    ): ModelAndView {

        // valueOf - param: enum 값 객체 이름 String
        // ex) PLAY, REST ..
        val enumValueOf = Category.valueOf("PLAY")
        log.info("Enum type valueOf : $enumValueOf")


        // custom of method - code 에서 name 얻기 위해
        val category = Category.of(categoryId)
        log.info("Enum type : $category")
        val name = category?.getKoreanName()
        log.info("Enum type valueOf.name : $name")

        return ModelAndView("/category/index")
            .addObject("categoryId", categoryId)
            .addObject("category", category)
            .addObject("categoryName", name)
    }
}