package main.java.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {


    @RequestMapping(value = "/")
    public String test(){
        System.out.println("asd");

        return "index";

    }
}
