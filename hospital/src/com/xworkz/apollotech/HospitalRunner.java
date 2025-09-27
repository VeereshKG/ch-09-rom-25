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
        System.out.println("The available patients are: " + hospital.size());
        boolean isAdded = false;
        for (int index = 0; index < size; index++) {
            Patient patient = new Patient();

            System.out.println("Enter the patient Id: ");
            patient.setPatientId(scr.nextInt());

            System.out.println("Enter patient Name: ");
            patient.setName(scr.next());

            System.out.println("Enter patient Age: ");
            patient.setAge(scr.nextInt());

            System.out.println("Enter patient Gender (MALE/FEMALE): ");
            patient.setGender(scr.next().toUpperCase());

            System.out.println("Enter patient Disease: ");
            patient.setDisease(scr.next());

            isAdded = hospital.addPatient(patient);
        }
        if (isAdded == true) {
            String input = null;
            do {

                System.out.println("Press 1 to Get All Patient Info");
                System.out.println("Press 2 to Update Patient Age by Id");
                System.out.println("Press 3 to Get Gender by Patient Name");
                System.out.println("Press 4 to Update Disease by Patient Name");
                System.out.println("Press 5 to Update Disease by Id");
                System.out.println("Press 6 to Get Patient Name by Id");
                System.out.println("Press 7 to Get Disease by Id");
                System.out.println("Press 8 to Get Age by Id");
                System.out.println("Press 9 to Get Disease by Name");

                int option = scr.nextInt();
                switch (option) {
                    case 1:
                        hospital.getAllPatientInfo();
                        break;
                    case 2:
                        System.out.println("Enter patient Id to update patient age ");
                        int id = scr.nextInt();
                        System.out.println("Enter new Age ");
                        int age = scr.nextInt();
                        boolean ageUpdated = hospital.updatePatientAgeById(age, id);
                        System.out.println("Age updated: " + ageUpdated);
                        break;
                    case 3:
                        System.out.println("Enter patient name to get Gender ");
                        String nameForGender = scr.next();
                        String gender = hospital.getGenderByPatientName(nameForGender);
                        System.out.println("Gender: " + gender);
                        break;
                    case 4:
                        System.out.println("Enter patient name to update DiseaseName");
                        String patientName = scr.next();
                        System.out.println("Enter new Disease: ");
                        String diseaseName = scr.next();
                        boolean diseaseUpdated = hospital.updateDiseaseNameByPatientName(patientName, diseaseName);
                        System.out.println("Disease updated: " + diseaseUpdated);
                        break;
                    case 5:
                        System.out.println("Enter patient Id to update Disease ");
                        int id1 = scr.nextInt();
                        System.out.println("Enter new Disease: ");
                        String disease = scr.next();
                        boolean updated = hospital.updateDiseaseById(disease, id1);
                        System.out.println("Disease updated: " + updated);
                        break;
                    case 6:
                        System.out.println("Enter patient Id to get PatientName ");
                        int id2 = scr.nextInt();
                        String patientNameById = hospital.getPatientNameById(id2);
                        System.out.println("Patient name: " + patientNameById);
                        break;
                    case 7:
                        System.out.println("Enter patient Id to get Disease ");
                        int id3 = scr.nextInt();
                        String diseaseById = hospital.getDiseaseById(id3);
                        System.out.println("Disease: " + diseaseById);
                        break;
                    case 8:
                        System.out.println("Enter patient Id to get age ");
                        int id4 = scr.nextInt();
                        int ageById = hospital.getAgeById(id4);
                        System.out.println("Age: " + ageById);
                        break;
                    case 9:
                        System.out.println("Enter patient name to get disease ");
                        String nameForDisease = scr.next();
                        String diseaseByName = hospital.getDiseaseByName(nameForDisease);
                        System.out.println("Disease: " + diseaseByName);
                        break;
                    default:
                        System.out.println("Please enter a valid option");
                }

                System.out.println("Do you want to continue yes/no: ");
                input = scr.next();
            } while (input.equalsIgnoreCase("yes"));

            System.out.println("Thank you.. Visit again");
        } else System.out.println("patient not added");
    }
}
