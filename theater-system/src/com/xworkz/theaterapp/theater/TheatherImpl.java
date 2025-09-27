package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.constants.Certification;
import com.xworkz.theaterapp.exception.*;
import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.validator.MovieValidator;

public class TheatherImpl implements Theather {

    public TheatherImpl(int size) {
        movies = new Movie[size];
    }


    MovieValidator movieValidator = new MovieValidator();
    public Movie[] movies;
    int index;

    @Override
    public boolean addmovie(Movie movie) {
        boolean isMovieAdded = false;
        try {
            if (movieValidator.isMovieInfoValid(movie)) {
                movies[index++] = movie;
                isMovieAdded = true;
            } else System.out.println("invalid moviee");
            if (isMovieAdded == false) {
                MovieNotAddedException movieNotAddedException = new MovieNotAddedException("movie not added");
                throw movieNotAddedException;
            }
        } catch (MovieNotAddedException e) {
            e.printStackTrace();
        }
        return isMovieAdded;
    }

    @Override
    public void getmovieInfo() {
        System.out.println("the movie details are :");
        for (Movie movie : movies) {
            System.out.println("the id of the movie is " + movie.getMovieId());
            System.out.println("the name of the movie is " + movie.getMovieName());
            System.out.println("the hero of the movie is " + movie.getHero());
            System.out.println("the duration of the movie is " + movie.getDuration());
            System.out.println("the certificate of the movie is " + movie.getCertification());
            System.out.println("-----------------------------------");

        }
    }


    @Override
    public String getMovieNameById(int movieId) {
        String name = null;
        try {
            if (movieId != 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == movieId) {
                        name = movie.getMovieName();
                    }
                }
            } else System.out.println("Enter valid ID");

