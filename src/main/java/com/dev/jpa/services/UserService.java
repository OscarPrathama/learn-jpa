package com.dev.jpa.services;


import java.util.Optional;

import com.dev.jpa.entities.User;
import com.dev.jpa.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    /**
     * Return users
     * 
     * @return Users
    */
    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    /**
     * Return user
     * 
     * @param Long id
     * @return user
    */
    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    /**
     * View user
    */

    /**
     * Update user
    */

    /**
     * Delete user
    */

}
