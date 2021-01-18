package com.hcl.taskmanager.controller;

import com.hcl.taskmanager.data.service.UserService;
import com.hcl.taskmanager.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public ModelAndView registration() {
        return new ModelAndView("register", "user", new User());
    }
}
