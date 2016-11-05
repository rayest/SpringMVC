package cn.rayest.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rayest on 2016/11/5 0005.
 */
@RestController
public class MyRestController {
    @Autowired
    ControllerService controllerService;

    @RequestMapping(value = "/rest", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String testRestController() {
        return controllerService.getTestContent();
    }
}
