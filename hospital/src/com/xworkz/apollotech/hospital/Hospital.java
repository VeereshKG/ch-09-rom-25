package com.xworkz.apollotech.hospital;

import com.xworkz.apollotech.patient.Patient;

public interface Hospital {

    int size();

    boolean addPatient (Patient patient);
    void getAllPatientInfo();
    boolean updatePatientAgeById(int updatedAge  , int existingId);
    String getGenderByPatientName(String patientName);
    boolean updateDiseaseNameByPatientName(String existingName ,String updateDiseaseName);
    boolean updateDiseaseById(String updateDisease  , int existingId);
    String getPatientNameById(int id);
    String getDiseaseById(int id);
    int getAgeById(int id);
    String getDiseaseByName(String name);
}
