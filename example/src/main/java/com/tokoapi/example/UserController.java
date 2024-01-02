package com.tokoapi.example;

import org.springframework.web.bind.annotation.RestController;

import com.tokoapi.example.model.User;
import com.tokoapi.example.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
    @Autowired
    UserRepo usrRepo;

    @PostMapping("/user/register")
    public void addUser(@RequestBody User user) {
        usrRepo.save(user);
    }

}
