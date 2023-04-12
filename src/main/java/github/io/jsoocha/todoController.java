package github.io.jsoocha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoController {
    @GetMapping("/")
    public String hello() {
        return "To-do Application !";
    }
}
