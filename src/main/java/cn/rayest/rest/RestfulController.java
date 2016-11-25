package cn.rayest.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Rayest on 2016/10/3 0003.
 */

@Controller
public class RestfulController {

    @RequestMapping(value = "/book", method = RequestMethod.POST)
    @ResponseBody
    public String getBook(HttpServletRequest request) {
        String contentType = request.getContentType(); // 根据 contentType 类型
        if (contentType == null) {
            return "book.default";
        } else if (contentType.equals("txt")) {
            return "book.txt";
        } else if (contentType.equals("html")) {
            return "book.html";
        }
        return "book.default";
    }

    // 关键：{ } 和 @pathVariable
    // Restful 的 post 请求
    @RequestMapping(value = "/subject/{subjectId}", method = RequestMethod.POST)
    @ResponseBody
    public String postRestful(@PathVariable("subjectId") String subjectId) {
        return "This is post method, subjectId is: " + subjectId;
    }

    // restful 的 get 请求
    @RequestMapping(value = "/subject/{subjectId}", method = RequestMethod.GET)
    @ResponseBody
    public String getRestful(@PathVariable("subjectId") String subjectId) {
        return "This is get method，subjectId is: " + subjectId; // 有别于其他三种请求方法的 responseBody: This is get method?subjectId is: 1259（有问号）
    }

    // restful 的 delete 请求
    @RequestMapping(value = "/subject/{subjectId}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteRestful(@PathVariable("subjectId") String subjectId) {
        return "This is delete method, subjectId is: " + subjectId;
    }

    // restful 的 put 请求
    @RequestMapping(value = "subject/{subjectId}", method = RequestMethod.PUT)
    @ResponseBody
    public String putMethod(@PathVariable("subjectId") String subjectId) {
        return "This is put method, subjectId is: " + subjectId;
    }
}
