package com.snaacker.playground.reflection.example;

import java.io.Serializable;

/**
 * Created by quanghuy on 8/20/17.
 */
public class MyChildClass extends MyClass implements Serializable{
    private String email = null;

    public String check;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
