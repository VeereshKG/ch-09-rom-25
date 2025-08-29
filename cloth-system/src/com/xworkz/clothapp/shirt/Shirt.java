package com.xworkz.clothapp.shirt;

import com.xworkz.clothapp.cloth.Cloth;

public class Shirt extends Cloth {

    public Shirt(){
        super();
        System.out.println("Shirt constructor is invoked");
    }
    @Override
    public void Available() {
        System.out.println("only shirt is available");
    }
}
