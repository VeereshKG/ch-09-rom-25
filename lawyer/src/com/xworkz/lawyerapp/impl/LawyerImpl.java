package com.xworkz.lawyerapp.impl;

import com.xworkz.lawyerapp.lawyer.Lawyer;

public class LawyerImpl implements Lawyer {
    @Override
    public void adviseClient() {
        System.out.println("adviseClient");
    }

    @Override
    public void prepareCase() {
        System.out.println("prepareCase");
    }

    @Override
    public void representInCourt() {
        System.out.println("representInCourt");
    }
}
