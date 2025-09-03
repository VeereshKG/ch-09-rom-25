package com.xworkz.theaterapp;

import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.theater.Theather;

public class TheaterRunner {
    public static void main(String[] args) {
        Movie movie = new Movie(1, "coolie", "rajinikanth", "2:15:35", "A");
        Movie movie1 = new Movie(2, "bedara kannappa", "rajkumar", "2:15:35", "A");
        Movie movie2 = new Movie(3, "nagarhavu", "vishnuvardhan", "2:15:35", "A");
        Movie movie3 = new Movie(4, "bul bul", "darshan", "2:10:35", "U");
        Movie movie4 = new Movie(5, "om", "upendra", "2:15:35", "U");
        Movie movie5 = new Movie(6, "huli hejje", "ramesh", "2:15:35", "A");
        Movie movie6 = new Movie(7, "tagaru", "shivrajkumar", "2:15:35", "A");
        Movie movie7 = new Movie(8, "pailwaan", "sudeep", "2:15:35", "A");
        Movie movie8 = new Movie(9, "kgf", "yash", "2:05:35", "U/A");
        Movie movie9 = new Movie(10, "james", "punith", "2:15:35", "A");


        Theather theather = new Theather();
        theather.addmovie(movie);
        theather.addmovie(movie1);
        theather.addmovie(movie2);
        theather.addmovie(movie3);
        theather.addmovie(movie4);
        theather.addmovie(movie5);
        theather.addmovie(movie6);
        theather.addmovie(movie7);
        theather.addmovie(movie8);
        theather.addmovie(movie9);

        theather.getmovieInfo();
    }
}
