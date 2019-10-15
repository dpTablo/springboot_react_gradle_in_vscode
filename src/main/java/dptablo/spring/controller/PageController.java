package dptablo.spring.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/page")
public class PageController {
    @Autowired
    private ServletContext servletContext;

    @Autowired
    private ApplicationArguments args;
    
    @RequestMapping("/hello")
    public String helloPage(Model model) { 
        model.addAttribute("param1", "dptablo");
        return "hello";
    }

    @GetMapping(path = "/react/index")
    public String reactIndexPage(Model model) {   
        model.addAttribute("contextPath", servletContext.getContextPath());
        model.addAttribute("pageName", "index");
        model.addAttribute("header_title", "React Index.jsx");
        return "reactPage";
    }

    @GetMapping(path = "/react/page2")
    public String reactPage2(Model model) {        
        model.addAttribute("contextPath", servletContext.getContextPath());
        model.addAttribute("pageName", "page2");
        model.addAttribute("header_title", "React Page2.jsx");
        return "reactPage";
    }
}