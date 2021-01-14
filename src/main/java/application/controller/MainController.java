package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/main/page")
    public ModelAndView getMainPage() {
        ModelAndView modelAndView = new ModelAndView("main-page");
        return modelAndView;
    }

}
