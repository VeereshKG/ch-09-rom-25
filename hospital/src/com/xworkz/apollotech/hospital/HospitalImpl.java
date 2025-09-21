package com.xworkz.apollotech.hospital;

import com.xworkz.apollotech.patient.Patient;
import com.xworkz.apollotech.validator.PatientValidator;

public class HospitalImpl implements Hospital {

   public HospitalImpl(int size){
        patients = new Patient[size];

    }

   public Patient[] patients ;
   int index;
   PatientValidator patientValidator  = new PatientValidator();

   @Override
   public boolean addPatient (Patient patient) {
       boolean isPatientAdded = false;

       if (patient != null) {
           if (patientValidator.isPatientDetailsValid(patient)) {
               patients[index++] = patient;
               isPatientAdded = true;
           }
       } else
           System.out.println("invalid patient");

       return isPatientAdded;
   }
@Override
   public void getAllPatientInfo() {
       System.out.println("the list of Patients are :");
       for (Patient patient : patients) {
           System.out.println("the patient id is: " + patient.getPatientId());
           System.out.println("the patient name is: "+patient.getName());
           System.out.println("the patient age is : "+patient.getAge());
           System.out.println("the patient gender is: "+patient.getGender());
           System.out.println("the disease name is: "+patient.getDisease());
           System.out.println("-------------------------------------");
       }
   }
   @Override
   public boolean updatePatientAgeById(int updatedAge  , int existingId){
       System.out.println("invoked updatePatientAgeById");
       boolean ageUpdated = false;
       for (Patient patient : patients){
           if(patient.getPatientId() == existingId){
               patient.setAge(updatedAge);
               ageUpdated = true;
               System.out.println("Age is updated");
           }
       }   if(ageUpdated == false)
           System.out.println("the id is not available");


       return ageUpdated;

   }
@Override
  public String getGenderByPatientName(String patientName) {
      String gender = null;
      if (patientName != null){
          for (Patient patient : patients) {
              if (patient.getName().equals(patientName)) {
                  gender = patient.getGender();
              }
          }
      }
      if (gender == null) System.out.println(patientName+"not found");
      return gender;
  }
@Override
public boolean updateDiseaseNameByPatientName(String existingName ,String updateDiseaseName){

       boolean isDeaseUpdated = false;

       if (existingName != null){
           for (Patient patient : patients){
               if (patient.getName().equals(existingName)) {
                   patient.setDisease(updateDiseaseName);
                   isDeaseUpdated = true;
                   System.out.println("updated successfully");
               }
               }

       }
       if (isDeaseUpdated == false) System.out.println("not updated");
    return isDeaseUpdated;
}
@Override
  public boolean updateDiseaseById(String updateDisease  , int existingId){
       boolean isdiseaseupdated = false;

       if (existingId != 0){
           for (Patient patient : patients){
               if (patient.getPatientId() == (existingId)){
                   patient.setDisease(updateDisease);
                   isdiseaseupdated = true;
                   System.out.println("disease updated successfully");
               }
           }
       }
       if (isdiseaseupdated == false) System.out.println("id not found");
       return isdiseaseupdated;
  }
@Override
  public  String getPatientNameById(int id){
       String patientName = null;
       if(id != 0){
           for (Patient patient : patients){
               if (patient.getPatientId() == (id)){
                   patientName = patient.getName();
                   System.out.println("fetch name by id successfully");
               }
           }
       }
       if(patientName == null) System.out.println("id not available");
       return patientName;
  }
@Override
  public String getDiseaseById(int id){
       String disease = null;
       if(id != 0){
           for (Patient patient : patients){
               if (patient.getPatientId() == id){
                   disease = patient.getDisease();
                   System.out.println("disease fetched");
               }
           }
       }
       if(disease == null) System.out.println("Id is not found");
      return disease;
  }
@Override
    public int getAgeById(int id){
        int age = 0;
        if(id != 0){
            for (Patient patient : patients){
                if (patient.getPatientId() == id){
                    age = patient.getAge();
                    System.out.println("age fetched");
                }
            }
        }
        if(age == 0) System.out.println("Id is not found");
        return age;
    }
@Override
   public String getDiseaseByName(String name){

       String disease = null;
       if(name != null){
           for (Patient patient : patients){
               if (patient.getName().equals(name)){
                   disease = patient.getDisease();
                   System.out.println("disease fetched successfully");
               }
           }
       }
       if (disease == null ) System.out.println("name not found");
       return  disease;
    }


    @Override
    public int size() {
       return patients.length;
    }
}
