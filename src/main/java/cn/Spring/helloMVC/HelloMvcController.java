package cn.Spring.helloMVC;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bogehu on 16/5/24.
 */
@Controller
@RequestMapping("/hello")
public class HelloMVCController {
    @RequestMapping("/mvc")
    public String helloMVC(){
        return  "home";
    }
    @RequestMapping("/rest")
    @ResponseBody
    public JSONObject helloRest(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("name","bogehu");
        return jsonObject;
    }

}
