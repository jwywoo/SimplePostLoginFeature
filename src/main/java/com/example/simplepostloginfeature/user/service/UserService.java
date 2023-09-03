package com.example.simplepostloginfeature.user.service;

import com.example.simplepostloginfeature.user.dto.StringResponseDto;
import com.example.simplepostloginfeature.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Signup
    public StringResponseDto signup() {
        return null;
    }
    // Login
    public StringResponseDto login() {
        return null;
    }
}
