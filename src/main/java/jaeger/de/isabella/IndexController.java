package jaeger.de.isabella;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(Model model) {
        return "index";
    }

    @GetMapping(value = "/snippets/{snippet}")
    public String snippets(Model model, @PathVariable("snippet") String snippet) {

        switch (snippet) {
            case "progress_bar":
                return "snippets/progress_bar";
            default:
                return "snippets/not_found";

        }

    }


}
