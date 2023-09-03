package com.example.simplepostloginfeature.user.dto;

import lombok.Setter;

@Setter
public class StringResponseDto {
    private String msg;
    private String statusCode;

    public StringResponseDto(String msg, String statusCode) {
        this.msg = msg;
        this.statusCode = statusCode;
    }
}
