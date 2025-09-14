package com.xworkz.amazonapp.product;

import com.xworkz.amazonapp.constants.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class
Product {
    private int productId;
    private String productName;
    private Type productType;
    private double productPrice;
    private String mfgDate;


}
