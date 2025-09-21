package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.constants.Certification;
import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.validator.MovieValidator;

public class TheatherImpl implements Theather{

    public TheatherImpl(int size){
        movies = new Movie[size];
    }


    MovieValidator movieValidator = new MovieValidator();
   public Movie[] movies;
    int index;

    @Override
    public boolean addmovie(Movie movie) {
        boolean isMovieAdded = false;

        if (movie != null) {
            if (movieValidator.isMovieInfoValid(movie)) {

                movies[index++] = movie;
                isMovieAdded = true;
            }
        } else System.out.println("invalid moviee");
        return isMovieAdded;
    }
    @Override
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



@Override
    public String getMovieNameById(int movieId) {
        String name = null;
        if (movieId != 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == movieId) {
                    name = movie.getMovieName();
                }
            }
        } else System.out.println("Enter valid ID");

        if (name == null) System.out.println("ID not found");
        return name;
    }
    @Override
    public Integer getMovieIdByName(String movieName) {
        Integer id = null;
        if (movieName != null) {
            for (Movie movie : movies) {
                if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                    id = movie.getMovieId();
                }
            }
        } else System.out.println("Enter valid name");

        if (id == null) System.out.println("Name not found");
        return id;
    }
    @Override
    public Certification getCertificationById(int movieId) {
        Certification cert = null;
        if (movieId != 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == movieId) {
                    cert = movie.getCertification();
                }
            }
        } else System.out.println("Enter valid ID");

        if (cert == null) System.out.println("ID not found");
        return cert;
    }
    @Override
    public Certification getCertificationByName(String movieName) {
        Certification cert = null;
        if (movieName != null) {
            for (Movie movie : movies) {
                if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                    cert = movie.getCertification();
                }
            }
        } else System.out.println("Enter valid name");

        if (cert == null) System.out.println("Name not found");
        return cert;
    }
    @Override
    public String getHeroById(int movieId) {
        String hero = null;
        if (movieId != 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == movieId) {
                    hero = movie.getHero();
                }
            }
        } else System.out.println("Enter valid ID");

        if (hero == null) System.out.println("ID not found");
        return hero;
    }
    @Override
    public String getDurationById(int movieId) {
        String duration = null;
        if (movieId != 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == movieId) {
                    duration = movie.getDuration();
                }
            }
        } else System.out.println("Enter valid ID");

        if (duration == null) System.out.println("ID not found");
        return duration;
    }
    @Override
    public String getHeroByName(String movieName) {
        String hero = null;
        if (movieName != null) {
            for (Movie movie : movies) {
                if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                    hero = movie.getHero();
                }
            }
        } else System.out.println("Enter valid name");

        if (hero == null) System.out.println("Name not found");
        return hero;
    }
    @Override
    public String getDurationByName(String movieName) {
        String duration = null;
        if (movieName != null) {
            for (Movie movie : movies) {
                if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                    duration = movie.getDuration();
                }
            }
        } else System.out.println("Enter valid name");

        if (duration == null) System.out.println("Name not found");
        return duration;
    }
@Override
    public boolean updateMovieNameById(int movieId, String newName) {
        boolean isUpdated = false;
        if (movieId != 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == movieId) {
                    movie.setMovieName(newName);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }
    @Override
    public boolean updateHeroById(int movieId, String newHero) {
        boolean isUpdated = false;
        if (movieId != 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == movieId) {
                    movie.setHero(newHero);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }
    @Override
    public boolean updateDurationById(int movieId, String newDuration) {
        boolean isUpdated = false;
        if (movieId != 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == movieId) {
                    movie.setDuration(newDuration);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }
    @Override
    public boolean updateCertificationById(int movieId, Certification newCert) {
        boolean isUpdated = false;
        if (movieId != 0) {
            for (Movie movie : movies) {
                if (movie.getMovieId() == movieId) {
                    movie.setCertification(newCert);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }
    @Override
    public Movie getMovieDetailsById(int id){

        Movie movie = null;
        if (id != 0){
            for (Movie movie1 : movies){
                if (movie1.getMovieId() == id){
                    movie = movie1;
                }
            }
        }
        return movie;
    }
@Override
    public  void fetchmovieInfo(Movie movie){

            System.out.println("the id of the movie is "+movie.getMovieId());
            System.out.println("the name of the movie is "+movie.getMovieName());
            System.out.println("the hero of the movie is "+movie.getHero());
            System.out.println("the duration of the movie is "+movie.getDuration());
            System.out.println("the certificate of the movie is "+movie.getCertification());
            System.out.println("-----------------------------------");

        }


    @Override
    public int size() {
        return movies.length;
    }
}
