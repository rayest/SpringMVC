package cn.rayest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rayest on 2016/10/4 0004.
 */

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String sayHelloWorld(ModelMap model){
        model.addAttribute("greeting", "Hello World");
        return "welcome";
    }
}
