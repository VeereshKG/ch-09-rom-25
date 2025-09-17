package com.xworkz.registerapp;

import com.xworkz.registerapp.impl.UserImpl;
import com.xworkz.registerapp.register.Register;

public class RegisterRunner {

    public static void main(String[] args) {

        Register register = new UserImpl();
        register.addUser();
        register.updateUser();
        register.deleteUser();
    }
}
