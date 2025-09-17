package com.xworkz.restaurantapp;

import com.xworkz.restaurantapp.impl.UdupiImpl;
import com.xworkz.restaurantapp.restaurant.Restaurant;

public class RestaurantRunner {

    public static void main(String[] args) {

        Restaurant restaurant = new UdupiImpl();

        restaurant.prepareFood();
        restaurant.takeOrder();
        restaurant.serveToCustomer();
    }
}
