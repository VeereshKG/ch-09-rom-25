package com.xworkz.registerapp.impl;

import com.xworkz.registerapp.register.Register;

public class UserImpl implements Register {
    @Override
    public void addUser() {
        System.out.println("add");

    }

    @Override
    public void deleteUser() {
        System.out.println("delete");
    }

    @Override
    public void updateUser() {
        System.out.println("update");
    }
}
