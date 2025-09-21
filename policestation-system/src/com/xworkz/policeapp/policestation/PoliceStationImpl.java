package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.constants.TypeOfPost;
import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.validator.PoliceValidator;

public class PoliceStationImpl  implements PoliceStation{


    public PoliceStationImpl(int size){

        polices = new Police[size];
    }
   public  Police[] polices ;
    int index;
    PoliceValidator policeValidator = new PoliceValidator();
@Override
    public boolean addPolice(Police police) {
        boolean isPoliceAdded = false;

        if (police != null) {
            if (policeValidator.isPoliceInfoValid(police)) {
                polices[index++] = police;
                isPoliceAdded = true;
            }
        } else System.out.println("invalid police");
        return isPoliceAdded;
    }
@Override
    public void getAllPoliceDetails() {
        System.out.println("the list of police are:");
        for (Police police : polices) {


            System.out.println("the id of the police is  " + police.getPoliceId());
            System.out.println("the name of the police is  " + police.getName());
            System.out.println("the type of post of the police is  " + police.getTypeOfPost());
            System.out.println("the salary of the police is  " + police.getSalary());
            System.out.println("the experience of the police is  " + police.getExperience());
            System.out.println("-----------------------------------------------");

        }

    }

@Override
    public TypeOfPost getPostById(int id){
       TypeOfPost typeOfPost = null;
        if(id != 0){
            for(Police police : polices){
                if(police.getPoliceId() == id){
                    typeOfPost = police.getTypeOfPost();
                }
            }
        } else System.out.println("enter valid ID");
        if(typeOfPost == null) System.out.println("ID not found");
        return typeOfPost;
    }
    @Override
    public TypeOfPost getPostByName(String name){
        TypeOfPost typeOfPost = null;
        if(name != null){
            for(Police police : polices){
                if(police.getName().equalsIgnoreCase(name)){
                    typeOfPost = police.getTypeOfPost();
                }
            }
        } else System.out.println("enter valid name");
        if(typeOfPost == null) System.out.println("Name not found");
        return typeOfPost;
    }
    @Override
    public String getNameById(int id){
        String name = null;
        if(id != 0){
            for(Police police : polices){
                if(police.getPoliceId() == id){
                    name = police.getName();
                }
            }
        } else System.out.println("enter valid ID");
        if(name == null) System.out.println("ID not found");
        return name;
    }
    @Override
    public int getIdByName(String name){
        int id = 0;
        if(name != null){
            for(Police police : polices){
                if(police.getName().equalsIgnoreCase(name)){
                    id = police.getPoliceId();
                }
            }
        } else System.out.println("enter valid name");
        if(id == 0) System.out.println("Name not found");
        return id;
    }
    @Override
    public double getSalaryById(int id){
        double salary = 0.0;
        if(id != 0){
            for(Police police : polices){
                if(police.getPoliceId() == id){
                    salary = police.getSalary();
                }
            }
        } else System.out.println("enter valid ID");
        if(salary == 0.0) System.out.println("ID not found");
        return salary;
    }
    @Override
    public double getSalaryByName(String name){
        double salary = 0.0;
        if(name != null){
            for(Police police : polices){
                if(police.getName().equalsIgnoreCase(name)){
                    salary = police.getSalary();
                }
            }
        } else System.out.println("enter valid name");
        if(salary == 0.0) System.out.println("Name not found");
        return salary;
    }
    @Override
    public int getExperienceById(int id){
        int experience = 0;
        if(id != 0){
            for(Police police : polices){
                if(police.getPoliceId() == id){
                    experience = police.getExperience();
                }
            }
        } else System.out.println("enter valid ID");
        if(experience == 0) System.out.println("ID not found");
        return experience;
    }
    @Override
    public int getExperienceByName(String name){
        int experience = 0;
        if(name != null){
            for(Police police : polices){
                if(police.getName().equalsIgnoreCase(name)){
                    experience = police.getExperience();
                }
            }
        } else System.out.println("enter valid name");
        if(experience == 0) System.out.println("Name not found");
        return experience;
    }
    @Override
    public boolean updateNameById(int id, String newName){
        boolean isUpdated = false;
        if(id != 0){
            for(Police police : polices){
                if(police.getPoliceId() == id){
                    police.setName(newName);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter valid ID");
        return isUpdated;
    }
    @Override
    public boolean updatePostById(int id, TypeOfPost newPost){
        boolean isUpdated = false;
        if(id != 0){
            for(Police police : polices){
                if(police.getPoliceId() == id){
                    police.setTypeOfPost(newPost);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter valid ID");
        return isUpdated;
    }
    @Override
    public boolean updateSalaryById(int id, double newSalary){
        boolean isUpdated = false;
        if(id != 0){
            for(Police police : polices){
                if(police.getPoliceId() == id){
                    police.setSalary(newSalary);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter valid ID");
        return isUpdated;
    }
    @Override
    public boolean updateExperienceById(int id, int newExperience){
        boolean isUpdated = false;
        if(id != 0){
            for(Police police : polices){
                if(police.getPoliceId() == id){
                    police.setExperience(newExperience);
                    isUpdated = true;
                }
            }
        } else System.out.println("enter valid ID");
        return isUpdated;
    }
@Override

    public Police getPoliceDetailsById(int id){

        Police police = null;
        if (id != 0){
            for (Police police1 : polices){
                if (police1.getPoliceId() == id){
                    police = police1;
                }
            }
        }
        return police;
    }
@Override
    public void fetchPoliceDetails(Police police) {



            System.out.println("the id of the police is  " + police.getPoliceId());
            System.out.println("the name of the police is  " + police.getName());
            System.out.println("the type of post of the police is  " + police.getTypeOfPost());
            System.out.println("the salary of the police is  " + police.getSalary());
            System.out.println("the experience of the police is  " + police.getExperience());
            System.out.println("-----------------------------------------------");

        }


    @Override
    public int size() {
        return polices.length;
    }
}