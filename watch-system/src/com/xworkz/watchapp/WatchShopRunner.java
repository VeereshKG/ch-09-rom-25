package com.xworkz.watchapp;

import com.xworkz.watchapp.constants.Warranty;
import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchshop.WatchShop;
import com.xworkz.watchapp.watchshop.WatchShopImpl;

import java.util.Scanner;

public class WatchShopRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of watches to add:");
        int size = scanner.nextInt();

        WatchShop watchShop = new WatchShopImpl(size);
        System.out.println("Watch slots available: " + watchShop.size());
        boolean isAdded = false;
        for (int index = 0; index < size; index++) {
            Watch watch = new Watch();

            System.out.println("Enter Watch Id:");
            watch.setId(scanner.nextInt());

            System.out.println("Enter Company Name:");
            watch.setCompanyName(scanner.next());

            System.out.println("Enter Model Name:");
            watch.setModelName(scanner.next());

            System.out.println("Enter Price:");
            watch.setPrice(scanner.nextDouble());

            System.out.println("Enter Warranty (NO_WARRANTY, SIX_MONTHS, ONE_YEAR, TWO_YEARS):");
            watch.setWarranty(Warranty.valueOf(scanner.next().toUpperCase()));

            isAdded = watchShop.addWatch(watch);
        }
        if (isAdded == true) {
            String input;
            do {
                System.out.println("press 1 to Get All Watch Details");
                System.out.println("press 2 to Get Model Name by Id");
                System.out.println("press 3 to Get Company Name by Id");
                System.out.println("press 4 to Get Price by Id");
                System.out.println("press 5 to Get Warranty by Id");
                System.out.println("press 6 to Get Id by Model Name");
                System.out.println("press 7 to Get Company Name by Model Name");
                System.out.println("press 8 to Get Price by Model Name");
                System.out.println("press 9 to Get Warranty by Model Name");
                System.out.println("press 10 to Update Model Name by Id");
                System.out.println("press 11 to Update Company Name by Id");
                System.out.println("press 12 to Update Price by Id");
                System.out.println("press 13 to Update Warranty by Id");
                System.out.println("press 14 to Get Watch Details by Id");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        watchShop.getWatchDetails();
                        break;
                    case 2:
                        System.out.println("Enter Watch Id to getModelName");
                        System.out.println("Model Name: " + watchShop.getModelNameById(scanner.nextInt()));
                        break;
                    case 3:
                        System.out.println("Enter Watch Id to getCompanyName");
                        System.out.println("Company Name: " + watchShop.getCompanyNameById(scanner.nextInt()));
                        break;
                    case 4:
                        System.out.println("Enter Watch Id to getPrice");
                        System.out.println("Price: " + watchShop.getPriceById(scanner.nextInt()));
                        break;
                    case 5:
                        System.out.println("Enter Watch Id to getWarranty");
                        System.out.println("Warranty: " + watchShop.getWarrantyById(scanner.nextInt()));
                        break;
                    case 6:
                        System.out.println("Enter Model Name to getId");
                        System.out.println("Id: " + watchShop.getIdByModelName(scanner.next()));
                        break;
                    case 7:
                        System.out.println("Enter Model Name to getCompanyName");
                        System.out.println("Company Name: " + watchShop.getCompanyNameByModelName(scanner.next()));
                        break;
                    case 8:
                        System.out.println("Enter Model Name to getPrice");
                        System.out.println("Price: " + watchShop.getPriceByModelName(scanner.next()));
                        break;
                    case 9:
                        System.out.println("Enter Model Name to getWarranty");
                        System.out.println("Warranty: " + watchShop.getWarrantyByModelName(scanner.next()));
                        break;
                    case 10:
                        System.out.println("Enter Watch Id updateModelName");
                        int id = scanner.nextInt();
                        System.out.println("Enter new Model Name:");
                        String newModelName = scanner.next();
                        boolean isModelUpdated = watchShop.updateModelNameById(id, newModelName);
                        System.out.println("Model name updated :" + isModelUpdated);
                        break;
                    case 11:
                        System.out.println("Enter Watch Id to updateCompanyName");
                        int id1 = scanner.nextInt();
                        System.out.println("Enter new Company Name:");
                        String newCompanyName = scanner.next();
                        boolean isUpdated = watchShop.updateCompanyNameById(id1, newCompanyName);
                        System.out.println("Company name updated :" + isUpdated);
                        break;
                    case 12:
                        System.out.println("Enter Watch Id to updatePrice");
                        int id2 = scanner.nextInt();
                        System.out.println("Enter new Price:");
                        double newPrice = scanner.nextDouble();
                        boolean isPriceUpdated = watchShop.updatePriceById(id2, newPrice);
                        System.out.println("price updated :" + isPriceUpdated);
                        break;
                    case 13:
                        System.out.println("Enter Watch Id to updateWarranty");
                        int id3 = scanner.nextInt();
                        System.out.println("Enter new Warranty (NO_WARRANTY, SIX_MONTHS, ONE_YEAR, TWO_YEARS):");
                        Warranty newWarranty = Warranty.valueOf(scanner.next().toUpperCase());
                        boolean isUpdated1 = watchShop.updateWarrantyById(id3, newWarranty);
                        System.out.println("Warranty updated :" + isUpdated1);
                        break;
                    case 14:
                        System.out.println("Enter Watch Id to getWatchDetails");
                        int id4 = scanner.nextInt();
                        Watch watch = watchShop.getWatchDetailsById(id4);
                        watchShop.fetchWatchDetails(watch);
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
