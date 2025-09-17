package com.xworkz.phonepeapp;

import com.xworkz.phonepeapp.impl.PhonepeImpl;
import com.xworkz.phonepeapp.phonepe.PhonePe;

public class PhonepeRunner {
    public static void main(String[] args) {

        PhonePe phonePe = new PhonepeImpl();

        phonePe.pay();
        phonePe.transfer();
        phonePe.checkBalance();
    }
}


