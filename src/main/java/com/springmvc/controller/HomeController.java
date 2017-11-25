package com.springmvc.controller;


import com.springmvc.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/home/display")
    @ResponseBody
    public String display() {
        return "Hello AMir";
    }

    @RequestMapping(value = "/home/admin")
    @ResponseBody
    public String admin() {
        return "Admin page";
    }


    @RequestMapping(value = "/myLogin")
    public String myLogin() {
        return "myLogin";
    }



}
