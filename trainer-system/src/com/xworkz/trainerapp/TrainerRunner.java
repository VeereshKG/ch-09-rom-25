package com.xworkz.trainerapp;

import com.xworkz.trainerapp.dev.Dev;
import com.xworkz.trainerapp.trainer.Trainer;

public class TrainerRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Trainer trainer = new Dev();
        trainer.teach();
        System.out.println("main ended");
    }
}
