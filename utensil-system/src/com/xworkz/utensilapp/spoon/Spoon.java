package com.xworkz.utensilapp.spoon;

import com.xworkz.utensilapp.utensil.Utensil;

public class Spoon extends Utensil {
    public Spoon() {
        super();
        System.out.println("Spoon  constructor is invoked");
    }
    @Override
    public void toFeed(){
        System.out.println("to feed and mix food ");
    }
}
