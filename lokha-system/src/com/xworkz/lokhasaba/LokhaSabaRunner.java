package com.xworkz.lokhasaba;

import com.xworkz.lokhasaba.lokasaba.LokhaSaba;
import com.xworkz.lokhasaba.politician.Politician;

public class LokhaSabaRunner {
    public static void main(String[] args) {

        Politician politician =new Politician(1,"lakshimi kantha","laggere",45,"indian");

        LokhaSaba lokhaSaba=new LokhaSaba();

        lokhaSaba.addPolitician(politician);
        lokhaSaba.getAllPoiticiansInfo();
    }
}
