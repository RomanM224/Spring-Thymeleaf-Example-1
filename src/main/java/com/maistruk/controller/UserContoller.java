package com.maistruk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.maistruk.dao.UserRepository;
import com.maistruk.model.User;



@Controller
public class UserContoller {
    
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/save")
    public String addUser(User user) {
        System.out.println(user);
        userRepository.save(user);
        return "index.html";
    }
    
    @RequestMapping("/getUserById")
    public ModelAndView getById(@RequestParam("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("getUser.html");
        User user =  userRepository.findById(id).orElse(new User());
        modelAndView.addObject("user", user);
        return modelAndView;
    }
//    
//    @RequestMapping("/getUserById")
//    public String getById(Model model) {
//        User user =  userRepository.findById(101).orElse(new User());
//        model.addAttribute("user", user);
//        return "getUser.html";
//    }
}