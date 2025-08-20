package com.xworkz.gitagapp;

import com.xworkz.gitagapp.gitag.GiTag;

public class GiTagRunner {

    public static void main(String[] gitag) {

        GiTag tag = new GiTag();

        tag.setId(1);
        tag.setProductName( "Mysore Silk");
        tag.setState("Karnataka");
        tag.setYearOfRegistration(2005);
        tag.setCategory("Textile");

        int id = tag.getId();
        String productName = tag.getProductName();
        String state = tag.getState();
        int yor = tag.getYearOfRegistration();
        String category = tag.getCategory();

        System.out.println("the id is " + id);
        System.out.println("the product name is " + productName);
        System.out.println("the state is " + state);
        System.out.println("the year of registration is " + yor);
        System.out.println("the category is " + category);
    }
}
