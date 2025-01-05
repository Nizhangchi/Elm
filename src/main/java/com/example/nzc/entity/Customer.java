package com.example.nzc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    public Customer() {
        super(Role.CUSTOMER);
    }

    @Override
    public void display() {
        System.out.println("This is a Customer user.");
    }
//    private String name;
//    private String password;

}
