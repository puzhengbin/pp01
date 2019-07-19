package com.pzb.beetlpro.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserPzb implements Serializable {

    private int id;
    private String username;
    private String password;
    private int age;
    private String email;
    private String phone;
}
