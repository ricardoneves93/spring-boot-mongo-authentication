package com.example.controller;

import com.example.model.CustomUserDetails;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {

        this.userService = userService;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String save(@ModelAttribute(value = "signupinfo") CustomUserDetails userDetails) {

        this.userService.save(userDetails);
        return "index";
    }
}
