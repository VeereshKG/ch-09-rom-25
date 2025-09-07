package com.xworkz.lokhasaba;

import com.xworkz.lokhasaba.lokasaba.LokhaSaba;
import com.xworkz.lokhasaba.politician.Politician;

import java.util.Scanner;

public class LokhaSabaRunner {
    public static void main(String[] args) {

//        Politician politician =new Politician(1,"lakshimi kantha","laggere",45,"indian");
//
//        LokhaSaba lokhaSaba=new LokhaSaba();
//
//        lokhaSaba.addPolitician(politician);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of politician :");
        int size = scanner.nextInt();

        LokhaSaba lokhaSaba = new LokhaSaba(size);
        System.out.println("Enter no of politician available are :"+lokhaSaba.politicians.length);

        for (int index=0; index<size ; index++){

            Politician politician = new Politician();

            System.out.println("Enter id :");
            politician.setId(scanner.nextInt());

            System.out.println("Enter name :");
            politician.setName(scanner.next());

            System.out.println("Enter Age :");
            politician.setAge(scanner.nextInt());

            System.out.println("Enter nationality");
            politician.setNationality(scanner.next());

            System.out.println("Enter constitution");
            politician.setConstitution(scanner.next());

            lokhaSaba.addPolitician(politician);

        }
        lokhaSaba.getAllPoliticiansInfo();
    }
}
