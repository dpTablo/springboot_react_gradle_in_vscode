package dptablo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/page")
public class PageController {
    @RequestMapping("/hello")
    public String helloPage(Model model) { 
        model.addAttribute("param1", "dptablo");
        return "hello";
    }
}