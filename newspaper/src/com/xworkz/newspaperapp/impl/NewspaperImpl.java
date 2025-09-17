package com.xworkz.newspaperapp.impl;

import com.xworkz.newspaperapp.newspaper.Newspaper;

public class NewspaperImpl implements Newspaper {


    @Override
    public void printNews() {
        System.out.println("print news");
    }

    @Override
    public void readNews() {
        System.out.println("reading");
    }

    @Override
    public void distribute() {
        System.out.println("distribute");
    }
}
