package com.polyglot.appsecurity.model;

public class AccessModel {
   
    private Integer userId; 
    private String fullName;   
    private String userName;   
    private String password;

    public Integer getUserId() {
        return userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}