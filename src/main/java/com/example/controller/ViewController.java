package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String showSignUpPage() {
        return "signup";
    }
}
