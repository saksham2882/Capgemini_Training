package com.cg.controller;

import com.cg.bean.UserBean;
import com.cg.exception.InvalidUser;
import com.cg.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody UserBean ub, HttpSession session) {
        UserBean u = loginService.validateUser(ub);
        if (u != null) {
            session.setAttribute("name", u.getUserId());
            return "Login Success";
        } else {
            throw new InvalidUser("Invalid User");
        }
    }


    @GetMapping("/logout")
    public String logout(HttpSession session) {
        if(session.getAttribute("name") != null) {
            session.invalidate();
            return "Logout Success";
        }
        return "Logout Fail";
    }
}
