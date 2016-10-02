package cn.rayest.controller;

import cn.rayest.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rayest on 2016/10/2 0002.
 */

// json 格式的接收和返回
@Controller
public class JsonController {
    @RequestMapping(value = "/json", method = RequestMethod.POST)
    @ResponseBody
    public String getJson(@RequestBody User user){  // 接收的参数可以是 user 对象的部分参数
        return user.toString();
    }
}
