package com.xworkz.shopingmall.shopingmall;

import com.xworkz.shopingmall.constants.Type;
import com.xworkz.shopingmall.shop.Shop;

public interface ShopingMall {
    int size();
    boolean addShop(Shop shop);
    void getShopDetails();
    String getNameByShopId(int shopId);
    Type getShopTypeByShopId(int shopId);
    int getFloorByShopId(int shopId);
    String getAddressByShopId(int shopId);
    int getIdByShopName(String name);
    Type getShopTypeByShopName(String name);
    int getFloorByShopName(String name);
    String getAddressByShopName(String name);
    boolean updateNameByShopId(int shopId, String newName);
    boolean updateShopTypeByShopId(int shopId, Type newType);
    boolean updateFloorByShopId(int shopId, int newFloor);
    boolean updateAddressByShopId(int shopId, String newAddress);
    Shop getShopDetailsById(int id);
    void fetchShopDetails(Shop shop);
}
