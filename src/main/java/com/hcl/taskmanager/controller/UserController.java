package com.hcl.taskmanager.controller;

import com.hcl.taskmanager.data.service.UserService;
import com.hcl.taskmanager.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public ModelAndView registration() {
        return new ModelAndView("register", "user", new User());
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute User user) {
        userService.register(user);
        return ("redirect:/");
    }

    @GetMapping("/") // login page is root
    public ModelAndView login() {
        return new ModelAndView("login", "user", new User());
    }

    @PostMapping("/") // post for login page at root
    public String validateLogin(@ModelAttribute User user) {
        if(userService.authenticate(user)) {
            return ("redirect:/task/create");
        }
        else {
            return "invalidLogin";
        }
    }

}
