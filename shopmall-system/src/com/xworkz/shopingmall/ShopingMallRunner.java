package com.xworkz.shopingmall;

import com.xworkz.shopingmall.constants.Type;
import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.shopingmall.ShopingMall;
import com.xworkz.shopingmall.shopingmall.ShopingMallImpl;

import java.util.Scanner;

public class ShopingMallRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of shops to add:");
        int size = scanner.nextInt();
        boolean isAdded = false;
        ShopingMall shopingMall = new ShopingMallImpl(size);
        System.out.println("Total shop slots available: " + shopingMall.size());

        for (int index = 0; index < size; index++) {
            Shop shop = new Shop();

            System.out.println("Enter Shop Id:");
            shop.setShopId(scanner.nextInt());

            System.out.println("Enter Shop Name:");
            shop.setName(scanner.next());

            System.out.println("Enter Shop Type (GROCERY, CLOTHING, ELECTRONICS, FOODCOURT, PHARMACY):");
            shop.setShopType(Type.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter Floor:");
            shop.setWhichFloor(scanner.nextInt());

            System.out.println("Enter Address:");
            shop.setAddress(scanner.next());

            isAdded = shopingMall.addShop(shop);
        }
        if (isAdded == true) {
            String input;
            do {
                System.out.println("press 1 to Get All Shop Details");
                System.out.println("press 2 to Get Name by Shop Id");
                System.out.println("press 3 to Get ShopType by Shop Id");
                System.out.println("press 4 to Get Floor by Shop Id");
                System.out.println("press 5 to Get Address by Shop Id");
                System.out.println("press 6 to Get Id by Shop Name");
                System.out.println("press 7 to Get ShopType by Shop Name");
                System.out.println("press 8 to Get Floor by Shop Name");
                System.out.println("press 9 to Get Address by Shop Name");
                System.out.println("press 10 to Update Name by Shop Id");
                System.out.println("press 11 to Update ShopType by Shop Id");
                System.out.println("press 12 to Update Floor by Shop Id");
                System.out.println("press 13 to Update Address by Shop Id");
                System.out.println("press 14 to Get Shop Details by Id");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        shopingMall.getShopDetails();
                        break;
                    case 2:
                        System.out.println("Enter Shop Id to getName");
                        System.out.println("Name: " + shopingMall.getNameByShopId(scanner.nextInt()));
                        break;
                    case 3:
                        System.out.println("Enter Shop Id to getShopType");
                        System.out.println("ShopType: " + shopingMall.getShopTypeByShopId(scanner.nextInt()));
                        break;
                    case 4:
                        System.out.println("Enter Shop Id to getFloor");
                        System.out.println("Floor: " + shopingMall.getFloorByShopId(scanner.nextInt()));
                        break;
                    case 5:
                        System.out.println("Enter Shop Id to getAddress");
                        System.out.println("Address: " + shopingMall.getAddressByShopId(scanner.nextInt()));
                        break;
                    case 6:
                        System.out.println("Enter Shop Name to getId");
                        System.out.println("Id: " + shopingMall.getIdByShopName(scanner.next()));
                        break;
                    case 7:
                        System.out.println("Enter Shop Name to getShopType");
                        System.out.println("ShopType: " + shopingMall.getShopTypeByShopName(scanner.next()));
                        break;
                    case 8:
                        System.out.println("Enter Shop Name to getFloor");
                        System.out.println("Floor: " + shopingMall.getFloorByShopName(scanner.next()));
                        break;
                    case 9:
                        System.out.println("Enter Shop Name to getAddress");
                        System.out.println("Address: " + shopingMall.getAddressByShopName(scanner.next()));
                        break;
                    case 10:
                        System.out.println("Enter Shop Id to updateName");
                        int shopId = scanner.nextInt();
                        System.out.println("Enter new Name:");
                        String newName = scanner.next();
                        boolean nameUpdated = shopingMall.updateNameByShopId(shopId, newName);
                        System.out.println("Name Updated: " + nameUpdated);
                        break;
                    case 11:
                        System.out.println("Enter Shop Id to updateShopType");
                        int shopId1 = scanner.nextInt();
                        System.out.println("Enter new ShopType (GROCERY, CLOTHING, ELECTRONICS, FOODCOURT, PHARMACY):");
                        Type newType = Type.valueOf(scanner.next().toUpperCase());
                        boolean typeUpdated = shopingMall.updateShopTypeByShopId(shopId1, newType);
                        System.out.println("ShopType Updated: " + typeUpdated);
                        break;
                    case 12:
                        System.out.println("Enter Shop Id to updateFloor");
                        int shopId2 = scanner.nextInt();
                        System.out.println("Enter new Floor:");
                        int newFloor = scanner.nextInt();
                        boolean floorUpdated = shopingMall.updateFloorByShopId(shopId2, newFloor);
                        System.out.println("Floor Updated: " + floorUpdated);
                        break;
                    case 13:
                        System.out.println("Enter Shop Id to updateAddress");
                        int shopId3 = scanner.nextInt();
                        System.out.println("Enter new Address:");
                        String newAddress = scanner.next();
                        boolean addressUpdated = shopingMall.updateAddressByShopId(shopId3, newAddress);
                        System.out.println("Address Updated: " + addressUpdated);
                        break;
                    case 14:
                        System.out.println("Enter Shop Id to getShopDetails");
                        int id = scanner.nextInt();
                        Shop shop = shopingMall.getShopDetailsById(id);
                        shopingMall.fetchShopDetails(shop);
                        break;
                    default:
                        System.out.println("Please enter a valid option!");
                }

                System.out.println("Do you want to continue? (yes/no): ");
                input = scanner.next();
            } while (input.equalsIgnoreCase("yes"));

            System.out.println("Thank you.. Visit again!");
        } else System.out.println("not adde");
    }
}
