package com.xworkz.institute;

import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.xworkz.Xworkz;

import java.util.Scanner;

public class XworkzRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of trainees to be add");
        int size = scanner.nextInt();

        Xworkz xworkz = new Xworkz(size);
        System.out.println("the no of trainee available are : "+xworkz.trainees.length);

       for (int index = 0;index<size;index++) {
           Trainee trainee = new Trainee();

           System.out.println("Enter id :");
           trainee.setId(scanner.nextInt());

           System.out.println("Enter name:");
           trainee.setName(scanner.next());

           System.out.println("Enter subject from these JAVAFULLSTACK , FRONTEND , SQL , DATA;:");
           trainee.setSubject(Subject.valueOf(scanner.next().toUpperCase()));

           System.out.println("Enter trainee phno:");
           trainee.setPhoneNumber(scanner.nextLong());

           System.out.println("Enter no of classes taken");
           trainee.setNoOfClassesTaken(scanner.nextInt());

           xworkz.addTrainee(trainee);

       }
       xworkz.getAllTraineeInfo();



//            System.out.println("enter ID");
//            System.out.println("The Subject is: " + xworkz.getSubjectNameByTraineeId(scanner.nextInt()));
//
//            System.out.println("enter Name");
//            System.out.println("The Subject is: " + xworkz.getSubjectByTraineeName(scanner.next()));
//
//            System.out.println("enter ID");
//            System.out.println("The Phone Number is: " + xworkz.getPhoneNumberByTraineeId(scanner.nextInt()));
//
//            System.out.println("enter Name");
//            System.out.println("The Phone Number is: " + xworkz.getPhoneNumberByName(scanner.next()));
//
//            System.out.println("enter ID");
//            System.out.println("No. of Classes Taken: " + xworkz.getNoOfClassesTakenByTraineeId(scanner.nextInt()));
//
//            System.out.println("enter Name");
//            System.out.println("No. of Classes Taken: " + xworkz.getNoOfClassesTakenByName(scanner.next()));
//
//            System.out.println("enter Name");
//            System.out.println("The Trainee ID is: " + xworkz.getTraineeIdByName(scanner.next()));
//
//            System.out.println("enter ID");
//            System.out.println("The Trainee Name is: " + xworkz.getTraineeNameById(scanner.nextInt()));
//
//            System.out.println("enter Trainee ID");
//            int traineeId = scanner.nextInt();
//            System.out.println("enter new Name");
//            String newName = scanner.next();
//            xworkz.updateTraineeNameById(traineeId, newName);
//
//            System.out.println("enter Trainee ID");
//            int traineeId1 = scanner.nextInt();
//            System.out.println("enter new Subject from JAVAFULLSTACK , FRONTEND , SQL , DATA;:");
//            Subject subject = Subject.valueOf(scanner.next().toUpperCase());
//            xworkz.updateSubjectByTraineeId(traineeId1, subject);
//
//            System.out.println("enter Trainee ID");
//            int traineeId2 = scanner.nextInt();
//            System.out.println("enter new Phone Number");
//            long phoneNumber = scanner.nextLong();
//            xworkz.updatePhoneNumberByTraineeId(traineeId2, phoneNumber);
//
//            System.out.println("enter Trainee ID");
//            int traineeId3 = scanner.nextInt();
//            System.out.println("enter new No. of Classes Taken");
//            int noOfClasses = scanner.nextInt();
//            xworkz.updateNoOfClassesTakenByTraineeId(traineeId3, noOfClasses);
//
//

        System.out.println("enter id to fetch trainee details");
        int id  = scanner.nextInt();
        Trainee trainee = xworkz.getTraineeDetailsbyId(id);

        xworkz.fetchTraineeDetails(trainee);


    }
}
