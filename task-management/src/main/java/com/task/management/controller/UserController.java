package com.task.management.controller;

import com.task.management.entities.User;
import com.task.management.payload.LoginUser;
import com.task.management.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired private UserRepo userRepo;
    @Autowired private PasswordEncoder passwordEncoder;
    @PostMapping
    public User save(@RequestBody User user)
    {
        String password = user.getPassword();

        user.setPassword(passwordEncoder.encode(password));

        return userRepo.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginUser loginUser ){

        String encode = passwordEncoder.encode(loginUser.getPassword());
         User user = userRepo.findByUsernameOrPassword(loginUser.getUsername(), encode);
        if(user==null) {
            return "Bad credential here !!!";
        }
        return "Login successfully ";
    }
}
