package cn.rayest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rayest on 2016/9/20 0020.
 */
@RestController
public class StringController {

    @RequestMapping("/string")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody // 直接返回内容的注解
    public String getString(){
        return "card";  // 直接返回字符串内容而非 JSP 视图
    }
}
