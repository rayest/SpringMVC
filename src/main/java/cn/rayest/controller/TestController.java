package cn.rayest.controller;

import cn.rayest.model.Book;
import cn.rayest.model.User;
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
    // 基本类型的数据，其值不能为空: 必须有 age 参数值
    @RequestMapping(value = "/baseType/age", method = RequestMethod.GET)
    @ResponseBody
    public String baseType(int age) {
        return "name:" + age;
    }

    // @RequestParam:要求该注解的参数必须传
    @RequestMapping(value = "/baseType/name", method = RequestMethod.GET)
    @ResponseBody
    public String baseType2(@RequestParam(value = "name") String name) {
        return "name:" + name;
    }

    // TODO: http://localhost:8080/boxType/age
    // springMVC 对包装类型的数据处理, 传入的数据可以为空
    @RequestMapping(value = "/boxType/age", method = RequestMethod.POST)
    @ResponseBody
    public String boxType(Integer age) {
        return "age:" + age;
    }


    // TODO:  http://localhost:8080/array?names=Ray&names=Pay&names=Paris
    // 数组类型的数据的绑定
    @RequestMapping(value = "/array", method = RequestMethod.GET)
    @ResponseBody
    public String getArray(String[] names) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String name : names) {
            stringBuilder.append(name).append(", ");
        }
        return stringBuilder.toString();
    }

    // 简单对象的数据绑定
    // TODO:  http://localhost:8080/book?name=sanpao&author=sipao
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    @ResponseBody
    public String getBook(Book book) {
        return book.toString();
    }

    // 多层级对象的数据绑定
    // TODO  http://localhost:8080/user/address?id=123&userName=lee&password=456&address.country=china&address.city=nanjing&address.code=210094
    @RequestMapping(value = "/user/address", method = RequestMethod.POST)
    @ResponseBody
    public String getUser(User user){
        return user.toString();
    }
}
