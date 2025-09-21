package com.xworkz.apollotech;

import com.xworkz.apollotech.hospital.Hospital;
import com.xworkz.apollotech.hospital.HospitalImpl;
import com.xworkz.apollotech.patient.Patient;

import java.util.Scanner;

public class HospitalRunner {
    public static void main(String[] args) {

//        Patient patient = new Patient(1,"ravi",25,"male","fever");
//
//        Patient patient1 = new Patient(2,"raju",20,"male","fever");
//
//        Patient patient2 = new Patient(3,"chethan",19,"male","liver problem");

        //        hospital.addPatient(patient);
//        hospital.addPatient(patient1);
//        hospital.addPatient(patient2);
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number of patients to be add");
        int size = scr.nextInt();
        Hospital hospital = new HospitalImpl(size);


        System.out.println("the available patients are " + hospital.size());


        for (int index = 0; index < size; index++) {
            Patient patient = new Patient();
            System.out.println("Enter the patient Id");
            int patientId = scr.nextInt();
            patient.setPatientId(patientId);

            System.out.println("Enter patient Name ");
            String patientName = scr.next();
            patient.setName(patientName);

            System.out.println("enter patient Age");
            int patientAge = scr.nextInt();
            patient.setAge(patientAge);

            System.out.println("Enter patient gender");

            patient.setGender(scr.next().toUpperCase());

            System.out.println("Enter the disease ");
//            String disease = scr.next();
            patient.setDisease(scr.next());

            hospital.addPatient(patient);
        }


        hospital.getAllPatientInfo();

        System.out.println("Enter id to update age");
     int id = scr.nextInt();
        System.out.println("Enter age to update");
        int age = scr.nextInt();

        boolean ageUpdated = hospital.updatePatientAgeById(age, id);
        System.out.println(ageUpdated);
        hospital.getAllPatientInfo();

        System.out.println("Enter Patient name to fetch gender");
      String gender =   hospital.getGenderByPatientName(scr.next());
        System.out.println(gender);

        System.out.println("enter patient name to update disease");
        String patName = scr.next();
        System.out.println("enter disease  name to update disease on patient" + patName);
        String diseaseName = scr.next();

     boolean diseaseupdated =  hospital.updateDiseaseNameByPatientName(patName,diseaseName);
        System.out.println(diseaseupdated);
          hospital.getAllPatientInfo();

        System.out.println("Enter id to update disease");
        int id1 = scr.nextInt();
        System.out.println("Enter disease to update id "+id1);
        String disease = scr.next();
        hospital.updateDiseaseById(disease,id1);
        hospital.getAllPatientInfo();

        System.out.println("Enter id to fetch patientName");
        String name = hospital.getPatientNameById(scr.nextInt());
        System.out.println(name);

        System.out.println("Enter id to fetch disease ");
        String disease1 = hospital.getDiseaseById(scr.nextInt());
        System.out.println(disease1);


        System.out.println("Enter id to fetch age");
       int age1 = hospital.getAgeById(scr.nextInt());
        System.out.println(age1);

        System.out.println("enter name to fetch Disease");
        String disease2 = hospital.getDiseaseByName(scr.next());
        System.out.println(disease2);
    }
}
