package com.xworkz.casinoapp;

import com.xworkz.casinoapp.casino.Casino;

public class CasinoRunner {
    public static void main(String[] args) {


        Casino casino = new Casino();

        casino.setCasinoId(1);
        casino.setName("Bellagio");
        casino.setLocation("LasVegas");
        casino.setIsOpen24Hours(true);
        casino.setEntryFee(400.0);

        System.out.println("the casino id is " + casino.getCasinoId());
        System.out.println("the name is " + casino.getName());
        System.out.println("the location is " + casino.getLocation());
        System.out.println("is open 24 hours " +casino.getIsOpen24Hours());
        System.out.println("the entry fee is " + casino.getEntryFee());
    }
}
