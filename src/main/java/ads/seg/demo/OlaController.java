package ads.seg.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OlaController {

    @GetMapping
    public String olaMundo() {
        return "Ola Mundo";
    }
}
