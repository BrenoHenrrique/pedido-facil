package com.example.auth.dtos;

import lombok.Data;

@Data
public class UserAuthenticateDTO {
    private String token;
    private String username;
}
