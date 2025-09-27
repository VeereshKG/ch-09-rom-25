package com.xworkz.apollotech.hospital;

import com.xworkz.apollotech.exception.*;
import com.xworkz.apollotech.patient.Patient;
import com.xworkz.apollotech.validator.PatientValidator;

public class HospitalImpl implements Hospital {

    public HospitalImpl(int size) {
        patients = new Patient[size];

    }

    public Patient[] patients;
    int index;
    PatientValidator patientValidator = new PatientValidator();

    @Override
    public boolean addPatient(Patient patient) {
        boolean isPatientAdded = false;
        try {
            if (patientValidator.isPatientDetailsValid(patient)) {
                patients[index++] = patient;
                isPatientAdded = true;
            } else
                System.out.println("invalid patient");
            if (isPatientAdded == false) {
                PatientNotAddedException patientNotAddedException = new PatientNotAddedException("patient not added");
                throw patientNotAddedException;
            }
        } catch (PatientNotAddedException e) {
            e.printStackTrace();
        }
        return isPatientAdded;
    }

    @Override
    public void getAllPatientInfo() {
        System.out.println("the list of Patients are :");
        for (Patient patient : patients) {
            System.out.println("the patient id is: " + patient.getPatientId());
            System.out.println("the patient name is: " + patient.getName());
            System.out.println("the patient age is : " + patient.getAge());
            System.out.println("the patient gender is: " + patient.getGender());
            System.out.println("the disease name is: " + patient.getDisease());
            System.out.println("-------------------------------------");
        }
    }

    @Override
    public boolean updatePatientAgeById(int updatedAge, int existingId) {
        System.out.println("invoked updatePatientAgeById");
        boolean ageUpdated = false;
        try {
            for (Patient patient : patients) {
                if (patient.getPatientId() == existingId) {
                    patient.setAge(updatedAge);
                    ageUpdated = true;
                    System.out.println("Age is updated");
                }
            }
            if (ageUpdated == false) {
                UpdatePatientAgeNotDone updatePatientAgeNotDone = new UpdatePatientAgeNotDone("updatePatientAge not done");
                throw updatePatientAgeNotDone;
            }
        } catch (UpdatePatientAgeNotDone e) {
            e.printStackTrace();
        }


        return ageUpdated;

    }

    @Override
    public String getGenderByPatientName(String patientName) {
        String gender = null;
        try {
            if (patientName != null) {
                for (Patient patient : patients) {
                    if (patient.getName().equals(patientName)) {
                        gender = patient.getGender();
                    }
                }
            }
            if (gender == null) {
                GenderNotFoundException genderNotFoundException = new GenderNotFoundException("gender not found");
                throw genderNotFoundException;
            }
        } catch (GenderNotFoundException e) {
            e.printStackTrace();
        }
        return gender;
    }

    @Override
    public boolean updateDiseaseNameByPatientName(String existingName, String updateDiseaseName) {

        boolean isDeaseUpdated = false;
        try {
            if (existingName != null) {
                for (Patient patient : patients) {
                    if (patient.getName().equals(existingName)) {
                        patient.setDisease(updateDiseaseName);
                        isDeaseUpdated = true;
                        System.out.println("updated successfully");
                    }
                }

            }
            if (isDeaseUpdated == false) {
                UpdateDiseaseNameNotDoneExcception updateDiseaseNameNotDoneExcception = new UpdateDiseaseNameNotDoneExcception("updateDiseaseName not done");
                throw updateDiseaseNameNotDoneExcception;
            }
        } catch (UpdateDiseaseNameNotDoneExcception e) {
            e.printStackTrace();
        }
        return isDeaseUpdated;
    }

    @Override
    public boolean updateDiseaseById(String updateDisease, int existingId) {
        boolean isdiseaseupdated = false;
        try {
            if (existingId != 0) {
                for (Patient patient : patients) {
                    if (patient.getPatientId() == (existingId)) {
                        patient.setDisease(updateDisease);
                        isdiseaseupdated = true;
                        System.out.println("disease updated successfully");
                    }
                }
            }
            if (isdiseaseupdated == false) {
                UpdateDiseaseNameNotDoneExcception updateDiseaseNameNotDoneExcception = new UpdateDiseaseNameNotDoneExcception("updateDiseaseName not done");
                throw updateDiseaseNameNotDoneExcception;
            }
        } catch (UpdateDiseaseNameNotDoneExcception e) {
            e.printStackTrace();
        }
        return isdiseaseupdated;
    }

    @Override
    public String getPatientNameById(int id) {
        String patientName = null;
        try {
            if (id != 0) {
                for (Patient patient : patients) {
                    if (patient.getPatientId() == (id)) {
                        patientName = patient.getName();
                        System.out.println("fetch name by id successfully");
                    }
                }
            }
            if (patientName == null) {
                PatientNameNotFoundException patientNameNotFoundException = new PatientNameNotFoundException("PatientName not found");
                throw patientNameNotFoundException;
            }
        } catch (PatientNameNotFoundException e) {
            e.printStackTrace();
        }
        return patientName;
    }

    @Override
    public String getDiseaseById(int id) {
        String disease = null;
        try {
            if (id != 0) {
                for (Patient patient : patients) {
                    if (patient.getPatientId() == id) {
                        disease = patient.getDisease();
                        System.out.println("disease fetched");
                    }
                }
            }
            if (disease == null) {
                DiseaseNotFoundException diseaseNotFoundException = new DiseaseNotFoundException("disease not found");
                throw diseaseNotFoundException;
            }
        } catch (DiseaseNotFoundException e) {
            e.printStackTrace();
        }
        return disease;
    }

    @Override
    public int getAgeById(int id) {
        int age = 0;
        try {
            if (id != 0) {
                for (Patient patient : patients) {
                    if (patient.getPatientId() == id) {
                        age = patient.getAge();
                        System.out.println("age fetched");
                    }
                }
            }
            if (age == 0) {
                AgeNotFoundException ageNotFoundException = new AgeNotFoundException("age not found");
                throw ageNotFoundException;
            }
        } catch (AgeNotFoundException e) {
            e.printStackTrace();
        }
        return age;
    }

    @Override
    public String getDiseaseByName(String name) {

        String disease = null;
        try {
            if (name != null) {
                for (Patient patient : patients) {
                    if (patient.getName().equals(name)) {
                        disease = patient.getDisease();
                        System.out.println("disease fetched successfully");
                    }
                }
            }
            if (disease == null) {
                DiseaseNotFoundException diseaseNotFoundException = new DiseaseNotFoundException("disease not found");
                throw diseaseNotFoundException;
            }
        } catch (DiseaseNotFoundException e) {
            e.printStackTrace();

        }
        return disease;
    }


    @Override
    public int size() {
        return patients.length;
    }
}
