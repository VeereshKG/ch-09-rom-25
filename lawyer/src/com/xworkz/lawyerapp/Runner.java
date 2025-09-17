package com.xworkz.lawyerapp;

import com.xworkz.lawyerapp.impl.LawyerImpl;
import com.xworkz.lawyerapp.lawyer.Lawyer;

public class Runner {

    public static void main(String[] args) {
        Lawyer lawyer = new LawyerImpl();
        lawyer.adviseClient();
        lawyer.prepareCase();
        lawyer.representInCourt();
    }
}