            if (name == null) {
                MovieNameNotFoundException movieNameNotFoundException = new MovieNameNotFoundException("movie not found");
                throw movieNameNotFoundException;
            }
        } catch (MovieNameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public Integer getMovieIdByName(String movieName) {
        Integer id = null;
        try {
            if (movieName != null) {
                for (Movie movie : movies) {
                    if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                        id = movie.getMovieId();
                    }
                }
            } else System.out.println("Enter valid name");

            if (id == null) {
                MovieIdNotFoundException movieIdNotFoundException = new MovieIdNotFoundException("movie id not found");
                throw movieIdNotFoundException;
            }
        } catch (MovieIdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public Certification getCertificationById(int movieId) {
        Certification cert = null;
        try {
            if (movieId != 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == movieId) {
                        cert = movie.getCertification();
                    }
                }
            } else System.out.println("Enter valid ID");

            if (cert == null) {
                CertificationNotFoundException certificationNotFoundException = new CertificationNotFoundException("Certification not found");
                throw certificationNotFoundException;
            }
        } catch (CertificationNotFoundException e) {
            e.printStackTrace();
        }
        return cert;
    }

    @Override
    public Certification getCertificationByName(String movieName) {
        Certification cert = null;
        try {
            if (movieName != null) {
                for (Movie movie : movies) {
                    if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                        cert = movie.getCertification();
                    }
                }
            } else System.out.println("Enter valid name");

            if (cert == null) {
                CertificationNotFoundException certificationNotFoundException = new CertificationNotFoundException("Certification not found");
                throw certificationNotFoundException;
            }
        } catch (CertificationNotFoundException e) {
            e.printStackTrace();
        }
        return cert;
    }

    @Override
    public String getHeroById(int movieId) {
        String hero = null;
        try {
            if (movieId != 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == movieId) {
                        hero = movie.getHero();
                    }
                }
            } else System.out.println("Enter valid ID");

            if (hero == null) {
                HeroNotFoundException heroNotFoundException = new HeroNotFoundException("hero not found ");
                throw heroNotFoundException;
            }
        } catch (HeroNotFoundException e) {
            e.printStackTrace();
        }
        return hero;
    }

    @Override
    public String getDurationById(int movieId) {
        String duration = null;
        try {
            if (movieId != 0) {
                for (Movie movie : movies) {
                    if (movie.getMovieId() == movieId) {
                        duration = movie.getDuration();
                    }
                }
            } else System.out.println("Enter valid ID");

            if (duration == null) {
                DurationNotFoundException durationNotFoundException = new DurationNotFoundException("Duration not found");
                throw durationNotFoundException;
            }
        } catch (DurationNotFoundException e) {
            e.printStackTrace();
        }
        return duration;
    }

    @Override
    public String getHeroByName(String movieName) {
        String hero = null;
        try {
            if (movieName != null) {
                for (Movie movie : movies) {
                    if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                        hero = movie.getHero();
                    }
                }
            } else System.out.println("Enter valid name");

            if (hero == null) {
                HeroNotFoundException heroNotFoundException = new HeroNotFoundException("hero not found ");
                throw heroNotFoundException;
            }
        } catch (HeroNotFoundException e) {
            e.printStackTrace();
        }
        return hero;
    }

    @Override
    public String getDurationByName(String movieName) {
        String duration = null;
        try {
            if (movieName != null) {
                for (Movie movie : movies) {
                    if (movie.getMovieName().equalsIgnoreCase(movieName)) {
                        duration = movie.getDuration();
                    }
                }
            } else System.out.println("Enter valid name");

            if (duration == null) {
                DurationNotFoundException durationNotFoundException = new DurationNotFoundException("Duration not found");
                throw durationNotFoundException;
            }
        } catch (DurationNotFoundException e) {
            e.printStackTrace();
        }
        return duration;
    }

    @Override
    public boolean updateMovieNameById(int movieId, String newName) {
        boolean isUpdated = false;
        try {
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
            if (isUpdated == false) {
                UpdateMovieNameNotDoneException updateMovieNameNotDoneException = new UpdateMovieNameNotDoneException("updateMovieName not done");
                throw updateMovieNameNotDoneException;
            }
        } catch (UpdateMovieNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateHeroById(int movieId, String newHero) {
        boolean isUpdated = false;
        try {
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
            if (isUpdated == false) {
                UpdateHeroNotDoneexception updateHeroNotDoneexception = new UpdateHeroNotDoneexception("updateHero not done");
                throw updateHeroNotDoneexception;
            }
        } catch (UpdateHeroNotDoneexception e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateDurationById(int movieId, String newDuration) {
        boolean isUpdated = false;
        try {
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
            if (isUpdated == false) {
                UpdateDurationNotDoneException updateDurationNotDoneException = new UpdateDurationNotDoneException("updateDuration not done");
                throw updateDurationNotDoneException;
            }
        } catch (UpdateDurationNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateCertificationById(int movieId, Certification newCert) {
        boolean isUpdated = false;
        try {
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
            if (isUpdated == false) {
                UpdateCertificationNotDoneException updateCertificationNotDoneException = new UpdateCertificationNotDoneException("updateCertification not done");
                throw updateCertificationNotDoneException;
            }
        } catch (UpdateCertificationNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public Movie getMovieDetailsById(int id) {
        Movie movie = null;
        try {
            if (id != 0) {
                for (Movie movie1 : movies) {
                    if (movie1.getMovieId() == id) {
                        movie = movie1;
                    }
                }
            } else if (movie == null) {
                MovieDetailsNotDoneException movieDetailsNotDoneException = new MovieDetailsNotDoneException("movie details not found");
                throw movieDetailsNotDoneException;
            }
        } catch (MovieDetailsNotDoneException e) {
            e.printStackTrace();
        }
        return movie;
    }

    @Override
    public void fetchmovieInfo(Movie movie) {
        try {
            System.out.println("the id of the movie is " + movie.getMovieId());
            System.out.println("the name of the movie is " + movie.getMovieName());
            System.out.println("the hero of the movie is " + movie.getHero());
            System.out.println("the duration of the movie is " + movie.getDuration());
            System.out.println("the certificate of the movie is " + movie.getCertification());
            System.out.println("-----------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public int size() {
        return movies.length;
    }
}
