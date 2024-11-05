package com.example.auth.services;

import com.example.auth.dtos.UserSaveDTO;

public interface CreateUserService {
    void save(UserSaveDTO param);
}
