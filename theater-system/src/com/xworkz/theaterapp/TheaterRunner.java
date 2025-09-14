package com.xworkz.theaterapp;

import com.xworkz.theaterapp.constants.Certification;
import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.theater.Theather;

import java.util.Scanner;

public class TheaterRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of movies to be add");
        int size = scanner.nextInt();
        Theather theather= new Theather(size);
        System.out.println("Theater Available are :"+theather.movies.length);

        for (int index=0; index<size ; index++){

            Movie movie = new Movie();

            System.out.println("Enter  id :");
            movie.setMovieId(scanner.nextInt());

            System.out.println("Enter movie name :");
            movie.setMovieName(scanner.next());

            System.out.println("Enter hero Name :");
            movie.setHero(scanner.next());

            System.out.println("Duration :");
            movie.setDuration(scanner.next());

            System.out.println("Certification  from :U, UA, A");
            movie.setCertification(Certification.valueOf(scanner.next().toUpperCase()));

            theather.addmovie(movie);
        }
        theather.getmovieInfo();



            System.out.println("enter movie Id");
            System.out.println("the Movie Name is " + theather.getMovieNameById(scanner.nextInt()));

            System.out.println("enter movie Name");
            System.out.println("the Movie Id is " + theather.getMovieIdByName(scanner.next()));

            System.out.println("enter movie Id");
            System.out.println("the Certification is " + theather.getCertificationById(scanner.nextInt()));

            System.out.println("enter movie Name");
            System.out.println("the Certification is " + theather.getCertificationByName(scanner.next()));

            System.out.println("enter movie Id");
            System.out.println("the Hero is " + theather.getHeroById(scanner.nextInt()));

            System.out.println("enter movie Name");
            System.out.println("the Hero is " + theather.getHeroByName(scanner.next()));

            System.out.println("enter movie Id");
            System.out.println("the Duration is " + theather.getDurationById(scanner.nextInt()));

            System.out.println("enter movie Name");
            System.out.println("the Duration is " + theather.getDurationByName(scanner.next()));

            System.out.println("enter movie Id");
            int id = scanner.nextInt();
            System.out.println("enter new Movie Name");
            String newName = scanner.next();
            theather.updateMovieNameById(id, newName);
                theather.getmovieInfo();

            System.out.println("enter movie Id");
            int id1 = scanner.nextInt();
            System.out.println("enter new Hero");
            String newHero = scanner.next();
            theather.updateHeroById(id1, newHero);
                theather.getmovieInfo();

            System.out.println("enter movie Id");
            int id2 = scanner.nextInt();
            System.out.println("enter new Duration (e.g., 2h30m)");
            String newDuration = scanner.next();
            if(theather.updateDurationById(id2, newDuration))
                theather.getmovieInfo();

            System.out.println("enter movie Id");
            int id3 = scanner.nextInt();
            System.out.println("enter new Certification from U, UA, A, R");
            Certification newCert = Certification.valueOf(scanner.next().toUpperCase());
            theather.updateCertificationById(id3, newCert);
                theather.getmovieInfo();




        System.out.println("Enter id to get book details");
        int id4 = scanner.nextInt();
       Movie movie =  theather.getMovieDetailsById(id4);

       theather.fetchmovieInfo(movie);
    }
}
