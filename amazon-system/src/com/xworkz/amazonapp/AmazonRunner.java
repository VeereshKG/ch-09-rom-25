package com.xworkz.amazonapp;


import com.xworkz.amazonapp.amazon.AmazonImpl;
import com.xworkz.amazonapp.amazon.AmazonRules;
import com.xworkz.amazonapp.constants.Type;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of products to be added");
        int size = scanner.nextInt();
        AmazonRules amazon = new AmazonImpl(size);
        System.out.println("the available products are : " + amazon.size());
        boolean isadded = false;
        for (int index = 0; index < size; index++) {
            Product product = new Product();
            System.out.println("Enter product Id :");
            product.setProductId(scanner.nextInt());

            System.out.println("Enter product name  :");
            product.setProductName(scanner.next());

            System.out.println("Enter type of product from these : ELECTRONICS,CLOTHING,GROCERY,FURNITURE,TOYS");
            product.setProductType(Type.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter the mfgDate :");
            product.setMfgDate(scanner.next());

            System.out.println("Enter the product price : ");
            product.setProductPrice(scanner.nextDouble());

            isadded = amazon.addProduct(product);
        }
        if (isadded == true) {


            String input = null;
            do {
                System.out.println("press 1 to get product type by product name");
                System.out.println("press 2 to get product type by product id");
                System.out.println("press 3 to get product price by product name");
                System.out.println("press 4 to get product price by product id");
                System.out.println("press 5 to get mfg date by product name");
                System.out.println("press 6 to get mfg date by product id");
                System.out.println("press 7 to get product name by product id");
                System.out.println("press 8 to get product id by product name");
                System.out.println("press 9 to update product name by product id ");
                System.out.println("press 10 to update type by product id");
                System.out.println("press 11 to update product price by  product id  ");
                System.out.println("press 12 to update mfg date by  product id ");
                System.out.println("press 13 to get product name by  MFGDate ");
                System.out.println("press 14 to fetch Product details by product id");
                System.out.println("press 15 to get AllProductInfo");

                int option = scanner.nextInt();
                switch (option) {

                    case 1:
                        System.out.println("enter product name to get product type ");
                        Type type = amazon.getProductTypeByProductName(scanner.next());
                        System.out.println("the type of product is " + type);
                        break;

                    case 2:
                        System.out.println("enter product ID to get product type");
                        Type type1 = amazon.getProductTypeByProductId(scanner.nextInt());
                        System.out.println("the type of product is " + type1);
                        break;
                    case 3:
                        System.out.println("enter product Name to get product price");
                        System.out.println("the price of product is " + amazon.getProductPriceByProductName(scanner.next()));
                        break;
                    case 4:
                        System.out.println("enter product ID to get product price");
                        System.out.println("the price of product is " + amazon.getProductPriceByProductId(scanner.nextInt()));
                        break;
                    case 5:
                        System.out.println("enter product ID to get mfg date");
                        System.out.println("the mfg date of product is " + amazon.getMfgDateByProductId(scanner.nextInt()));
                        break;
                    case 6:
                        System.out.println("enter product Name to get mfg date");
                        System.out.println("the type of product is " + amazon.getMfgDateByProductName(scanner.next()));
                        break;
                    case 7:
                        System.out.println("enter product ID to get product name");
                        System.out.println("the type of product is " + amazon.getProductNameByProductId(scanner.nextInt()));
                        break;
                    case 8:
                        System.out.println("enter product Name to get product ID");
                        System.out.println("the  product  Id is " + amazon.getProductIdByProductName(scanner.next()));
                        break;
                    case 9:
                        System.out.println("enter product id to update product name");
                        int productId = scanner.nextInt();
                        System.out.println("enter new product Name");
                        String productName = scanner.next();
                        boolean isProductNameUpdated = amazon.updateProductNameByProductId(productId, productName);
                        System.out.println("the product name is updated :" + isProductNameUpdated);
                        break;

                    case 10:
                        System.out.println("enter product id to update type");
                        int productId1 = scanner.nextInt();
                        System.out.println("Enter new type of product from these : ELECTRONICS,CLOTHING,GROCERY,FURNITURE,TOYS");
                        Type productType = Type.valueOf(scanner.next().toUpperCase());
                        boolean isProductTypeUpdated = amazon.updateProductTypeByProductId(productId1, productType);
                        System.out.println("the product type is :" + isProductTypeUpdated);
                        break;
                    case 11:
                        System.out.println("enter product id to update product price");
                        int productId2 = scanner.nextInt();
                        System.out.println("enter new product price");
                        double productPrice = scanner.nextDouble();
                        boolean isProductPriceUpdated = amazon.updateProductPriceByProductId(productId2, productPrice);
                        System.out.println("the product price is updated :" + isProductPriceUpdated);
                        break;
                    case 12:
                        System.out.println("enter product id to update mfg date");
                        int productId3 = scanner.nextInt();
                        System.out.println("enter new product Mfg Date");
                        String mfgDate = scanner.next();
                        boolean isMfgDateUpdated = amazon.updateMfgDateByProductId(productId3, mfgDate);
                        System.out.println("the mfg date is :" + isMfgDateUpdated);
                        break;
                    case 13:
                        System.out.println("enter MFGDate to get product name");
                        String name = amazon.getProductNameByMfgDate(scanner.next());
                        System.out.println("the product name is:" + name);
                        break;
                    case 14:
                        System.out.println("Enter id to fetch Product details");
                        int id = scanner.nextInt();
                        Product product = amazon.getProductByid(id);
                        amazon.fetchProductDetailsById(product);
                        break;
                    case 15:
                        amazon.getAllProductInfo();
                        break;
                    default:
                        System.out.println("Enter option from above list");
                }
                System.out.println("Do you want to continue : yes/ no");
                input = scanner.next();

            } while (input.equalsIgnoreCase("yes"));
            System.out.println("thank you..visit again");
        } else System.out.println("Product not added");
    }

}

