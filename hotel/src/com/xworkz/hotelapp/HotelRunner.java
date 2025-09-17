package com.xworkz.hotelapp;

import com.xworkz.hotelapp.hotel.Hotel;
import com.xworkz.hotelapp.impl.HotelImpl;

public class HotelRunner {

    public static void main(String[] args) {
        Hotel hotel = new HotelImpl();
        hotel.book();
        hotel.checkAvailability();
        hotel.cancel();
    }
}
