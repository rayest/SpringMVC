package cn.rayest.filter;

import org.springframework.stereotype.Service;

/**
 * Created by Rayest on 2016/10/22 0022.
 */
@Service
public class LoginService {

    public String login(User user) {
        String userName = user.getUsername();
        String password = user.getPassword();
        if (userName.equals("ray") && password.equals("1990")) {
            return "success";
        }
        return "fail";
    }
}
