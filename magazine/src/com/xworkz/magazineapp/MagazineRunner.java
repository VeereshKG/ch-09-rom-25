package com.xworkz.magazineapp;

import com.xworkz.magazineapp.impl.MagazineImpl;
import com.xworkz.magazineapp.magazine.Magazine;

public class MagazineRunner {

    public static void main(String[] args) {


        Magazine magazine = new MagazineImpl();
        magazine.distribute();
        magazine.printContent();
        magazine.writeContent();

    }
}
