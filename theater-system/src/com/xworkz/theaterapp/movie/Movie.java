package com.xworkz.theaterapp.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Movie {
    private int movieId;
    private String movieName;
    private String hero;
    private String duration;
    private String certification;


}
