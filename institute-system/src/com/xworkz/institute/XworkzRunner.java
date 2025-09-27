package com.xworkz.institute;

import com.xworkz.institute.constants.Subject;
import com.xworkz.institute.trainee.Trainee;
import com.xworkz.institute.xworkz.Xworkz;
import com.xworkz.institute.xworkz.XworkzImpl;

import java.util.Scanner;

public class XworkzRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of trainees to be added: ");
        int size = scanner.nextInt();

        Xworkz xworkz = new XworkzImpl(size);
        System.out.println("The number of trainees available: " + xworkz.size());
        boolean isAdded = false;
        for (int index = 0; index < size; index++) {
            Trainee trainee = new Trainee();

            System.out.println("Enter Id: ");
            trainee.setId(scanner.nextInt());

            System.out.println("Enter Name: ");
            trainee.setName(scanner.next());

            System.out.println("Enter Subject (JAVA FULLSTACK, FRONTEND, SQL, DATA): ");
            trainee.setSubject(Subject.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter Phone Number: ");
            trainee.setPhoneNumber(scanner.nextLong());

            System.out.println("Enter No. of Classes Taken: ");
            trainee.setNoOfClassesTaken(scanner.nextInt());

            isAdded = xworkz.addTrainee(trainee);
        }
        if (isAdded == true) {
            String input;
            do {
                System.out.println("1 to Get All Trainee Info");
                System.out.println("2 to Get Subject by Trainee Id");
                System.out.println("3 to Get Subject by Trainee Name");
                System.out.println("4 to Get Phone Number by Trainee Id");
                System.out.println("5 to Get Phone Number by Trainee Name");
                System.out.println("6 to Get No. of Classes by Trainee Id");
                System.out.println("7 to Get No. of Classes by Trainee Name");
                System.out.println("8 to Get Trainee Id by Name");
                System.out.println("9 to Get Trainee Name by Id");
                System.out.println("10 to Update Trainee Name by Id");
                System.out.println("11 to Update Subject by Trainee Id");
                System.out.println("12 to Update Phone Number by Trainee Id");
                System.out.println("13 to Update No. of Classes by Trainee Id");
                System.out.println("14 to Get Trainee Details by Id");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        xworkz.getAllTraineeInfo();
                        break;
                    case 2:
                        System.out.println("Enter Trainee Id to get SubjectName ");
                        System.out.println("Subject: " + xworkz.getSubjectNameByTraineeId(scanner.nextInt()));
                        break;
                    case 3:
                        System.out.println("Enter Trainee Name to get SubjectName ");
                        System.out.println("Subject: " + xworkz.getSubjectByTraineeName(scanner.next()));
                        break;
                    case 4:
                        System.out.println("Enter Trainee Id to get PhoneNumber ");
                        System.out.println("Phone Number: " + xworkz.getPhoneNumberByTraineeId(scanner.nextInt()));
                        break;
                    case 5:
                        System.out.println("Enter Trainee Name to get PhoneNumber ");
                        System.out.println("Phone Number: " + xworkz.getPhoneNumberByName(scanner.next()));
                        break;
                    case 6:
                        System.out.println("Enter Trainee Id to get NoOfClassesTaken ");
                        System.out.println("No. of Classes: " + xworkz.getNoOfClassesTakenByTraineeId(scanner.nextInt()));
                        break;
                    case 7:
                        System.out.println("Enter Trainee Name to get NoOfClassesTaken ");
                        System.out.println("No. of Classes: " + xworkz.getNoOfClassesTakenByName(scanner.next()));
                        break;
                    case 8:
                        System.out.println("Enter Trainee Name to get TraineeId ");
                        System.out.println("Trainee Id: " + xworkz.getTraineeIdByName(scanner.next()));
                        break;
                    case 9:
                        System.out.println("Enter Trainee Id to get TraineeName ");
                        System.out.println("Trainee Name: " + xworkz.getTraineeNameById(scanner.nextInt()));
                        break;
                    case 10:
                        System.out.println("Enter Trainee Id to update TraineeName ");
                        int id = scanner.nextInt();
                        System.out.println("Enter new Name: ");
                        String newName = scanner.next();
                        boolean nameUpdated = xworkz.updateTraineeNameById(id, newName);
                        System.out.println("Name Updated: " + nameUpdated);
                        break;
                    case 11:
                        System.out.println("Enter Trainee Id to update Subject ");
                        int id1 = scanner.nextInt();
                        System.out.println("Enter new Subject (JAVAFULLSTACK, FRONTEND, SQL, DATA): ");
                        Subject subject = Subject.valueOf(scanner.next().toUpperCase());
                        boolean subjectUpdated = xworkz.updateSubjectByTraineeId(id1, subject);
                        System.out.println("Subject Updated: " + subjectUpdated);
                        break;
                    case 12:
                        System.out.println("Enter Trainee Id to update PhoneNumber ");
                        int id2 = scanner.nextInt();
                        System.out.println("Enter new Phone Number: ");
                        long phone = scanner.nextLong();
                        boolean phoneUpdated = xworkz.updatePhoneNumberByTraineeId(id2, phone);
                        System.out.println("Phone Updated: " + phoneUpdated);
                        break;
                    case 13:
                        System.out.println("Enter Trainee Id to update NoOfClasses ");
                        int id3 = scanner.nextInt();
                        System.out.println("Enter new No. of Classes Taken: ");
                        int classes = scanner.nextInt();
                        boolean classesUpdated = xworkz.updateNoOfClassesTakenByTraineeId(id3, classes);
                        System.out.println("Classes Updated: " + classesUpdated);
                        break;
                    case 14:
                        System.out.println("Enter Trainee Id to get TraineeDetails ");
                        int id4 = scanner.nextInt();
                        Trainee trainee = xworkz.getTraineeDetailsbyId(id4);
                        xworkz.fetchTraineeDetails(trainee);
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
