/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqh.service.impl;

import com.cloudinary.Cloudinary;
import com.tqh.pojo.Post;
import com.tqh.repository.PostRepository;
import com.tqh.service.PostService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class PostServiceImpl implements PostService{
    
    @Autowired
    private PostRepository postRepo;
    @Autowired
    private Cloudinary cloudinary;

    @Override
    public List<Post> getPosts(Map<String, String> params) {
        return this.postRepo.getPosts(params);
    }

    @Override
    public Long countPost() {
        return this.postRepo.countPost();
    }

    @Override
    public boolean addOrUpdatePost(Post p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Post getPostById(int id) {
        return this.postRepo.getPostById(id);
    }

    @Override
    public boolean deletePost(int id) {
        return this.postRepo.deletePost(id);
    }
    
}
