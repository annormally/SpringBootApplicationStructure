package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InternationalizationController {

    @GetMapping("/internationalization")
    public ModelAndView getInternationalization() {
        ModelAndView modelAndView = new ModelAndView("/internationalization");
        return modelAndView;
    }

}
