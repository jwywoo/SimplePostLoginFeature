package com.example.simplepostloginfeature.user.service;

import com.example.simplepostloginfeature.user.config.PasswordConfig;
import com.example.simplepostloginfeature.user.dto.LoginRequestDto;
import com.example.simplepostloginfeature.user.dto.SignupRequestDto;
import com.example.simplepostloginfeature.user.dto.StringResponseDto;
import com.example.simplepostloginfeature.user.entity.User;
import com.example.simplepostloginfeature.user.jwt.JwtUtil;
import com.example.simplepostloginfeature.user.repository.UserRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, JwtUtil jwtUtil, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
    }

    // Signup
    public StringResponseDto signup(SignupRequestDto requestDto) {
        String username = requestDto.getUsername();
        String password = passwordEncoder.encode(requestDto.getPassword());
        Optional<User> usernameChecked = userRepository.findByUsername(username);
        if (usernameChecked.isPresent()) {
            throw new IllegalArgumentException("Invalid username");
        }
        User user = new User(username, password);
        userRepository.save(user);
        return new StringResponseDto("Success", "200");
    }
    // Login
    public StringResponseDto login(LoginRequestDto requestDto, HttpServletResponse res) {
        String username = requestDto.getUsername();
        String password = requestDto.getPassword();

        User user = userRepository.findByUsername(username).orElseThrow(
                () -> new IllegalArgumentException("Invalid user credentials")
        );

        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new IllegalArgumentException("Invalid user credentials");
        }
        String token = jwtUtil.createToken(user.getUsername());
        jwtUtil.addJwtToCookie(token, res);
        return new StringResponseDto("Success", "200");
    }
}
