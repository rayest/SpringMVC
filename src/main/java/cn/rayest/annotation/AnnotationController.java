package cn.rayest.annotation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by Rayest on 2016/10/31 0031.
 */
@RestController
@RequestMapping("/request")
public class AnnotationController {

    @RequestMapping(value = "/parameter", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getParameter(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        if ("ray".equals(name) && age == 26) {
            return "OK";
        }
        return "Error";
    }

    @RequestMapping(value = "/body", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String getFromBody(@RequestBody Annotation annotation) {
        String requestParameter = annotation.getRequestParameter();
        Object requestBody = annotation.getRequestBody();
        if (requestParameter.equals("requestParameter") && requestBody.equals("requestBody")) {
            return "OK";
        }
        return "Error";
    }

    @RequestMapping(value = "/path/{name}", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseStatus(value = HttpStatus.OK)
    public String getResponseBody(@PathVariable("name") String name) {
        if (name.equals("lee")) {
            return "lee";
        }
        return "Not Lee";
    }

    @RequestMapping(value = "/model/redirect", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public ModelAndView redirectToModel() {
        // return new ModelAndView("redirect:https://www.baidu.com/");
        return new ModelAndView("redirect:http://a.app.qq.com/o/simple.jsp?pkgname=com.ucardstore.Activity");
    }

    @RequestMapping(value = "/string/redirect", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String redirectToString() {
        // 返回字符串内容，而非访问 url 的页面
        //   return "redirect:https://www.baidu.com";
        return "redirect:http://a.app.qq.com/o/simple.jsp?pkgname=com.ucardstore.Activity";
    }

    @RequestMapping(value = "/view/redirect", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public ModelAndView redirectToView() {
        // return new ModelAndView(new RedirectView("https://www.baidu.com"));
        return new ModelAndView(new RedirectView("http://a.app.qq.com/o/simple.jsp?pkgname=com.ucardstore.Activity"));
    }


}
