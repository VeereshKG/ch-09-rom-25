package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.constants.Certification;
import com.xworkz.theaterapp.movie.Movie;

public interface Theather {

    int size();

    boolean addmovie(Movie movie);
    void getmovieInfo();
    String getMovieNameById(int movieId);
    Integer getMovieIdByName(String movieName);
    Certification getCertificationById(int movieId);
    Certification getCertificationByName(String movieName);
    String getHeroById(int movieId);
    String getDurationById(int movieId);
    String getHeroByName(String movieName);
    String getDurationByName(String movieName);
    boolean updateMovieNameById(int movieId, String newName);
    boolean updateHeroById(int movieId, String newHero);
    boolean updateDurationById(int movieId, String newDuration);
    boolean updateCertificationById(int movieId, Certification newCert);
    Movie getMovieDetailsById(int id);
    void fetchmovieInfo(Movie movie);
}
