package cn.rayest.springMVCTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rayest on 2016/11/4 0004.
 */
@Controller
public class NormalController {
    @Autowired
    ControllerService controllerService;

    @RequestMapping(value = "/normal", method = RequestMethod.GET)
    public String testPage(Model model){
        model.addAttribute("msg", controllerService.getTestContent());
        return "page";
    }
}

