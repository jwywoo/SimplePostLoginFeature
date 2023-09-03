package com.example.simplepostloginfeature.user.controller;

import com.example.simplepostloginfeature.user.dto.LoginRequestDto;
import com.example.simplepostloginfeature.user.dto.SignupRequestDto;
import com.example.simplepostloginfeature.user.dto.StringResponseDto;
import com.example.simplepostloginfeature.user.repository.UserRepository;
import com.example.simplepostloginfeature.user.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Signup
    @PostMapping("/signup")
    public StringResponseDto signUp(@RequestBody @Valid SignupRequestDto requestDto, BindingResult bindingResult)
    {
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if (fieldErrors.size() >0) return new StringResponseDto("Failed", "500");
        return userService.signup(requestDto);
    }
    // Login
    @PostMapping("/login")
    public StringResponseDto login(@RequestBody LoginRequestDto requestDto, HttpServletResponse res) {
        try {
            return userService.login(requestDto, res);
        } catch (Exception e) {
            return new StringResponseDto("Failed", "500");
        }
    }
}
