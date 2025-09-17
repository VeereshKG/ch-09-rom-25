package com.xworkz.membershipapp.impl;

import com.xworkz.membershipapp.gym.Gym;

public class GymImpl implements Gym {

    @Override
    public void createMembership() {
        System.out.println("Creating new gym membership");
    }
    @Override
    public void renewMembership() {
        System.out.println("Renewing gym membership");
    }
    @Override
    public void cancelMembership()
    { System.out.println("Cancelling gym membership"); }
}
