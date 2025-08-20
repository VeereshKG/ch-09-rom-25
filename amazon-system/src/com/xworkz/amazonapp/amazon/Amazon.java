package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.productvalidator.ProductValidator;

public class Amazon {
    Product productInfo;
    public boolean isProductAdded(Product productInfo){

        ProductValidator productValidator =new ProductValidator();
        boolean isInfoValid=productValidator.isProductInfoValid(productInfo);

        if(isInfoValid){
            this.productInfo=productInfo;
        }else{
            System.out.println("the details of the product is not valid");
        }
        return  isInfoValid;
    }
    public void getProductInfo(){
        System.out.println("the id of the product is  "+productInfo.getProductId());
        System.out.println("the name of the product is  "+productInfo.getProductName());
        System.out.println("the type of the product is  "+productInfo.getProductType());
        System.out.println("the price of the product is  "+productInfo.getProductPrice());
        System.out.println("the mfg date of the product is  "+productInfo.getMfgDate());

    }
}
