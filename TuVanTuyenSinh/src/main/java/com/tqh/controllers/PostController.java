/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.controllers;

import com.tqh.pojo.Post;
import com.tqh.service.PostService;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

/**
 *
 * @author Admin
 */
@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public String list(Model model, Principal p) {
        model.addAttribute("post", new Post());
        return "posts";
    }
}
