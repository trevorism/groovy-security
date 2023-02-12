package groovy.security

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class RootController {

    @Get(value = "/", produces = MediaType.TEXT_PLAIN)
    String hello(){
        return "hello world"
    }
}
