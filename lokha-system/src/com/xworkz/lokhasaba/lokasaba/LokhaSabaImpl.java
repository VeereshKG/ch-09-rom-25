package com.xworkz.lokhasaba.lokasaba;

import com.xworkz.lokhasaba.exception.*;
import com.xworkz.lokhasaba.nationality.Nationality;
import com.xworkz.lokhasaba.politician.Politician;
import com.xworkz.lokhasaba.validator.PoliticianValidator;

public class LokhaSabaImpl implements LokhaSaba {

    public LokhaSabaImpl(int size) {
        politicians = new Politician[size];
    }

    public Politician[] politicians;
    int index;

    PoliticianValidator validator = new PoliticianValidator();

    @Override
    public boolean addPolitician(Politician politician) {
        boolean isPoliticianAdded = false;
        try {
                if (validator.isDetailsValid(politician)) {
                    politicians[index++] = politician;
                    isPoliticianAdded = true;
                }
            else System.out.println("invalid trainee");
            if (isPoliticianAdded == false) {
                PoliticianNotAddedException politicianNotAddedException = new PoliticianNotAddedException("politician not added");
                throw politicianNotAddedException;
            }
        } catch (PoliticianNotAddedException e) {
            e.printStackTrace();
        }
        return isPoliticianAdded;
    }

    @Override
    public void getAllPoliticiansInfo() {
        System.out.println("the politicians are ");
        for (Politician politician : politicians) {


            System.out.println("the id of the politicion is   " + politician.getId());
            System.out.println("the name of the politicion is   " + politician.getName());
            System.out.println("the constitution of the politicion is   " + politician.getConstitution());
            System.out.println("the age of the politicion is   " + politician.getAge());
            System.out.println("the  nationality of the politicion is   " + politician.getNationality());

        }
    }

