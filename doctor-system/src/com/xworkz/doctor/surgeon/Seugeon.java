package com.xworkz.doctor.surgeon;

import com.xworkz.doctor.doctor.Doctor;

public class Seugeon extends Doctor {

    public  Seugeon(){
        System.out.println("Seugeon constructor is invoked");
    }
    @Override
    public void type(){
        System.out.println(" only operation");
    }
}
