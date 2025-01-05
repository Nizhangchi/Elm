package com.example.nzc.service;

import com.example.nzc.entity.Role;
import com.example.nzc.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserFactory userFactory;

    public UserService(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    public User createUser(Role role) {
        return userFactory.createUser(role);
    }
}
