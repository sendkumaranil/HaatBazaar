package com.hatbazar.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

	@RequestMapping(value="/" , method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "HaatBazaar OnlineShopping!! Enjoy Shopping ");
        return "welcome";
    }
 
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("login", "you have to register before shopping here");
        return "login";
    }
}
