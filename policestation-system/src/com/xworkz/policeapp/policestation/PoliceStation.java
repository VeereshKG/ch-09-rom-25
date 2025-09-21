package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.constants.TypeOfPost;
import com.xworkz.policeapp.police.Police;

public interface PoliceStation {

    int size();
    boolean addPolice(Police police);
    void getAllPoliceDetails();
    TypeOfPost getPostById(int id);
    TypeOfPost getPostByName(String name);
    String getNameById(int id);
    int getIdByName(String name);
    double getSalaryById(int id);
    double getSalaryByName(String name);
    int getExperienceById(int id);
    int getExperienceByName(String name);
    boolean updateNameById(int id, String newName);
    boolean updatePostById(int id, TypeOfPost newPost);
    boolean updateSalaryById(int id, double newSalary);
    boolean updateExperienceById(int id, int newExperience);
    Police getPoliceDetailsById(int id);
    void fetchPoliceDetails(Police police);
}
