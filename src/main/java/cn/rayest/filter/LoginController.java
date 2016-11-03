package cn.rayest.filter;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;

/**
 * Created by Rayest on 2016/10/22 0022.
 */
@Controller
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/filter/login", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String login(@RequestBody User user) {
        return loginService.login(user);

    }
}
