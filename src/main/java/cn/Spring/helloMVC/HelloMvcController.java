package cn.Spring.helloMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bogehu on 16/5/24.
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {
    @RequestMapping("/mvc")
    public String helloMvc(){
        return "home";
    }
}
