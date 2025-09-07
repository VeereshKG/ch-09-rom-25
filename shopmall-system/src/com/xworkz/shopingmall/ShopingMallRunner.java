package com.xworkz.shopingmall;

import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.shopingmall.ShopingMall;

import java.util.Scanner;

public class ShopingMallRunner {
    public static void main(String[] args) {

//        Shop shop1 =new Shop(1,"m k stores","provision",3,"laggere");
//
//        Shop shop2=new Shop(2,"Sri Durga","Grocery",1,"Jayanagar");
//        Shop shop3=new Shop(3,"Quick Mart","Electronics",2,"Koramangala");
//        Shop shop4=new Shop(4,"Daily Needs","Provision",1,"Malleswaram");
//        Shop shop5=new Shop(5,"Happy Home","Grocery",2,"Indiranagar");
//        Shop shop6=new Shop(6,"Fresh & Easy","Supermarket",1,"Rajajinagar");
//        Shop shop7=new Shop(7,"Tech World","Electronics",3,"Whitefield");
//        Shop shop8=new Shop(8,"Green Basket","Grocery",2,"BTM Layout");
//        Shop shop9=new Shop(9,"Urban Mart","Provision",4,"Hebbal");
//        Shop shop10=new Shop(10,"ShopEasy","Supermarket",3,"Yeshwanthpur");
//        Shop shop11=new Shop(11,"Daily Mart","Grocery",1,"Shivajinagar");
//        Shop shop12=new Shop(12,"Electro Hub","Electronics",2,"Bannerghatta");
//        Shop shop13=new Shop(13,"Fresh Choice","Provision",1,"Malleshwaram");
//
//        ShopingMall shopingMall=new ShopingMall();
//
//        shopingMall.addShop(shop1);
//        shopingMall.addShop(shop2);
//    shopingMall.addShop(shop3);
//                shopingMall.addShop(shop4);
//                shopingMall.addShop(shop5);
//                shopingMall.addShop(shop6);
//                shopingMall.addShop(shop7);
//                shopingMall.addShop(shop8);
//                shopingMall.addShop(shop9);
//                shopingMall.addShop(shop10);
//                shopingMall.addShop(shop11);
//                shopingMall.addShop(shop12);
//                shopingMall.addShop(shop13);

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

            System.out.println("Enter shopType :");
            shop.setShopType(scanner.next());

            System.out.println("Enter floor :");
            shop.setWhichFloor(scanner.nextInt());

            System.out.println("Enter address :");
            shop.setAddress(scanner.next());

            shopingMall.addShop(shop);
        }
        shopingMall.getShopDetails();
    }
}
