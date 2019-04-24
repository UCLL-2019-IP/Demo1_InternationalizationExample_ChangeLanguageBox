package be.ucll.ip.internationalization;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/international")
    public String international() {
        return "international";
    }
}