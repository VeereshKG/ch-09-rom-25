package com.xworkz.restaurantapp.impl;

import com.xworkz.restaurantapp.restaurant.Restaurant;

public class UdupiImpl implements Restaurant {
    @Override
    public void prepareFood() {
        System.out.println("prepareFood");
    }

    @Override
    public void takeOrder() {
        System.out.println("takeOrder");
    }

    @Override
    public void serveToCustomer() {
        System.out.println("serveToCustomer");
    }
}
