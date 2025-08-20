package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {

        Product product1 =new Product();
        product1.setProductId(1);
        product1.setProductName("fan");
        product1.setProductType("home appliance");
        product1.setProductPrice(2000);
        product1.setMfgDate("25-2-2008");

        Amazon amazon= new Amazon();
        boolean isAdded =amazon.isProductAdded(product1);

        if(isAdded){
            amazon.getProductInfo();
        }else{
            System.out.println("the Info of the product is not valid");
        }
    }
}
