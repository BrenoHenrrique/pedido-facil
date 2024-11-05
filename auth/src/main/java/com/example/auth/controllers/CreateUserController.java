package com.example.auth.controllers;

import com.example.auth.dtos.UserSaveDTO;
import com.example.auth.services.CreateUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/create-users")
public class CreateUserController {
    private final CreateUserService createUserService;

    @PostMapping
    public void createUser(@RequestBody UserSaveDTO param) {
        createUserService.save(param);
    }
}
