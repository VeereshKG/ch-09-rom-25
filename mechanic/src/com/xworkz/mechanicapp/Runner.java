package com.xworkz.mechanicapp;

import com.xworkz.mechanicapp.impl.MechanicImpl;
import com.xworkz.mechanicapp.mechanic.Mechanic;

public class Runner {
    public static void main(String[] args) {
        Mechanic mechanic = new MechanicImpl();
        mechanic.inspect();
        mechanic.repair();
        mechanic.test();
    }

}
