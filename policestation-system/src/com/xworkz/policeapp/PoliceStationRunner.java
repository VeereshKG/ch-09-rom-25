package com.xworkz.policeapp;

import com.xworkz.policeapp.constants.TypeOfPost;
import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.policestation.PoliceStation;
import com.xworkz.policeapp.policestation.PoliceStationImpl;

import java.util.Scanner;

public class PoliceStationRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of police to add:");
        int size = scanner.nextInt();
        boolean isAdded = false;
        PoliceStation policeStation = new PoliceStationImpl(size);
        System.out.println("Total police slots available: " + policeStation.size());

        for (int index = 0; index < size; index++) {
            Police police = new Police();

            System.out.println("Enter Police Id:");
            police.setPoliceId(scanner.nextInt());

            System.out.println("Enter Police Name:");
            police.setName(scanner.next());

            System.out.println("Enter Post (PI, API, SI, ASI, HC, SC, PC):");
            police.setTypeOfPost(TypeOfPost.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter Salary:");
            police.setSalary(scanner.nextDouble());

            System.out.println("Enter Experience (in years):");
            police.setExperience(scanner.nextInt());

            isAdded = policeStation.addPolice(police);
        }
        if (isAdded == true) {
            String input;
            do {
                System.out.println("press 1 to Get All Police Details");
                System.out.println("press 2 to Get Post by Id");
                System.out.println("press 3 to Get Name by Id");
                System.out.println("press 4 to Get Salary by Id");
                System.out.println("press 5 to Get Experience by Id");
                System.out.println("press 6 to Get Id by Name");
                System.out.println("press 7 to Get Post by Name");
                System.out.println("press 8 to Get Salary by Name");
                System.out.println("press 9 to Get Experience by Name");
                System.out.println("press 10 to Update Name by Id");
                System.out.println("press 11 to Update Post by Id");
                System.out.println("press 12 to Update Salary by Id");
                System.out.println("press 13 to Update Experience by Id");
                System.out.println("press 14 to Get Police Details by Id");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        policeStation.getAllPoliceDetails();
                        break;
                    case 2:
                        System.out.println("Enter Police Id to getPost");
                        System.out.println("Post: " + policeStation.getPostById(scanner.nextInt()));
                        break;
                    case 3:
                        System.out.println("Enter Police Id to getName");
                        System.out.println("Name: " + policeStation.getNameById(scanner.nextInt()));
                        break;
                    case 4:
                        System.out.println("Enter Police Id to getSalary");
                        System.out.println("Salary: " + policeStation.getSalaryById(scanner.nextInt()));
                        break;
                    case 5:
                        System.out.println("Enter Police Id to getExperience");
                        System.out.println("Experience: " + policeStation.getExperienceById(scanner.nextInt()));
                        break;
                    case 6:
                        System.out.println("Enter Police Name to getId");
                        System.out.println("Id: " + policeStation.getIdByName(scanner.next()));
                        break;
                    case 7:
                        System.out.println("Enter Police Name to getPost");
                        System.out.println("Post: " + policeStation.getPostByName(scanner.next()));
                        break;
                    case 8:
                        System.out.println("Enter Police Name to getSalary");
                        System.out.println("Salary: " + policeStation.getSalaryByName(scanner.next()));
                        break;
                    case 9:
                        System.out.println("Enter Police Name to getExperience");
                        System.out.println("Experience: " + policeStation.getExperienceByName(scanner.next()));
                        break;
                    case 10:
                        System.out.println("Enter Police Id to updateName");
                        int id = scanner.nextInt();
                        System.out.println("Enter new Name:");
                        String newName = scanner.next();
                        boolean nameUpdated = policeStation.updateNameById(id, newName);
                        System.out.println("Name Updated: " + nameUpdated);
                        break;
                    case 11:
                        System.out.println("Enter Police Id to updatePost");
                        int id1 = scanner.nextInt();
                        System.out.println("Enter new Post (PI, API, SI, ASI, HC, SC, PC):");
                        TypeOfPost newPost = TypeOfPost.valueOf(scanner.next().toUpperCase());
                        boolean postUpdated = policeStation.updatePostById(id1, newPost);
                        System.out.println("Post Updated: " + postUpdated);
                        break;
                    case 12:
                        System.out.println("Enter Police Id to updateSalary");
                        int id2 = scanner.nextInt();
                        System.out.println("Enter new Salary:");
                        double newSalary = scanner.nextDouble();
                        boolean salaryUpdated = policeStation.updateSalaryById(id2, newSalary);
                        System.out.println("Salary Updated: " + salaryUpdated);
                        break;
                    case 13:
                        System.out.println("Enter Police Id to updateExperience");
                        int id3 = scanner.nextInt();
                        System.out.println("Enter new Experience (years):");
                        int newExperience = scanner.nextInt();
                        boolean expUpdated = policeStation.updateExperienceById(id3, newExperience);
                        System.out.println("Experience Updated: " + expUpdated);
                        break;
                    case 14:
                        System.out.println("Enter Police Id to getPoliceDetails");
                        int id4 = scanner.nextInt();
                        Police police = policeStation.getPoliceDetailsById(id4);
                        policeStation.fetchPoliceDetails(police);
                        break;
                    default:
                        System.out.println("Please enter a valid option!");
                }

                System.out.println("Do you want to continue? (yes/no): ");
                input = scanner.next();
            } while (input.equalsIgnoreCase("yes"));

            System.out.println("Thank you.. Visit again!");
        } else System.out.println("not added");
    }
}
