package com.xworkz.institute;

import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.xworkz.Xworkz;

import java.util.Scanner;

public class XworkzRunner {
    public static void main(String[] args) {

//        Trainee trainee1 =new Trainee(1,"veeresh",60,7204287213l,"full stack");
//       Trainee trainee2 = new Trainee(2,"shashank",60,9620221944l,"full stack");
//        Trainee trainee3 = new Trainee(3,"chethan",60,8521479635l,"full stack");
//        Trainee trainee4 =new Trainee(4,"pramod",60,874596713l,"full stack");
//        Trainee trainee5 = new Trainee(5,"tejas",60,9620221944l,"full stack");
//        Trainee trainee6 = new Trainee(6,"prajwal",60,8521479635l,"full stack");
//        Trainee trainee7 =new Trainee(7,"manoj",60,7204287213l,"full stack");
//        Trainee trainee8 = new Trainee(8,"suprith",60,9620221944l,"full stack");
//        Trainee trainee9 = new Trainee(9,"shekar",60,8521479635l,"full stack");
//        Trainee trainee10 =new Trainee(10,"shiva",60,7204287213l,"full stack");
//        Trainee trainee11 = new Trainee(11,"kiran",60,9620221944l,"full stack");
//        Trainee trainee12 = new Trainee(12,"chiru",60,8521479635l,"full stack");
//        Trainee trainee13 =new Trainee(13,"shewath",60,7204287213l,"full stack");
//        Trainee trainee14 = new Trainee(14,"jay",60,9620221944l,"full stack");
//        Trainee trainee15 = new Trainee(15,"lakshimi",60,7412589635l,"full stack");
//
//        Xworkz xworkz=new Xworkz();
//       xworkz.addTrainee(trainee1);
//       xworkz.addTrainee(trainee2);
//       xworkz.addTrainee(trainee3);
//        xworkz.addTrainee(trainee4);
//        xworkz.addTrainee(trainee5);
//        xworkz.addTrainee(trainee6);
//        xworkz.addTrainee(trainee7);
//        xworkz.addTrainee(trainee8);
//        xworkz.addTrainee(trainee9);
//        xworkz.addTrainee(trainee10);
//        xworkz.addTrainee(trainee11);
//        xworkz.addTrainee(trainee12);
//        xworkz.addTrainee(trainee13);
//        xworkz.addTrainee(trainee14);
//        xworkz.addTrainee(trainee15);
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

           System.out.println("Enter subject name:");
           trainee.setSubject(scanner.next());

           System.out.println("Enter trainee phno:");
           trainee.setPhoneNumber(scanner.nextLong());

           System.out.println("Enter no of classes taken");
           trainee.setNoOfClassesTaken(scanner.nextInt());

           xworkz.addTrainee(trainee);

       }
       xworkz.getAllTraineeInfo();
    }
}
