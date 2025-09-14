package com.xworkz.institute.xworkz;


import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.validator.TraineeValidator;

public class Xworkz {

    public Xworkz( int size){
        trainees = new Trainee[size];
    }

    TraineeValidator validator = new TraineeValidator();
   public Trainee[] trainees ;
    int index;

    public boolean addTrainee(Trainee trainee) {
        boolean isTraineeAdded = false;

        if (trainee != null) {
            if (validator.isTrainneInfoValidated(trainee)) {
                trainees[index++] = trainee;
                isTraineeAdded = true;
            }
        } else System.out.println("invalid trainee");
        return isTraineeAdded;
    }

    public void getAllTraineeInfo() {
        System.out.println("the trainee details are :");
        for (Trainee trainee : trainees) {
            System.out.println("the id of the trainee is  " + trainee.getId());
            System.out.println("the name of the trainee is  " + trainee.getName());
            System.out.println("the class taken of the trainee is  " + trainee.getNoOfClassesTaken());
            System.out.println("the phone no of the trainee is  " + trainee.getPhoneNumber());
            System.out.println("the subject of the trainee is  " + trainee.getSubject());
            System.out.println("----------------------------------------------");

        }
    }

    public Subject getSubjectNameByTraineeId(int traineeId){
        Subject sub = null;
        if(traineeId != 0){
            for(Trainee trainee : trainees ){
                if(trainee.getId() == traineeId){
                    sub = trainee.getSubject();
                }
            }
        }else System.out.println("enter valid ID");
        if(sub == null) System.out.println("ID not found");
        return sub;
    }
    public Subject getSubjectByTraineeName(String traineeName){
        Subject sub = null;
        if(traineeName != null){
            for(Trainee trainee : trainees){
                if(trainee.getName().equals(traineeName)){
                    sub = trainee.getSubject();
                }
            }
        }else System.out.println("enter valid name");
        if(sub == null) System.out.println("name not found");
        return sub;
    }
    public long getPhoneNumberByTraineeId(int traineeId){
        long phone = 0;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    phone = trainee.getPhoneNumber();
                }
            }
        }else System.out.println("enter valid ID");
        if(phone == 0) System.out.println("ID not found");
        return phone;
    }
    public long getPhoneNumberByName(String traineeName){
        long phone = 0;
        if(traineeName != null){
            for(Trainee trainee : trainees){
                if(trainee.getName().equals(traineeName)){
                    phone = trainee.getPhoneNumber();
                }
            }
        }else System.out.println("enter valid name");
        if(phone == 0) System.out.println("name not found");
        return phone;
    }
    public int getNoOfClassesTakenByTraineeId(int traineeId){
        int classes = 0;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    classes = trainee.getNoOfClassesTaken();
                }
            }
        }else System.out.println("enter valid ID");
        if(classes == 0) System.out.println("ID not found");
        return classes;
    }
    public int getNoOfClassesTakenByName(String traineeName){
        int classes = 0;
        if(traineeName != null){
            for(Trainee trainee : trainees){
                if(trainee.getName().equals(traineeName)){
                    classes = trainee.getNoOfClassesTaken();
                }
            }
        }else System.out.println("enter valid name");
        if(classes == 0) System.out.println("name not found");
        return classes;
    }
    public int getTraineeIdByName(String traineeName){
        int id = 0;
        if(traineeName != null){
            for(Trainee trainee : trainees){
                if(trainee.getName().equals(traineeName)){
                    id = trainee.getId();
                }
            }
        }else System.out.println("enter valid name");
        if(id == 0) System.out.println("name not found");
        return id;
    }
    public String getTraineeNameById(int traineeId){
        String name = null;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    name = trainee.getName();
                }
            }
        }else System.out.println("enter valid ID");
        if(name == null) System.out.println("ID not found");
        return name;
    }

    public boolean updateTraineeNameById(int traineeId, String newName){
        boolean isUpdated = false;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    trainee.setName(newName);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }
    public boolean updateSubjectByTraineeId(int traineeId, Subject newSubject){
        boolean isUpdated = false;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    trainee.setSubject(newSubject);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }
    public boolean updatePhoneNumberByTraineeId(int traineeId, long newPhoneNumber){
        boolean isUpdated = false;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    trainee.setPhoneNumber(newPhoneNumber);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }
    public boolean updateNoOfClassesTakenByTraineeId(int traineeId, int newNoOfClasses){
        boolean isUpdated = false;
        if(traineeId != 0){
            for(Trainee trainee : trainees){
                if(trainee.getId() == traineeId){
                    trainee.setNoOfClassesTaken(newNoOfClasses);
                    isUpdated = true;
                }
            }
        }else System.out.println("enter correct ID");
        return isUpdated;
    }



   public Trainee getTraineeDetailsbyId(int id){
        Trainee trainee = null;
        if (id != 0){
            for (Trainee trainee1 : trainees){
                if (trainee1.getId() == id){
                    trainee = trainee1;
                }
            }
        }
        if (trainee == null) System.out.println("Enter id is not available");
       return trainee;
   }

  public void fetchTraineeDetails(Trainee trainee){

          System.out.println("the id of the trainee is  " + trainee.getId());
          System.out.println("the name of the trainee is  " + trainee.getName());
          System.out.println("the class taken of the trainee is  " + trainee.getNoOfClassesTaken());
          System.out.println("the phone no of the trainee is  " + trainee.getPhoneNumber());
          System.out.println("the subject of the trainee is  " + trainee.getSubject());
          System.out.println("----------------------------------------------");


   }

}