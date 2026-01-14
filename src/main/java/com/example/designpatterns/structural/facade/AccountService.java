package com.example.designpatterns.structural.facade;

class AccountService {
    void createAccount(String name) {
        System.out.println("Account created for " + name);
    }
}
