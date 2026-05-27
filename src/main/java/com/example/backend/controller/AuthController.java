package com.example.backend.controller;

import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")

public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User register(@RequestBody User user) {

        user.setRole("CUSTOMER");

        return userRepository.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        Optional<User> existingUser =
                userRepository.findByEmail(user.getEmail());

        if(existingUser.isPresent()) {

            User dbUser = existingUser.get();

            if(dbUser.getPassword().equals(user.getPassword())) {

                return "Login Success";
            }
        }

        return "Invalid Email or Password";
    }
}