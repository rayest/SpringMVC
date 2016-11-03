package cn.rayest.controller;

import cn.rayest.model.User;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bogehu on 16/5/24.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/springMVC")
    public String helloSpringMVC() {
        return "helloSpringMVC";
    }

    @RequestMapping("/world")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }

    @RequestMapping("/json")
    @ResponseBody
    public JSONObject helloJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Sex", "Girl");
        jsonObject.put("Name", "Pay");
        jsonObject.put("City", "Lanzhou");
        return jsonObject;
    }

    // @ResponseBody:将对象封装成 json 对象，并返回
    @RequestMapping("/json2")
    @ResponseBody
    public User helloJson2() {
        User user = new User("Pay", "123456");
        return user;
    }
}
