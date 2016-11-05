package cn.rayest.xml;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Rayest on 2016/10/2 0002.
 * 获取 xml 格式的数据
 */
@Controller
public class XmlController {
    @RequestMapping(value = "/xml", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String getXml(@RequestBody Admin admin) {
        return admin.toString();
    }
}
