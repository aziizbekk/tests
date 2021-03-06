package uz.pdp.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "greeting";
    }
    @GetMapping(value = "/salom")
    public String helloGet(Model model ){
        model.addAttribute("name", "salom");
        return "greeting";
    }
}
