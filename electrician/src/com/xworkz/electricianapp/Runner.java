package com.xworkz.electricianapp;

import com.xworkz.electricianapp.electrician.Electrician;
import com.xworkz.electricianapp.impl.ElectricianImpl;

public class Runner {

    public static void main(String[] args) {
        Electrician electrician = new ElectricianImpl();
        electrician.installWiring();
        electrician.repairCircuit();
        electrician.testConnection();
    }
}
