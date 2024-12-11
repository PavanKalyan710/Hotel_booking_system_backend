package com.klu.homestay_platform.Controller;

import com.klu.homestay_platform.User;
import com.klu.homestay_platform.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private Userservice userService;

    @PostMapping("/login")
    public User login(@RequestBody User loginUser) {
        return userService.authenticateUser(loginUser.getEmail(), loginUser.getPassword());
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User newUser) {
        return userService.registerUser(newUser.getEmail(), newUser.getPassword(), newUser.getName());
    }
}
