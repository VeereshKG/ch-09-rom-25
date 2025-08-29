package com.xworkz.moviegenourapp.comedy;

import com.xworkz.moviegenourapp.moviegenour.MovieGenour;

public class ComedyMovie extends MovieGenour {
    public ComedyMovie(){
        super();
        System.out.println("ComedyMovie constructor is invoked");
    }
    @Override
    public void tobelongs(){
        System.out.println("only comedy movies");
    }
}
