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

    @RequestMapping(value = "/baseType/age", method = RequestMethod.GET) // �������͵����ݣ���ֵ����Ϊ�գ� http://localhost:8080/baseType?age=100
    @ResponseBody
    public String baseType(int age){
        return "name:" + age;
    }

    @RequestMapping(value = "/baseType/name", method = RequestMethod.GET)
    @ResponseBody
    public String baseType2(@RequestParam (value = "name") String name){   // @RequestParam:Ҫ���ע��Ĳ������봫
        return "name:" + name;
    }

    

}