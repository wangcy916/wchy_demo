package com.wchy.demo.dto;

public class Account {

    private String id;
    private String userName;
    private String mobile;

    public Account() {
    }

    public Account(String id, String userName, String mobile) {
        this.id = id;
        this.userName = userName;
        this.mobile = mobile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
