package com.xworkz.fishapp;

import com.xworkz.fishapp.fish.Fish;

public class FishRunner {
    public static void main(String[] args) {

        Fish fish = new Fish();

        fish.setFishId(1);
        fish.setName("nemo");
        fish.setSpecies("Clownfish");
        fish.setWeight(0.2);
        fish.setOrigin("Pacific Ocean");

        int id = fish.getFishId();
        String name = fish.getName();
        String species = fish.getSpecies();
        double weight = fish.getWeight();
        String origin = fish.getOrigin();
        System.out.println("the fish id is " + id);
        System.out.println("the name is " +name );
        System.out.println("the species is " + species);
        System.out.println("the weight is " +weight );
        System.out.println("origin is " + origin);

    }
}
