package com.xworkz.newspaperapp;

import com.xworkz.newspaperapp.impl.NewspaperImpl;
import com.xworkz.newspaperapp.newspaper.Newspaper;

public class Runner {

    public static void main(String[] args) {

        Newspaper newspaper = new NewspaperImpl()   ;

        newspaper.readNews();
        newspaper.printNews();
        newspaper.distribute();
    }
}
