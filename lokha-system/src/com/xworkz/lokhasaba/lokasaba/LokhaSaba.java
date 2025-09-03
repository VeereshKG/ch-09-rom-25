package com.xworkz.lokhasaba.lokasaba;

import com.xworkz.lokhasaba.politician.Politician;
import com.xworkz.lokhasaba.politicianvalidator.PoliticianValidator;

public class LokhaSaba {
    Politician[] politicians = new Politician[12];
    int index;

    public boolean addPolitician(Politician politician) {
        boolean isPoliticianAdded = false;

        if (politician != null) {
            politicians[index++] = politician;
            isPoliticianAdded = true;
        } else System.out.println("invalid trainee");
        return isPoliticianAdded;
    }

    public void getAllPoiticiansInfo() {
        System.out.println("the politicians are ");
        for (Politician politician : politicians) {


            System.out.println("the id of the politicion is   " + politician.getId());
            System.out.println("the name of the politicion is   " + politician.getName());
            System.out.println("the constitution of the politicion is   " + politician.getConstitution());
            System.out.println("the age of the politicion is   " + politician.getAge());
            System.out.println("the is Indian of the politicion is   " + politician.getNationality());

        }
    }
}