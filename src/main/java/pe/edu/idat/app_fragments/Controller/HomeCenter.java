package pe.edu.idat.app_fragments.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCenter {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
