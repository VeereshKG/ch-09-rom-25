package com.xworkz.trainerapp.dev;

import com.xworkz.trainerapp.trainer.Trainer;

public class Dev extends Trainer {
    public Dev(){
        System.out.println("dev constructor is invoked");
    }
    @Override
    public void teach(){
        System.out.println("only java related concepts");
    }
}
