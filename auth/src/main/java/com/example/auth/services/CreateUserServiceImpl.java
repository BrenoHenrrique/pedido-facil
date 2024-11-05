package com.example.auth.services;

import com.example.auth.assemblers.GenericAssembler;
import com.example.auth.dtos.UserSaveDTO;
import com.example.auth.entities.UserEntity;
import com.example.auth.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserServiceImpl implements CreateUserService {
    private final UserRepository repository;
    private final GenericAssembler assembler;
    private final PasswordEncoder passwordEncoder;

    public void save(UserSaveDTO param) {
        UserEntity entity = assembler.toModel(param, UserEntity.class);

        String passwordEncoded = passwordEncoder.encode(entity.getPassword());
        entity.setPassword(passwordEncoded);

        repository.save(entity);
    }
}
