package com.example.simplepostloginfeature.user.controller;

import com.example.simplepostloginfeature.user.dto.LoginRequestDto;
import com.example.simplepostloginfeature.user.dto.StringResponseDto;
import com.example.simplepostloginfeature.user.repository.UserRepository;
import com.example.simplepostloginfeature.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Signup
    @PostMapping("/signup")
    public StringResponseDto signUp() {
        return null;
    }
    // Login
    @PostMapping("/login")
    public StringResponseDto login(@RequestBody LoginRequestDto loginRequestDto) {
        return null;
    }
}
