package api_rest.dancodeur;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Dan") String name) {
        return String.format("Hello %s!", name);
    }
}
