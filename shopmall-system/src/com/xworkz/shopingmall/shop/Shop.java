package com.xworkz.shopingmall.shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    private int  shopId;
    private String name;
    private String shopType;
    private int whichFloor;
    private String address;


}
