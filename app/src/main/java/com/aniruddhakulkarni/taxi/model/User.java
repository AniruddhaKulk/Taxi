package com.aniruddhakulkarni.taxi.model;

/**
 * Created by aniruddhakulkarni on 07/05/18.
 */

public class User {
    private String email, password, name, phone;

    public User(String email, String password, String name, String phone) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
