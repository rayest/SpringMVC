package cn.rayest.controller;

import cn.rayest.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Rayest on 2016/10/2 0002.
 * 获取 xml 格式的数据
 */
@Controller
public class XmlController {
    @RequestMapping(value = "/xml", method = RequestMethod.POST)
    @ResponseBody
    public String getXml(@RequestBody Admin admin) {
        return admin.toString();
    }
}
