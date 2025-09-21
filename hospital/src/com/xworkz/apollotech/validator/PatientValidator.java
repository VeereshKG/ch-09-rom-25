package com.xworkz.apollotech.validator;

import com.xworkz.apollotech.patient.Patient;

public class PatientValidator {
    public boolean isPatientDetailsValid(Patient patientDetails){
        boolean isDeatilsValid=false;

        boolean isIdValid=false;
        boolean isNameValid=false;
        boolean isGenderValid=false;
        boolean isDeseaseNameValid=false;


        if (patientDetails.getPatientId() > 0) {
            isIdValid=true;
        }else{
            System.out.println("the given id is not valid");
        }
        if(patientDetails.getName()!=null ){
            isNameValid=true;
        }
        else{
            System.out.println("the given Name is not valid");
        }

        if(patientDetails.getGender()!=null){
            isGenderValid=true;
        }else{
            System.out.println("the gender is not valid");
        }
        if(patientDetails.getDisease()!=null ){
            isDeseaseNameValid=true;
        }else{
            System.out.println("the given Disease Name is not valid");
        }
        if(isIdValid&&isNameValid&&isGenderValid&&isDeseaseNameValid){
            isDeatilsValid=true;
        }else{
            System.out.println("the given  details is not valid");
        }

        return isDeatilsValid;
    }
}
