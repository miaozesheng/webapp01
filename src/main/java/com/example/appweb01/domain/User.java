package com.example.appweb01.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: appweb01
 * @description: 用户表
 * @author: Mr.Miao
 * @create: 2021-01-24 14:54
 **/

@Data
public class User implements Serializable {

    private String username;
    private String password;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
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
}