    @Override
    public Nationality getNationalityById(int id) {
        Nationality nationality = null;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        nationality = politician.getNationality();
                    }
                }
            } else System.out.println("enter valid ID");
            if (nationality == null) {
                NationalityNotFoundException nationalityNotFoundException = new NationalityNotFoundException("Nationality not found exception");
                throw nationalityNotFoundException;
            }
        } catch (NationalityNotFoundException e) {
            e.printStackTrace();
        }
        return nationality;
    }

    @Override
    public Nationality getNationalityByName(String name) {
        Nationality nationality = null;
        try {
            if (name != null) {
                for (Politician politician : politicians) {
                    if (politician.getName().equals(name)) {
                        nationality = politician.getNationality();
                    }
                }
            } else System.out.println("enter valid name");
            if (nationality == null) {
                NationalityNotFoundException nationalityNotFoundException = new NationalityNotFoundException("Nationality not found exception");
                throw nationalityNotFoundException;
            }
        } catch (NationalityNotFoundException e) {
            e.printStackTrace();
        }
        return nationality;
    }

    @Override
    public String getNameById(int id) {
        String name = null;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        name = politician.getName();
                    }
                }
            } else System.out.println("enter valid ID");
            if (name == null) {
                NameNotFoundException nameNotFoundExceptionn = new NameNotFoundException("name not found");
                throw nameNotFoundExceptionn;
            }
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public int getIdByName(String name) {
        int id = 0;
        try {
            if (name != null) {
                for (Politician politician : politicians) {
                    if (politician.getName().equals(name)) {
                        id = politician.getId();
                    }
                }
            } else System.out.println("enter valid name");
            if (id == 0) {
                IdNotFoundException idNotFoundException = new IdNotFoundException("id not found");
                throw idNotFoundException;
            }
        }catch (IdNotFoundException e){
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public String getConstitutionById(int id) {
        String constitution = null;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        constitution = politician.getConstitution();
                    }
                }
            } else System.out.println("enter valid ID");
            if (constitution == null) {
                ConstitutionNotFoundException constitutionNotFoundException = new ConstitutionNotFoundException("Constitution not found");
                throw constitutionNotFoundException;
            }
        }catch (ConstitutionNotFoundException e){
            e.printStackTrace();
        }
        return constitution;
    }

    @Override
    public String getConstitutionByName(String name) {
        String constitution = null;
        try{
        if (name != null) {
            for (Politician politician : politicians) {
                if (politician.getName().equals(name)) {
                    constitution = politician.getConstitution();
                }
            }
        } else System.out.println("enter valid name");
            if (constitution == null) {
                ConstitutionNotFoundException constitutionNotFoundException = new ConstitutionNotFoundException("Constitution not found");
                throw constitutionNotFoundException;
            }
        }catch (ConstitutionNotFoundException e){
            e.printStackTrace();
        }
        return constitution;
    }

    @Override
    public int getAgeById(int id) {
        int age = 0;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        age = politician.getAge();
                    }
                }
            } else System.out.println("enter valid ID");
            if (age == 0) {
                AgeNotFoundException ageNotFoundException = new AgeNotFoundException("AgeNotFound");
                throw ageNotFoundException;
            }
        }catch (AgeNotFoundException e){
            e.printStackTrace();
        }
        return age;
    }

    @Override
    public int getAgeByName(String name) {
        int age = 0;
        try{
        if (name != null) {
            for (Politician politician : politicians) {
                if (politician.getName().equals(name)) {
                    age = politician.getAge();
                }
            }
        } else System.out.println("enter valid name");
        if (age == 0) {
            AgeNotFoundException ageNotFoundException = new AgeNotFoundException("AgeNotFound");
            throw ageNotFoundException;
        }
    }catch (AgeNotFoundException e){
        e.printStackTrace();
    }
        return age;
    }

    @Override
    public boolean updateNameById(int id, String newName) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        politician.setName(newName);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateNameNotDoneException updateNameNotDoneException = new UpdateNameNotDoneException("name not updated");
                throw updateNameNotDoneException;
            }
        }catch (UpdateNameNotDoneException e){
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateConstitutionById(int id, String newConstitution) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        politician.setConstitution(newConstitution);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateConstitutionNotDoneException updateConstitutionNotDoneException = new UpdateConstitutionNotDoneException("constitution not updated");
                throw updateConstitutionNotDoneException;
            }
        }catch (UpdateConstitutionNotDoneException e){
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateAgeById(int id, int newAge) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        politician.setAge(newAge);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateAgeNotDoneException updateAgeNotDoneException = new UpdateAgeNotDoneException("age not updated");
                throw updateAgeNotDoneException;
            }
        }catch (UpdateAgeNotDoneException e){
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateNationalityById(int id, Nationality newNationality) {
        boolean isUpdated = false;
        try {
            if (id != 0) {
                for (Politician politician : politicians) {
                    if (politician.getId() == id) {
                        politician.setNationality(newNationality);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateNationalityNotDoneException updateNationalityNotDoneException = new UpdateNationalityNotDoneException("updateNationality not done");
                throw updateNationalityNotDoneException;
            }
        }catch (UpdateNationalityNotDoneException e){
            e.printStackTrace();
        }

        return isUpdated;
    }

    @Override
    public Politician getPoliticianDetailsById(int id) {

        Politician politician = null;
        try {
            if (id != 0) {
                for (Politician politician1 : politicians) {
                    if (politician1.getId() == id) {
                        politician = politician1;
                    }
                }
            } else
                if (politician == null) {
                PoliticianDetailsNotFoundException politicianDetailsNotFoundException = new PoliticianDetailsNotFoundException("   Politician not found");
                throw politicianDetailsNotFoundException;
            }
        }catch (PoliticianDetailsNotFoundException e){
            e.printStackTrace();
        }
        return politician;
    }

    @Override
    public void fetchPoliticianDetails(Politician politician) {
        try {
            System.out.println("the id of the politicion is   " + politician.getId());
            System.out.println("the name of the politicion is   " + politician.getName());
            System.out.println("the constitution of the politicion is   " + politician.getConstitution());
            System.out.println("the age of the politicion is   " + politician.getAge());
            System.out.println("the  nationality of the politicion is   " + politician.getNationality());
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public int size() {
        return politicians.length;
    }
}