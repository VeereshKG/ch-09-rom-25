package com.xworkz.shopingmall.shop;

import com.xworkz.shopingmall.constants.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
    private int  shopId;
    private String name;
    private Type shopType;
    private int whichFloor;
    private String address;


}
