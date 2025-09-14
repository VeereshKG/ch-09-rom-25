package com.xworkz.shopingmall.shopingmall;

import com.xworkz.shopingmall.constants.Type;
import com.xworkz.shopingmall.shop.Shop;
import com.xworkz.shopingmall.validator.ShopValidator;

public class ShopingMall {

    public ShopingMall(int size){
        shops = new Shop[size];
    }

   public  Shop[] shops ;
    int index;
ShopValidator validator = new ShopValidator();
    public boolean addShop(Shop shop) {
        boolean isShopAdded = false;

        if (shop != null) {
            if (validator.isDetailsValid(shop)) {
                shops[index++] = shop;
                isShopAdded = true;
            }
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

    public String getNameByShopId(int shopId){
        String name = null;
        if(shopId != 0){
            for(Shop shop : shops){
                if(shop.getShopId() == shopId){
                    name = shop.getName();
                }
            }
        } else System.out.println("enter valid ID");
        if(name == null) System.out.println("ID not found");
        return name;
    }
    public Type getShopTypeByShopId(int shopId){
        Type type = null;
        if(shopId != 0){
            for(Shop shop : shops){
                if(shop.getShopId() == shopId){
                    type = shop.getShopType();
                }
            }
        } else System.out.println("enter valid ID");
        if(type == null) System.out.println("ID not found");
        return type;
    }
    public int getFloorByShopId(int shopId){
        int floor = 0;
        if(shopId != 0){
            for(Shop shop : shops){
                if(shop.getShopId() == shopId){
                    floor = shop.getWhichFloor();
                }
            }
        } else System.out.println("enter valid ID");
        if(floor == 0) System.out.println("ID not found");
        return floor;
    }
    public String getAddressByShopId(int shopId){
        String address = null;
        if(shopId != 0){
            for(Shop shop : shops){
                if(shop.getShopId() == shopId){
                    address = shop.getAddress();
                }
            }
        } else System.out.println("enter valid ID");
        if(address == null) System.out.println("ID not found");
        return address;
    }
    public int getIdByShopName(String name){
        int id = 0;
        if(name != null){
            for(Shop shop : shops){
                if(shop.getName().equalsIgnoreCase(name)){
                    id = shop.getShopId();
                }
            }
        } else System.out.println("enter valid name");
        if(id == 0) System.out.println("Name not found");
        return id;
    }
    public Type getShopTypeByShopName(String name){
        Type type = null;
        if(name != null){
            for(Shop shop : shops){
                if(shop.getName().equalsIgnoreCase(name)){
                    type = shop.getShopType();
                }
            }
        } else System.out.println("enter valid name");
        if(type == null) System.out.println("Name not found");
        return type;
    }
    public int getFloorByShopName(String name){
        int floor = 0;
        if(name != null){
            for(Shop shop : shops){
                if(shop.getName().equalsIgnoreCase(name)){
                    floor = shop.getWhichFloor();
                }
            }
        } else System.out.println("enter valid name");
        if(floor == 0) System.out.println("Name not found");
        return floor;
    }
    public String getAddressByShopName(String name){
        String address = null;
        if(name != null){
            for(Shop shop : shops){
                if(shop.getName().equalsIgnoreCase(name)){
                    address = shop.getAddress();
                }
            }
        } else System.out.println("enter valid name");
        if(address == null) System.out.println("Name not found");
        return address;
    }

    public boolean updateNameByShopId(int shopId, String newName) {
        boolean isUpdated = false;
        if (shopId != 0) {
            for (Shop shop : shops) {
                if (shop.getShopId() == shopId) {
                    shop.setName(newName);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }
    public boolean updateShopTypeByShopId(int shopId, Type newType) {
        boolean isUpdated = false;
        if (shopId != 0) {
            for (Shop shop : shops) {
                if (shop.getShopId() == shopId) {
                    shop.setShopType(newType);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }
    public boolean updateFloorByShopId(int shopId, int newFloor) {
        boolean isUpdated = false;
        if (shopId != 0) {
            for (Shop shop : shops) {
                if (shop.getShopId() == shopId) {
                    shop.setWhichFloor(newFloor);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }
    public boolean updateAddressByShopId(int shopId, String newAddress) {
        boolean isUpdated = false;
        if (shopId != 0) {
            for (Shop shop : shops) {
                if (shop.getShopId() == shopId) {
                    shop.setAddress(newAddress);
                    isUpdated = true;
                }
            }
        } else {
            System.out.println("Enter valid ID");
        }
        return isUpdated;
    }


    public Shop getShopDetailsById(int id){

        Shop shop = null;
        if (id != 0){
            for (Shop shop1 : shops){
                if (shop1.getShopId() == id){
                    shop= shop1;
                }
            }
        }
        return shop;
    }
    public void fetchShopDetails(Shop shop){

            System.out.println("the id of the shop is   "+shop.getShopId());
            System.out.println("the name of the shop is "+shop.getName());
            System.out.println("the type of the shop is  "+shop.getShopType());
            System.out.println("the flor of the shop is   "+shop.getWhichFloor());
            System.out.println("the address off the shop is  "+shop.getAddress());
            System.out.println("--------------------------------------------------");
        }

}
