package com.wchy.demo.dto;

public class User {

    Account account = new Account("1", "2", "3");

    String userName;

    public String getUserName() {
        return account.getUserName();
    }
}
