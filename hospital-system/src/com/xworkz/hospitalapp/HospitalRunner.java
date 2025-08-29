package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.apollo.Apollo;
import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Hospital hospital = new Apollo();
        hospital.admit();
        System.out.println("main ended");

    }
}
