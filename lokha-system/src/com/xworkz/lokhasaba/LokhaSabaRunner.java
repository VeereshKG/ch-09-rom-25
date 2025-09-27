package com.xworkz.lokhasaba;

import com.xworkz.lokhasaba.lokasaba.LokhaSaba;
import com.xworkz.lokhasaba.lokasaba.LokhaSabaImpl;
import com.xworkz.lokhasaba.nationality.Nationality;
import com.xworkz.lokhasaba.politician.Politician;

import java.util.Scanner;

public class LokhaSabaRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of politicians: ");
        int size = scanner.nextInt();

        LokhaSaba lokhaSaba = new LokhaSabaImpl(size);
        System.out.println("No of politicians available: " + lokhaSaba.size());
        boolean isAdded = false;
        for (int index = 0; index < size; index++) {
            Politician politician = new Politician();

            System.out.println("Enter Id: ");
            politician.setId(scanner.nextInt());

            System.out.println("Enter Name: ");
            politician.setName(scanner.next());

            System.out.println("Enter Age: ");
            politician.setAge(scanner.nextInt());

            System.out.println("Enter Nationality (INDIA, USA, CANADA, AUSTRALIA, JAPAN): ");
            politician.setNationality(Nationality.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter Constitution: ");
            politician.setConstitution(scanner.next());

            isAdded = lokhaSaba.addPolitician(politician);
        }
        if (isAdded == true) {
            String input;
            do {
                System.out.println("press 1 to Get All Politicians Info");
                System.out.println("press 2 to Get Name by Id");
                System.out.println("press 3 to Get Id by Name");
                System.out.println("press 4 to Get Constitution by Id");
                System.out.println("press 5 to Get Constitution by Name");
                System.out.println("press 6 to Get Age by Id");
                System.out.println("press 7 to Get Age by Name");
                System.out.println("press 8 to Get Nationality by Id");
                System.out.println("press 9 to Get Nationality by Name");
                System.out.println("press 10 to Update Name by Id");
                System.out.println("press 11 to Update Constitution by Id");
                System.out.println("press 12 to Update Age by Id");
                System.out.println("press 13 to Update Nationality by Id");
                System.out.println("press 14 to Get Politician Details by Id");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        lokhaSaba.getAllPoliticiansInfo();
                        break;
                    case 2:
                        System.out.println("Enter Politician Id to getName ");
                        System.out.println("Name: " + lokhaSaba.getNameById(scanner.nextInt()));
                        break;
                    case 3:
                        System.out.println("Enter Politician Name to getId ");
                        System.out.println("Id: " + lokhaSaba.getIdByName(scanner.next()));
                        break;
                    case 4:
                        System.out.println("Enter Politician Id to getConstitution ");
                        System.out.println("Constitution: " + lokhaSaba.getConstitutionById(scanner.nextInt()));
                        break;
                    case 5:
                        System.out.println("Enter Politician Name to getConstitution ");
                        System.out.println("Constitution: " + lokhaSaba.getConstitutionByName(scanner.next()));
                        break;
                    case 6:
                        System.out.println("Enter Politician Id to getAge ");
                        System.out.println("Age: " + lokhaSaba.getAgeById(scanner.nextInt()));
                        break;
                    case 7:
                        System.out.println("Enter Politician Name to getAge ");
                        System.out.println("Age: " + lokhaSaba.getAgeByName(scanner.next()));
                        break;
                    case 8:
                        System.out.println("Enter Politician Id to getNationality ");
                        System.out.println("Nationality: " + lokhaSaba.getNationalityById(scanner.nextInt()));
                        break;
                    case 9:
                        System.out.println("Enter Politician Name to getNationality ");
                        System.out.println("Nationality: " + lokhaSaba.getNationalityByName(scanner.next()));
                        break;
                    case 10:
                        System.out.println("Enter Politician Id to updateName ");
                        int id = scanner.nextInt();
                        System.out.println("Enter new Name: ");
                        String newName = scanner.next();
                        boolean nameUpdated = lokhaSaba.updateNameById(id, newName);
                        System.out.println("Name Updated: " + nameUpdated);
                        break;
                    case 11:
                        System.out.println("Enter Politician Id to updateConstitution ");
                        int id1 = scanner.nextInt();
                        System.out.println("Enter new Constitution: ");
                        String newConstitution = scanner.next();
                        boolean constitutionUpdated = lokhaSaba.updateConstitutionById(id1, newConstitution);
                        System.out.println("Constitution Updated: " + constitutionUpdated);
                        break;
                    case 12:
                        System.out.println("Enter Politician Id to updateAge ");
                        int id2 = scanner.nextInt();
                        System.out.println("Enter new Age: ");
                        int newAge = scanner.nextInt();
                        boolean ageUpdated = lokhaSaba.updateAgeById(id2, newAge);
                        System.out.println("Age Updated: " + ageUpdated);
                        break;
                    case 13:
                        System.out.println("Enter Politician Id to updateNationality ");
                        int id3 = scanner.nextInt();
                        System.out.println("Enter new Nationality (INDIA, USA, CANADA, AUSTRALIA, JAPAN): ");
                        Nationality newNationality = Nationality.valueOf(scanner.next().toUpperCase());
                        boolean nationalityUpdated = lokhaSaba.updateNationalityById(id3, newNationality);
                        System.out.println("Nationality Updated: " + nationalityUpdated);
                        break;
                    case 14:
                        System.out.println("Enter Politician Id to getPoliticianDetails");
                        int id4 = scanner.nextInt();
                        Politician politician = lokhaSaba.getPoliticianDetailsById(id4);
                        lokhaSaba.fetchPoliticianDetails(politician);
                        break;
                    default:
                        System.out.println("Please enter a valid option!");
                }

                System.out.println("Do you want to continue? (yes/no): ");
                input = scanner.next();
            } while (input.equalsIgnoreCase("yes"));

            System.out.println("Thank you.. Visit again!");
        } else System.out.println("Not added");
    }
}
