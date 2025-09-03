package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch =new Watch(1,"457","titan",1500.00,"5 years");
        Watch watch1 =new Watch(2,"45","rolex",45500.00,"5 years");
        Watch watch2 =new Watch(3,"57","casio",15000.00,"5 years");
        Watch watch3 =new Watch(4,"357","fastrack",15000.00,"5 years");
        Watch watch4 =new Watch(5,"557","timex",5700.00,"5 years");
        Watch watch5=new Watch(6,"48855","fossil",2500.00,"5 years");
        Watch watch6 =new Watch(7,"45457","tissot",5500.00,"5 years");
        Watch watch7 =new Watch(8,"444757","sonata",8500.00,"5 years");
        Watch watch8 =new Watch(9,"45777","seiko",4500.00,"5 years");



        WatchShop watchShop =new WatchShop();

        watchShop.addWatch(watch);
        watchShop.addWatch(watch1);
        watchShop.addWatch(watch2);
        watchShop.addWatch(watch3);
        watchShop.addWatch(watch4);
        watchShop.addWatch(watch5);
        watchShop.addWatch(watch6);
        watchShop.addWatch(watch7);
        watchShop.addWatch(watch8);

        watchShop.getWatchDetails();
    }
}
