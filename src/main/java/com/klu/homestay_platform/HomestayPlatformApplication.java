package com.klu.homestay_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.klu.homestay_platform.repository")
public class HomestayPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomestayPlatformApplication.class, args);
    }
}
