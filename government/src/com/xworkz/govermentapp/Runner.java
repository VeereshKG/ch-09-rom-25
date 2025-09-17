package com.xworkz.govermentapp;

import com.xworkz.govermentapp.government.Government;
import com.xworkz.govermentapp.impl.GovernmentImpl;

public class Runner {

    public static void main(String[] args) {
        Government government = new GovernmentImpl();
        government.proposePolicy();
        government.debatePolicy();
        government.implementPolicy();
    }
}
