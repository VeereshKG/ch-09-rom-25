package com.xworkz.watchapp.watch;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Watch {
    private int id;
    private String modelName;
    private  String companyName;
    private double price;
    private String warrenty;

}
