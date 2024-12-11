package com.klu.homestay_platform.repository;

import com.klu.homestay_platform.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(String email);  // Query to find user by email

}
