package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;

public class Amazon {

    public Amazon(int size){
        products = new Product[size];
    }

    public Product[] products ;
    int index;

    public boolean addProduct(Product product) {
        boolean isProductAdded = false;

        if (product != null) {
            products[index++] = product;
            isProductAdded = true;
        } else System.out.println("invalid product");
        return isProductAdded;
    }


    public void getAllProductInfo() {
        System.out.println("the list of product are : ");
        for (Product product : products) {

            System.out.println("the id of the product is  " + product.getProductId());
            System.out.println("the name of the product is  " + product.getProductName());
            System.out.println("the type of the product is  " + product.getProductType());
            System.out.println("the price of the product is  " + product.getProductPrice());
            System.out.println("the mfg date of the product is  " + product.getMfgDate());
            System.out.println("------------------------------------------");

        }

    }
}
