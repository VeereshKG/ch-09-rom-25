package com.xworkz.lokhasaba.lokasaba;

import com.xworkz.lokhasaba.nationality.Nationality;
import com.xworkz.lokhasaba.politician.Politician;

public interface LokhaSaba {

    int size();

    boolean addPolitician(Politician politician);

    void getAllPoliticiansInfo();
    Nationality getNationalityById(int id);
    Nationality getNationalityByName(String name);
    String getNameById(int id);
    int getIdByName(String name);
    String getConstitutionById(int id);
    String getConstitutionByName(String name);
    int getAgeById(int id);
    int getAgeByName(String name);
    boolean updateNameById(int id, String newName);
    boolean updateConstitutionById(int id, String newConstitution);
    boolean updateAgeById(int id, int newAge);
    boolean updateNationalityById(int id, Nationality newNationality);
    Politician getPoliticianDetailsById(int id);
    void fetchPoliticianDetails(Politician politician);
}
