package cn.rayest.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Rayest on 2016/8/9 0009.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response){
        System.out.println("----登录验证----");

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        Cookie cookie = new Cookie("user", userName + "-" + password);
        cookie.setMaxAge(7 * 24 * 60 * 60);

        response.addCookie(cookie);

        User currentUser = new User(userName, password);
        HttpSession session = request.getSession();
        session.setAttribute("currentUser", currentUser);

        return "redirect:/main.jsp";
    }
}
