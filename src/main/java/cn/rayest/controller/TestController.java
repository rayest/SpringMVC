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
    // �������͵����ݣ���ֵ����Ϊ��: ������ age ����ֵ
    @RequestMapping(value = "/baseType/age", method = RequestMethod.GET)
    @ResponseBody
    public String baseType(int age){
        return "name:" + age;
    }

    // @RequestParam:Ҫ���ע��Ĳ������봫
    @RequestMapping(value = "/baseType/name", method = RequestMethod.GET)
    @ResponseBody
    public String baseType2(@RequestParam (value = "name") String name){
        return "name:" + name;
    }

    // TODO: http://localhost:8080/boxType/age
    // springMVC �԰�װ���͵����ݴ���, ��������ݿ���Ϊ��
    @RequestMapping(value = "/boxType/age", method = RequestMethod.POST)
    @ResponseBody
    public String boxType(Integer age){
        return "age:" + age;
    }


    // TODO:  http://localhost:8080/array?names=Ray&names=Pay&names=Paris
    // �������͵����ݵİ�
    @RequestMapping(value = "/array", method = RequestMethod.GET)
    @ResponseBody
    public String getArray(String[] names){
        StringBuilder stringBuilder = new StringBuilder();
        for (String name : names){
            stringBuilder.append(name).append(", ");
        }
        return stringBuilder.toString();
    }

}
