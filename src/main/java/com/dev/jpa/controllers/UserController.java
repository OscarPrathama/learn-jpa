package com.dev.jpa.controllers;

import com.dev.jpa.entities.User;

import java.util.Optional;

import com.dev.jpa.entities.Post;
import com.dev.jpa.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    UserService userService;

    /**
     * get all users
    */
    @GetMapping("")
    public Iterable<User> index(){
        return userService.getUsers();
    }

    /**
     * get user and their post
    */
    @GetMapping("/{id}/posts")
    public Iterable<Post> userPosts(@PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        if(user.isPresent()){
            return user.get().getPost();
        }
        return null;
    }
    

}
