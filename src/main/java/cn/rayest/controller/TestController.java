package cn.rayest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rayest on 2016/9/25 0025.
 */
@Controller
public class TestController {

    // TODO: http://localhost:8080/baseType?age=100
    @RequestMapping(value = "/baseType/age", method = RequestMethod.GET) // 基本类型的数据，其值不能为空，
    @ResponseBody
    public String baseType(int age){
        return "name:" + age;
    }

    @RequestMapping(value = "/baseType/name", method = RequestMethod.GET)
    @ResponseBody
    public String baseType2(@RequestParam (value = "name") String name){   // @RequestParam:要求该注解的参数必须传
        return "name:" + name;
    }

    // TODO: http://localhost:8080/boxType/age
    @RequestMapping(value = "/boxType/age", method = RequestMethod.POST)
    @ResponseBody
    public String boxType(Integer age){ // springMVC 对包装类型的数据处理, 传入的数据可以为空
        return "age:" + age;
    }

    

}
