package com.xworkz.doctor;

import com.xworkz.doctor.doctor.Doctor;
import com.xworkz.doctor.surgeon.Seugeon;

public class DoctorRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        Doctor doctor = new Seugeon();
        doctor.type();
        System.out.println("main ended");
    }
}
