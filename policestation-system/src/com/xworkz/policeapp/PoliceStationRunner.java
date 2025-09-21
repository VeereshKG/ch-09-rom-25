package com.xworkz.policeapp;

import com.xworkz.policeapp.constants.TypeOfPost;
import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;
import com.xworkz.policeapp.policestation.PoliceStationImpl;

import java.util.Scanner;

public class PoliceStationRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of police to be add :");
        int size = scanner.nextInt();

        PoliceStation policeStation = new PoliceStationImpl(size);
        System.out.println("Enter no of polices are available :"+policeStation.size());

        for (int index=0; index<size ; index++){
            Police police = new Police();

            System.out.println("Enter police Id :");
            police.setPoliceId(scanner.nextInt());

            System.out.println("Enter police name");
            police.setName(scanner.next());

            System.out.println("Enter type of post  from PI,API,SI,ASI,HC,SC,PC:");
            police.setTypeOfPost(TypeOfPost.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter salary :");
            police.setSalary(scanner.nextDouble());

            System.out.println("Enter Experience");
            police.setExperience(scanner.nextInt());

            policeStation.addPolice(police);
        }

        policeStation.getAllPoliceDetails();



            System.out.println("enter police Id");
            System.out.println("the Post is " + policeStation.getPostById(scanner.nextInt()));

            System.out.println("enter police Id");
            System.out.println("the Name is " + policeStation.getNameById(scanner.nextInt()));

            System.out.println("enter police Id");
            System.out.println("the Salary is " + policeStation.getSalaryById(scanner.nextInt()));

            System.out.println("enter police Id");
            System.out.println("the Experience is " + policeStation.getExperienceById(scanner.nextInt()));

            System.out.println("enter police Name");
            System.out.println("the Id is " + policeStation.getIdByName(scanner.next()));

            System.out.println("enter police Name");
            System.out.println("the Post is " + policeStation.getPostByName(scanner.next()));

            System.out.println("enter police Name");
            System.out.println("the Salary is " + policeStation.getSalaryByName(scanner.next()));

            System.out.println("enter police Name");
            System.out.println("the Experience is " + policeStation.getExperienceByName(scanner.next()));

            System.out.println("enter police Id");
            int id = scanner.nextInt();
            System.out.println("enter new Name");
            String newName = scanner.next();
            policeStation.updateNameById(id, newName);
                policeStation.getAllPoliceDetails();

            System.out.println("enter police Id");
            int id1 = scanner.nextInt();
            System.out.println("enter new Post (e.g., SI, INSPECTOR, CONSTABLE, DSP, SP)");
            TypeOfPost newPost = TypeOfPost.valueOf(scanner.next().toUpperCase());
            policeStation.updatePostById(id1, newPost);
                policeStation.getAllPoliceDetails();

            System.out.println("enter police Id");
            int id2 = scanner.nextInt();
            System.out.println("enter new Salary");
            double newSalary = scanner.nextDouble();
            policeStation.updateSalaryById(id2, newSalary);
                policeStation.getAllPoliceDetails();

            System.out.println("enter police Id");
            int id3 = scanner.nextInt();
            System.out.println("enter new Experience (in years)");
            int newExperience = scanner.nextInt();
            policeStation.updateExperienceById(id3, newExperience);
                policeStation.getAllPoliceDetails();
//

        System.out.println("Enter id to get book details");
        int id4 = scanner.nextInt();
       Police police = policeStation.getPoliceDetailsById(id4);
       policeStation.fetchPoliceDetails(police);

    }
}
