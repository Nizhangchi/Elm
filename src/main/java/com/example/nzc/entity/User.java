package com.example.nzc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    private String userType;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String password;
    private Role role;

    public User(Role role) {
        this.role = role;
    }

    public void display() {
        System.out.println("This is a generic user.");
    }

    public Role getRole() {
        return role;
    }
    public User() {

    }
}
