package com.xworkz.hotelapp.impl;

import com.xworkz.hotelapp.hotel.Hotel;

public class HotelImpl implements Hotel {

    @Override
    public void book() { System.out.println("Hotel room booked"); }
    @Override
    public void cancel() { System.out.println("Hotel booking canceled"); }
    @Override
    public void checkAvailability() { System.out.println("Hotel room availability checked"); }
}
