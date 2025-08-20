package com.xworkz.festivalapp;

import com.xworkz.festivalapp.festival.Festivals;

public class FestivalsRunner {
    public static void main(String[] args) {

        Festivals festival = new Festivals();

        festival.setFestivalId(1);
        festival.setName("Diwali");
        festival.setState("All India");
        festival.setMonth("october");
        festival.setType("religious");

      int id =  festival.getFestivalId();
      String name =  festival.getName();
      String state =   festival.getState();
      String month =   festival.getMonth();
      String type =  festival.getType();
        System.out.println("The festival id is " + id);
        System.out.println("the name is " +name );
        System.out.println("the state is " + state);
        System.out.println("the month is " + month);
        System.out.println("the type is " +type );
    }
}
