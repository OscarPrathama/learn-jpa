package com.dev.jpa.services;

import java.util.Optional;

import com.dev.jpa.entities.Post;
import com.dev.jpa.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    
    @Autowired
    PostRepository postRepository;

    public Iterable<Post> findAll(){
        return postRepository.findAll();
    }

    // public Optional<User> findById(Long id){
    //     return userRepository.findById(id);
    // }

    public Optional<Post> findById(Long id){
        return postRepository.findById(id);
    }

}
