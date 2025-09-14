package com.xworkz.lokhasaba.lokasaba;

import com.xworkz.lokhasaba.nationality.Nationality;
import com.xworkz.lokhasaba.politician.Politician;
import com.xworkz.lokhasaba.validator.PoliticianValidator;

public class LokhaSaba {

    public LokhaSaba(int size){
        politicians = new Politician[size];
    }
    public Politician[] politicians ;
    int index;

    PoliticianValidator validator = new PoliticianValidator();

    public boolean addPolitician(Politician politician) {
        boolean isPoliticianAdded = false;

        if (politician != null) {
            if (validator.isDetailsValid(politician)) {
                politicians[index++] = politician;
                isPoliticianAdded = true;
            }
        } else System.out.println("invalid trainee");
        return isPoliticianAdded;
    }

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


    public Nationality getNationalityById(int id){
        Nationality nationality = null;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    nationality = politician.getNationality();
                }
            }
        } else System.out.println("enter valid ID");
        if(nationality == null) System.out.println("ID not found");
        return nationality;
    }
    public Nationality getNationalityByName(String name){
        Nationality nationality = null;
        if(name != null){
            for(Politician politician : politicians){
                if(politician.getName().equals(name)){
                    nationality = politician.getNationality();
                }
            }
        } else System.out.println("enter valid name");
        if(nationality == null) System.out.println("name not found");
        return nationality;
    }
    public String getNameById(int id){
        String name = null;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    name = politician.getName();
                }
            }
        } else System.out.println("enter valid ID");
        if(name == null) System.out.println("ID not found");
        return name;
    }
    public int getIdByName(String name){
        int id = 0;
        if(name != null){
            for(Politician politician : politicians){
                if(politician.getName().equals(name)){
                    id = politician.getId();
                }
            }
        } else System.out.println("enter valid name");
        if(id == 0) System.out.println("name not found");
        return id;
    }
    public String getConstitutionById(int id){
        String constitution = null;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    constitution = politician.getConstitution();
                }
            }
        } else System.out.println("enter valid ID");
        if(constitution == null) System.out.println("ID not found");
        return constitution;
    }
    public String getConstitutionByName(String name){
        String constitution = null;
        if(name != null){
            for(Politician politician : politicians){
                if(politician.getName().equals(name)){
                    constitution = politician.getConstitution();
                }
            }
        } else System.out.println("enter valid name");
        if(constitution == null) System.out.println("name not found");
        return constitution;
    }
    public int getAgeById(int id){
        int age = 0;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    age = politician.getAge();
                }
            }
        } else System.out.println("enter valid ID");
        if(age == 0) System.out.println("ID not found");
        return age;
    }
    public int getAgeByName(String name){
        int age = 0;
        if(name != null){
            for(Politician politician : politicians){
                if(politician.getName().equals(name)){
                    age = politician.getAge();
                }
            }
        } else System.out.println("enter valid name");
        if(age == 0) System.out.println("name not found");
        return age;
    }


    public boolean updateNameById(int id, String newName){
        boolean isUpdated = false;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    politician.setName(newName);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter correct ID");
        return isUpdated;
    }
    public boolean updateConstitutionById(int id, String newConstitution){
        boolean isUpdated = false;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    politician.setConstitution(newConstitution);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter correct ID");
        return isUpdated;
    }
    public boolean updateAgeById(int id, int newAge){
        boolean isUpdated = false;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    politician.setAge(newAge);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter correct ID");
        return isUpdated;
    }
    public boolean updateNationalityById(int id, Nationality newNationality){
        boolean isUpdated = false;
        if(id != 0){
            for(Politician politician : politicians){
                if(politician.getId() == id){
                    politician.setNationality(newNationality);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter correct ID");
        return isUpdated;
    }

    public Politician getPoliticianDetailsById(int id){

        Politician politician = null;
        if (id != 0){
            for (Politician politician1 : politicians){
                if (politician1.getId() == id){
                    politician = politician1;
                }
            }
        }
        return politician;
    }
    public void fetchPoliticianDetails(Politician politician) {



            System.out.println("the id of the politicion is   " + politician.getId());
            System.out.println("the name of the politicion is   " + politician.getName());
            System.out.println("the constitution of the politicion is   " + politician.getConstitution());
            System.out.println("the age of the politicion is   " + politician.getAge());
            System.out.println("the  nationality of the politicion is   " + politician.getNationality());

        }





}