package com.example.auth.repositories;

import com.example.auth.entities.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepository {
    private final UserDAO dao;

    public void save(UserEntity entity) {
        dao.save(entity);
    }
}
