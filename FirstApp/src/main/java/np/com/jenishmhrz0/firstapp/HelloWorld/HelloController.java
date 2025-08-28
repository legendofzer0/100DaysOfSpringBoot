package np.com.jenishmhrz0.firstapp.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World, Just Started with Spring Boot!!";
    }
}
