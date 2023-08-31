/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.controllers;

import com.tqh.pojo.Users;
import com.tqh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Admin
 */
@Controller
@PropertySource("classpath:configs.properties")
public class UserController {
    
    @Autowired
    private UserService userService;
    @Autowired
    private Environment env;

//    @GetMapping("/users")
//    public String list(Model model) {
//        model.addAttribute("user", new Users());
//        return "users";
//    }
//
//    @GetMapping("/users/{username}")
//    public String update(Model model, @PathVariable(value = "username") String username) {
//        model.addAttribute("user", this.userService.getUserByUn(username));
//        return "users";
//    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @GetMapping("/register")
    public String register(){
        return "register";
    }
    @PostMapping("/register")
    public String processRegistrationForm(Users u, Model model) {        
        model.addAttribute("successMessage", "Đăng ký thành công!");
        return "register-success"; // Trang hiển thị thông báo đăng ký thành công
    }
    
}
