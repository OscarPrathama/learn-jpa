package com.dev.jpa.controllers;

import java.util.List;
import java.util.Optional;

import com.dev.jpa.entities.Category;
import com.dev.jpa.entities.Post;
import com.dev.jpa.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
    
    @Autowired
    PostService postService;

    @GetMapping("")
    public Iterable<Post> index(){
        return postService.findAll();
    }

    @GetMapping("/{id}/categories")
    public List<Category> getPost(@PathVariable Long id){
        Optional<Post> post = postService.findById(id);
        if(post.isPresent()){
            return post.get().getCategories();
        }
        return null;
    }

}
