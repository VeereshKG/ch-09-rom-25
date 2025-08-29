package com.xworkz.moviegenourapp;

import com.xworkz.moviegenourapp.comedy.ComedyMovie;
import com.xworkz.moviegenourapp.moviegenour.MovieGenour;

public class MovieGenourRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        MovieGenour movieGenour = new ComedyMovie();
        movieGenour.tobelongs();
        System.out.println("main ended");

    }
}
