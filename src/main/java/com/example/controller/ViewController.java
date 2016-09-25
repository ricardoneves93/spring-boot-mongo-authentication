package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @RequestMapping(name = "index", value = "/", method = RequestMethod.GET)
    public ModelAndView showHomePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/login")
    public String showLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String showSignUp() {
        return "signup";
    }
}
