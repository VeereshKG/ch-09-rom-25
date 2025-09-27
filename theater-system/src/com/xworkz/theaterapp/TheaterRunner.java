package com.xworkz.theaterapp;

import com.xworkz.theaterapp.constants.Certification;
import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.theater.Theather;
import com.xworkz.theaterapp.theater.TheatherImpl;

import java.util.Scanner;

public class TheaterRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of movies to add:");
        int size = scanner.nextInt();

        Theather theather = new TheatherImpl(size);
        System.out.println("Theater slots available: " + theather.size());
        boolean isAdded = false;
        for (int index = 0; index < size; index++) {
            Movie movie = new Movie();

            System.out.println("Enter Movie Id:");
            movie.setMovieId(scanner.nextInt());

            System.out.println("Enter Movie Name:");
            movie.setMovieName(scanner.next());

            System.out.println("Enter Hero Name:");
            movie.setHero(scanner.next());

            System.out.println("Enter Duration (e.g., 2h30m):");
            movie.setDuration(scanner.next());

            System.out.println("Enter Certification (U, UA, A):");
            movie.setCertification(Certification.valueOf(scanner.next().toUpperCase()));

            isAdded = theather.addmovie(movie);
        }
        if (isAdded == true) {
            String input;
            do {
                System.out.println("press 1 to Get All Movie Info");
                System.out.println("press 2 to Get Movie Name by Id");
                System.out.println("press 3 to Get Movie Id by Name");
                System.out.println("press 4 to Get Certification by Id");
                System.out.println("press 5 to Get Certification by Name");
                System.out.println("press 6 to Get Hero by Id");
                System.out.println("press 7 to Get Hero by Name");
                System.out.println("press 8 to Get Duration by Id");
                System.out.println("press 9 to Get Duration by Name");
                System.out.println("press 10 to Update Movie Name by Id");
                System.out.println("press 11 to Update Hero by Id");
                System.out.println("press 12 to Update Duration by Id");
                System.out.println("press 13 to Update Certification by Id");
                System.out.println("press 14 to Get Movie Details by Id");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        theather.getmovieInfo();
                        break;
                    case 2:
                        System.out.println("Enter Movie Id to getMovieName");
                        System.out.println("Movie Name: " + theather.getMovieNameById(scanner.nextInt()));
                        break;
                    case 3:
                        System.out.println("Enter Movie Name to getMovieId");
                        System.out.println("Movie Id: " + theather.getMovieIdByName(scanner.next()));
                        break;
                    case 4:
                        System.out.println("Enter Movie Id to getCertification");
                        System.out.println("Certification: " + theather.getCertificationById(scanner.nextInt()));
                        break;
                    case 5:
                        System.out.println("Enter Movie Name to getCertification");
                        System.out.println("Certification: " + theather.getCertificationByName(scanner.next()));
                        break;
                    case 6:
                        System.out.println("Enter Movie Id to getHero");
                        System.out.println("Hero: " + theather.getHeroById(scanner.nextInt()));
                        break;
                    case 7:
                        System.out.println("Enter Movie Name to getHero");
                        System.out.println("Hero: " + theather.getHeroByName(scanner.next()));
                        break;
                    case 8:
                        System.out.println("Enter Movie Id to getDuration");
                        System.out.println("Duration: " + theather.getDurationById(scanner.nextInt()));
                        break;
                    case 9:
                        System.out.println("Enter Movie Name to getDuration");
                        System.out.println("Duration: " + theather.getDurationByName(scanner.next()));
                        break;
                    case 10:
                        System.out.println("Enter Movie Id to updateMovieName");
                        int id = scanner.nextInt();
                        System.out.println("Enter new Movie Name:");
                        String newName = scanner.next();
                        boolean nameUpdated = theather.updateMovieNameById(id, newName);
                        System.out.println("Movie Name Updated: " + nameUpdated);
                        break;
                    case 11:
                        System.out.println("Enter Movie Id to updateHero");
                        int id1 = scanner.nextInt();
                        System.out.println("Enter new Hero:");
                        String newHero = scanner.next();
                        boolean heroUpdated = theather.updateHeroById(id1, newHero);
                        System.out.println("Hero Updated: " + heroUpdated);
                        break;
                    case 12:
                        System.out.println("Enter Movie Id to updateDuration");
                        int id2 = scanner.nextInt();
                        System.out.println("Enter new Duration");
                        String newDuration = scanner.next();
                        boolean durationUpdated = theather.updateDurationById(id2, newDuration);
                        System.out.println("Duration Updated: " + durationUpdated);
                        break;
                    case 13:
                        System.out.println("Enter Movie Id to updateCertification");
                        int id3 = scanner.nextInt();
                        System.out.println("Enter new Certification (U, UA, A):");
                        Certification newCert = Certification.valueOf(scanner.next().toUpperCase());
                        boolean certUpdated = theather.updateCertificationById(id3, newCert);
                        System.out.println("Certification Updated: " + certUpdated);
                        break;
                    case 14:
                        System.out.println("Enter Movie Id to getMovieDetails");
                        int id4 = scanner.nextInt();
                        Movie movie = theather.getMovieDetailsById(id4);
                        theather.fetchmovieInfo(movie);
                        break;
                    default:
                        System.out.println("Please enter a valid option!");
                }

                System.out.println("Do you want to continue? (yes/no):");
                input = scanner.next();
            } while (input.equalsIgnoreCase("yes"));

            System.out.println("Thank you.. Visit again!");
        } else System.out.println("not added");
    }
}
