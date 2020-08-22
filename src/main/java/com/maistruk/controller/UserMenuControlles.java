package com.maistruk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/users")
public class UserMenuControlles {
    
    @GetMapping(value = "/addUser")
    public String addUser(Model model) {
        return "addUser.html";
    }
    
    @GetMapping(value = "/getUserById")
    public String getUserById(Model model) {
        return "getUserById.html";
    }
    
    

}
