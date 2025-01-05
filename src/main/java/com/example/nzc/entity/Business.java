package com.example.nzc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Business extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer businessId;
    public Business() {
        super(Role.BUSINESS);
    }

    @Override
    public void display() {
        System.out.println("This is a Business user.");
    }
//    private String name;
//    private String password;
}
