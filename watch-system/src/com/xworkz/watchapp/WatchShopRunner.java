package com.xworkz.watchapp;

import com.xworkz.watchapp.constants.Warranty;
import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;

import java.util.Scanner;

public class WatchShopRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of watch to be add");
        int size = scanner.nextInt();
        WatchShop watchShop= new WatchShop(size);
        System.out.println("watch Available are :"+watchShop.watches.length);

        for (int index=0; index<size ; index++){

            Watch watch = new Watch();

            System.out.println("Enter  id :");
            watch.setId(scanner.nextInt());

            System.out.println("Enter company name :");
            watch.setCompanyName(scanner.next());

            System.out.println("Enter model Name :");
            watch.setModelName(scanner.next());

            System.out.println("price :");
            watch.setPrice(scanner.nextDouble());

            System.out.println("Warranty from NO_WARRANTY,SIX_MONTHS,ONE_YEAR,TWO_YEARS :");
            watch.setWarranty(Warranty.valueOf(scanner.next().toUpperCase()));

            watchShop.addWatch(watch);
        }
        watchShop.getWatchDetails();



//            System.out.println("enter watch Id");
//            System.out.println("the Model Name is " + watchShop.getModelNameById(scanner.nextInt()));
//
//            System.out.println("enter watch Id");
//            System.out.println("the Company Name is " + watchShop.getCompanyNameById(scanner.nextInt()));
//
//            System.out.println("enter watch Id");
//            System.out.println("the Price is " + watchShop.getPriceById(scanner.nextInt()));
//
//            System.out.println("enter watch Id");
//            System.out.println("the Warranty is " + watchShop.getWarrantyById(scanner.nextInt()));
//
//            System.out.println("enter watch Model Name");
//            System.out.println("the Id is " + watchShop.getIdByModelName(scanner.next()));
//
//            System.out.println("enter watch Model Name");
//            System.out.println("the Company Name is " + watchShop.getCompanyNameByModelName(scanner.next()));
//
//            System.out.println("enter watch Model Name");
//            System.out.println("the Price is " + watchShop.getPriceByModelName(scanner.next()));
//
//            System.out.println("enter watch Model Name");
//            System.out.println("the Warranty is " + watchShop.getWarrantyByModelName(scanner.next()));
//
//            System.out.println("enter watch Id");
//            int id = scanner.nextInt();
//            System.out.println("enter new Model Name");
//            String newModelName = scanner.next();
//            watchShop.updateModelNameById(id, newModelName);
//                watchShop.getWatchDetails();
//
//            System.out.println("enter watch Id");
//            int id1 = scanner.nextInt();
//            System.out.println("enter new Company Name");
//            String newCompanyName = scanner.next();
//            watchShop.updateCompanyNameById(id1, newCompanyName);
//                watchShop.getWatchDetails();
//
//            System.out.println("enter watch Id");
//            int id2 = scanner.nextInt();
//            System.out.println("enter new Price");
//            double newPrice = scanner.nextDouble();
//            watchShop.updatePriceById(id2, newPrice);
//                watchShop.getWatchDetails();
//
//            System.out.println("enter watch Id");
//            int id3= scanner.nextInt();
//            System.out.println("enter new Warranty from NO_WARRANTY, SIX_MONTHS, ONE_YEAR, TWO_YEARS, THREE_YEARS");
//            Warranty newWarranty = Warranty.valueOf(scanner.next().toUpperCase());
//            watchShop.updateWarrantyById(id3, newWarranty);
//                watchShop.getWatchDetails();


        System.out.println("Enter id to get book details");
        int id4 = scanner.nextInt();
       Watch watch =  watchShop.getWatchDetailsById(id4);

       watchShop.fetchWatchDetails(watch);
    }
}
