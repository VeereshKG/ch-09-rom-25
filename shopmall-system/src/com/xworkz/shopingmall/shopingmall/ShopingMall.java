package com.xworkz.shopingmall.shopingmall;

import com.xworkz.shopingmall.shop.Shop;

public class ShopingMall {

    public ShopingMall(int size){
        shops = new Shop[size];
    }

   public  Shop[] shops ;
    int index;

    public boolean addShop(Shop shop) {
        boolean isShopAdded = false;

        if (shop != null) {
            shops[index++] = shop;
            isShopAdded = true;
        } else System.out.println("invalid shop");
        return isShopAdded;
    }
    public void getShopDetails(){
        System.out.println("the shop list are :");
        for(Shop shop : shops){
        System.out.println("the id of the shop is   "+shop.getShopId());
        System.out.println("the name of the shop is "+shop.getName());
        System.out.println("the type of the shop is  "+shop.getShopType());
        System.out.println("the flor of the shop is   "+shop.getWhichFloor());
        System.out.println("the address off the shop is  "+shop.getAddress());
        System.out.println("--------------------------------------------------");
    }}
}
