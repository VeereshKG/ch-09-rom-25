package com.xworkz.courtapp;

import com.xworkz.courtapp.courtcase.CourtCase;

public class CourtCaseRunner {

    public static void main(String[] args) {
        CourtCase courtcase = new CourtCase();

        courtcase.setCaseId(1);
        courtcase.setCaseName("accident");
        courtcase.setLawerName("raju");
        courtcase.setCaseOpenDate("12/05/2000");
        courtcase.setIsCaseClosed(false);

       int courtCase =  courtcase.getCaseId();
       String name =  courtcase.getCaseName();
       String lawer =  courtcase.getLawerName();
       String open = courtcase.getCaseOpenDate();
       boolean close = courtcase.getIsCaseClosed();

        System.out.println("the case id is "+courtCase);
        System.out.println("the case name is "+name);
        System.out.println("the lawerName is "+lawer);
        System.out.println("the case open Date "+open);
        System.out.println("is case closed "+close);
    }
}
