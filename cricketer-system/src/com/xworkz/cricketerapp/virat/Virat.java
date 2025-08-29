package com.xworkz.cricketerapp.virat;

import com.xworkz.cricketerapp.cricketer.Cricketer;

public class Virat extends Cricketer {

    public Virat(){
        System.out.println("Virat constructor is invoked");
    }
    @Override
    public void play(){
        System.out.println("plays limited matches");
    }
}
