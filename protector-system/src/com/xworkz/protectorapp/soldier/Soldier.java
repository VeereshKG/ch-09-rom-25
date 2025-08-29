package com.xworkz.protectorapp.soldier;

import com.xworkz.protectorapp.protector.Protector;

public class Soldier extends Protector {
    public Soldier(){
        super();
        System.out.println("Soldier constructor is invoked");
    }
    @Override
    public void toProtect(){
        System.out.println("to protect  country");
    }
}
