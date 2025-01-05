package com.example.nzc.service;

import com.example.nzc.entity.Role;
import com.example.nzc.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserFactory {

    User createUser(Role role);


}
