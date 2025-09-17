package com.xworkz.magazineapp.impl;

import com.xworkz.magazineapp.magazine.Magazine;

public class MagazineImpl implements Magazine {
    @Override
    public void writeContent() {
        System.out.println("write");
    }

    @Override
    public void printContent() {
        System.out.println("print");
    }

    @Override
    public void distribute() {
        System.out.println("distribute");
    }
}
