package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.movie.Movie;

public class Theather {

    public Theather(int size){
        movies = new Movie[size];
    }


   public Movie[] movies = new Movie[10];
    int index;

    public boolean addmovie(Movie movie) {
        boolean isMovieAdded = false;

        if (movie != null) {
            movies[index++] = movie;
            isMovieAdded = true;
        } else System.out.println("invalid moviee");
        return isMovieAdded;
    }
    public  void getmovieInfo(){
        System.out.println("the movie details are :");
        for (Movie movie : movies) {
        System.out.println("the id of the movie is "+movie.getMovieId());
        System.out.println("the name of the movie is "+movie.getMovieName());
        System.out.println("the hero of the movie is "+movie.getHero());
        System.out.println("the duration of the movie is "+movie.getDuration());
        System.out.println("the certificate of the movie is "+movie.getCertification());
        System.out.println("-----------------------------------");

    }}
}
