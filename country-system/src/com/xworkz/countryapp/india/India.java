package com.xworkz.countryapp.india;

import com.xworkz.countryapp.country.Country;

public class India extends Country {

    public India(){
        super();
        System.out.println("india constructor is invoked");
    }
    @Override
    public void country(){
        System.out.println("india");
    }
}
