package com.example.nzc.controller;

import com.example.nzc.entity.Role;
import com.example.nzc.entity.User;
import com.example.nzc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private  UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/business")
    public ResponseEntity<String> createBusinessUser() {
        User businessUser = userService.createUser(Role.BUSINESS);
        businessUser.display();
        return ResponseEntity.ok("Business user created.");
    }

    @PostMapping("/customer")
    public ResponseEntity<String> createCustomerUser() {
        User customerUser = userService.createUser(Role.CUSTOMER);
        customerUser.display();
        return ResponseEntity.ok("Customer user created.");
    }
}
