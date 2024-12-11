package com.klu.homestay_platform.Service;

import com.klu.homestay_platform.User;
import com.klu.homestay_platform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {

    @Autowired
    private UserRepository userRepository;

    // Register a new user
    public User registerUser(String email, String password, String name) {
        // Check if user already exists
        if (userRepository.findByEmail(email) != null) {
            throw new RuntimeException("User already exists!");
        }

        // Save the new user
        User user = new User(name, email, password);
        return userRepository.save(user);
    }

    // Authenticate user (login)
    public User authenticateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            throw new RuntimeException("Invalid email or password");
        }
    }
}
