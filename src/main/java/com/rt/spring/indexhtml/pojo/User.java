package com.rt.spring.indexhtml.pojo;

public class User {
    private int UserId;
    private String UserName;
    private String Userbook;

    public User() {
    }

    public User(int userId, String userName, String userbook) {
        UserId = userId;
        UserName = userName;
        Userbook = userbook;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserbook() {
        return Userbook;
    }

    public void setUserbook(String userbook) {
        Userbook = userbook;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", Userbook='" + Userbook + '\'' +
                '}';
    }
}
