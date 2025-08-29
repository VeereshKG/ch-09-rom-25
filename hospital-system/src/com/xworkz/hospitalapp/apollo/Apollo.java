package com.xworkz.hospitalapp.apollo;

import com.xworkz.hospitalapp.hospital.Hospital;

public class Apollo extends Hospital {
    public Apollo(){
        super();
        System.out.println("Apollo constructor is invoked");
    }
    @Override
    public void admit(){
        System.out.println("admit for limited disease");
    }
}
