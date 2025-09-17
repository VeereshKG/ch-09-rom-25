package com.xworkz.phonepeapp.impl;

import com.xworkz.phonepeapp.phonepe.PhonePe;

public class PhonepeImpl implements PhonePe {
    @Override
    public void pay() {
        System.out.println("pay amount");
    }

    @Override
    public void transfer() {
        System.out.println("transfer amount");
    }

    @Override
    public void checkBalance() {
        System.out.println("check balance");
    }
}
