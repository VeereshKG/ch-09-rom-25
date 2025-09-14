package com.xworkz.watchapp.watch;

import com.xworkz.watchapp.constants.Warranty;
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
    private Warranty warranty;

    public Warranty getWarrenty() {
        return warranty;
    }
}
