package com.xworkz.institute.xworkz;


import com.xworkz.institute.trainee.Trainee;

public class Xworkz {

    public Xworkz( int size){
        trainees = new Trainee[size];
    }

   public Trainee[] trainees ;
    int index;

    public boolean addTrainee(Trainee trainee) {
        boolean isTraineeAdded = false;

        if (trainee != null) {
            trainees[index++] = trainee;
            isTraineeAdded = true;
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
}