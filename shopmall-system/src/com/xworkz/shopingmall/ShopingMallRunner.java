package com.xworkz.shopingmall;

import com.xworkz.shopingmall.constants.Type;
import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.shopingmall.ShopingMall;


import java.util.Scanner;

public class ShopingMallRunner {
    public static void main(String[] args) {



        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter no of shop to be add :");
        int size = scanner.nextInt();
        
        ShopingMall shopingMall = new ShopingMall(size);
        System.out.println("no of shop available are :"+shopingMall.shops.length);

        for (int index=0; index<size ; index++){

            Shop shop = new Shop();

            System.out.println("Enter shop Id :");
            shop.setShopId(scanner.nextInt());

            System.out.println("ShopName :");
            shop.setName(scanner.next());

            System.out.println("Enter shopType  from these :     GROCERY,CLOTHING,LECTRONICS,OODCOURT,HARMACY");
            shop.setShopType(Type.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter floor :");
            shop.setWhichFloor(scanner.nextInt());

            System.out.println("Enter address :");
            shop.setAddress(scanner.next());

            shopingMall.addShop(shop);
        }
        shopingMall.getShopDetails();


            System.out.println("enter shop Id");
            System.out.println("the Name is " + shopingMall.getNameByShopId(scanner.nextInt()));

            System.out.println("enter shop Id");
            System.out.println("the ShopType is " + shopingMall.getShopTypeByShopId(scanner.nextInt()));

            System.out.println("enter shop Id");
            System.out.println("the Floor is " + shopingMall.getFloorByShopId(scanner.nextInt()));

            System.out.println("enter shop Id");
            System.out.println("the Address is " + shopingMall.getAddressByShopId(scanner.nextInt()));

            System.out.println("enter shop Name");
            System.out.println("the Id is " + shopingMall.getIdByShopName(scanner.next()));

            System.out.println("enter shop Name");
            System.out.println("the ShopType is " + shopingMall.getShopTypeByShopName(scanner.next()));

            System.out.println("enter shop Name");
            System.out.println("the Floor is " + shopingMall.getFloorByShopName(scanner.next()));

            System.out.println("enter shop Name");
            System.out.println("the Address is " + shopingMall.getAddressByShopName(scanner.next()));

            System.out.println("enter shop Id");
            int shopId = scanner.nextInt();
            System.out.println("enter new Name");
            String newName = scanner.next();
            shopingMall.updateNameByShopId(shopId, newName);
                shopingMall.getShopDetails();

            System.out.println("enter shop Id");
            int shopId1 = scanner.nextInt();
            System.out.println("enter new ShopType from     GROCERY,CLOTHING,ELECTRONICS,FOODCOURT,PHARMACY");
            Type newType = Type.valueOf(scanner.next().toUpperCase());
            shopingMall.updateShopTypeByShopId(shopId1, newType);
                shopingMall.getShopDetails();

            System.out.println("enter shop Id");
            int shopId2 = scanner.nextInt();
            System.out.println("enter new Floor");
            int newFloor = scanner.nextInt();
            shopingMall.updateFloorByShopId(shopId2, newFloor);
                shopingMall.getShopDetails();

            System.out.println("enter shop Id");
            int shopId3 = scanner.nextInt();
            System.out.println("enter new Address");
            String newAddress = scanner.next();
            shopingMall.updateAddressByShopId(shopId3, newAddress);
                shopingMall.getShopDetails();


        System.out.println("Enter id to get book details");
        int id = scanner.nextInt();
       Shop shop =  shopingMall.getShopDetailsById(id);
       shopingMall.fetchShopDetails(shop);

    }
}
