package com.model;

public class User {
    private String username;
    private String password;
    private String gender;
    private String national;

    public User() {
    }

    public User(String username, String password, String gender, String national) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.national = national;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }
}
