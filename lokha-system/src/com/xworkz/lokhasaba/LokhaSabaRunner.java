package com.xworkz.lokhasaba;

import com.xworkz.lokhasaba.lokasaba.LokhaSaba;
import com.xworkz.lokhasaba.lokasaba.LokhaSabaImpl;
import com.xworkz.lokhasaba.nationality.Nationality;
import com.xworkz.lokhasaba.politician.Politician;

import java.util.Scanner;

public class LokhaSabaRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of politician :");
        int size = scanner.nextInt();

        LokhaSaba lokhaSaba = new LokhaSabaImpl(size);
        System.out.println("Enter no of politician available are :"+lokhaSaba.size());

        for (int index=0; index<size ; index++){

            Politician politician = new Politician();

            System.out.println("Enter id :");
            politician.setId(scanner.nextInt());

            System.out.println("Enter name :");
            politician.setName(scanner.next());

            System.out.println("Enter Age :");
            politician.setAge(scanner.nextInt());

            System.out.println("Enter nationality");
            politician.setNationality(Nationality.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter constitution");
            politician.setConstitution(scanner.next());

            lokhaSaba.addPolitician(politician);

        }
        lokhaSaba.getAllPoliticiansInfo();


            System.out.println("enter Politician ID");
            System.out.println("Name: " + lokhaSaba.getNameById(scanner.nextInt()));

            System.out.println("enter Politician Name");
            System.out.println("ID: " + lokhaSaba.getIdByName(scanner.next()));

            System.out.println("enter Politician ID");
            System.out.println("Constitution: " + lokhaSaba.getConstitutionById(scanner.nextInt()));

            System.out.println("enter Politician Name");
            System.out.println("Constitution: " + lokhaSaba.getConstitutionByName(scanner.next()));

            System.out.println("enter Politician ID");
            System.out.println("Age: " + lokhaSaba.getAgeById(scanner.nextInt()));

            System.out.println("enter Politician Name");
            System.out.println("Age: " + lokhaSaba.getAgeByName(scanner.next()));

            System.out.println("enter Politician ID");
            System.out.println("Nationality: " + lokhaSaba.getNationalityById(scanner.nextInt()));

            System.out.println("enter Politician Name");
            System.out.println("Nationality: " + lokhaSaba.getNationalityByName(scanner.next()));

            System.out.println("enter Politician ID");
            int id = scanner.nextInt();
            System.out.println("enter new Name");
            String newName = scanner.next();
            lokhaSaba.updateNameById(id, newName);

            lokhaSaba.getAllPoliticiansInfo();

            System.out.println("enter Politician ID");
            int id1 = scanner.nextInt();
            System.out.println("enter new Constitution");
            String newConstitution = scanner.next();
            lokhaSaba.updateConstitutionById(id1, newConstitution);
            lokhaSaba.getAllPoliticiansInfo();

            System.out.println("enter Politician ID");
            int id2 = scanner.nextInt();
            System.out.println("enter new Age");
            int newAge = scanner.nextInt();
            lokhaSaba.updateAgeById(id2, newAge);
            lokhaSaba.getAllPoliticiansInfo();

            System.out.println("enter Politician ID");
            int id3 = scanner.nextInt();
            System.out.println("enter new Nationality from INDIA, USA, CANADA, AUSTRALIA, JAPAN");
            Nationality newNationality = Nationality.valueOf(scanner.next().toUpperCase());
            lokhaSaba.updateNationalityById(id3, newNationality);

        lokhaSaba.getAllPoliticiansInfo();

        System.out.println("Enter id to get politician details");
        int id4 = scanner.nextInt();
      Politician politician =  lokhaSaba.getPoliticianDetailsById(id4);

      lokhaSaba.fetchPoliticianDetails(politician);
     }

    }

