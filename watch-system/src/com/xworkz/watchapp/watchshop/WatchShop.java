package com.xworkz.watchapp.watchshop;

import com.xworkz.watchapp.watch.Watch;

public class WatchShop {

    public WatchShop(int size){
         watches = new Watch[size];
    }

   public  Watch[] watches ;
    int index;

    public boolean addWatch(Watch watch) {
        boolean isWatchAdded = false;

        if (watch != null) {
            watches[index++] = watch;
            isWatchAdded = true;
        } else System.out.println("invalid watch");
        return isWatchAdded;
    }

    public void getWatchDetails() {
        System.out.println("the watch list are:");
        for (Watch watch : watches) {
            System.out.println("the id of the watch is  " + watch.getId());
            System.out.println("the model of the watch is  " + watch.getModelName());
            System.out.println("the cName of the watch is  " + watch.getCompanyName());
            System.out.println("the price of the watch is  " + watch.getPrice());
            System.out.println("the warrent of the watch is  " + watch.getWarrenty());
            System.out.println("-----------------------------------------------");

        }
    }
}