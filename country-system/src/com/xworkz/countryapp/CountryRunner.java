package com.xworkz.countryapp;

import com.xworkz.countryapp.country.Country;
import com.xworkz.countryapp.india.India;

public class CountryRunner {

    public static void main(String[] args) {
        System.out.println("main started");
        Country country = new India();
        country.country();
        System.out.println("main ended");
    }

}
