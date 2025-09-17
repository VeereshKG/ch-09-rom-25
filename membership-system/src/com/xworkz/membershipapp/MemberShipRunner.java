package com.xworkz.membershipapp;

import com.xworkz.membershipapp.gym.Gym;
import com.xworkz.membershipapp.impl.GymImpl;

public class MemberShipRunner {
    public static void main(String[] args) {
        Gym membership = new GymImpl();
        membership.createMembership();
        membership.renewMembership();
        membership.cancelMembership();
    }
}
