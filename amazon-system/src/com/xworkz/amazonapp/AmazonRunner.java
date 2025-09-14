package com.xworkz.amazonapp;


import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.constants.Type;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of products to be added");
         int size = scanner.nextInt();
         Amazon amazon = new Amazon(size);
         System.out.println("the available products are : "+amazon.products.length);

         for (int index=0; index<size ; index++){
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

             amazon.addProduct(product);
         }

        amazon.getAllProductInfo();


//            System.out.println("enter product name to get product type ");
//       Type type = amazon.getProductTypeByProductName(scanner.next());
//            System.out.println("the type of product is "+ type);
//
//
//            System.out.println("enter product ID to get product type");
//            System.out.println("the type of product is "+amazon.getProductTypeByProductId(scanner.nextInt()));
//
//
//            System.out.println("enter product Name to get product price");
//            System.out.println("the price of product is "+amazon.getProductPriceByProductName(scanner.next()));
//
//
//            System.out.println("enter product ID to get product price");
//            System.out.println("the price of product is "+amazon.getProductPriceByProductId(scanner.nextInt()));
//
//
//            System.out.println("enter product ID to get mfg date");
//            System.out.println("the mfg date of product is "+amazon.getMfgDateByProductId(scanner.nextInt()));
//
//
//            System.out.println("enter product Name to get mfg date");
//            System.out.println("the type of product is "+amazon.getMfgDateByProductName(scanner.next()));
//
//
//            System.out.println("enter product ID to get product name");
//            System.out.println("the type of product is "+amazon.getProductNameByProductId(scanner.nextInt()));
//
//
//            System.out.println("enter product Name to get product ID");
//            System.out.println("the  product  Id is "+amazon.getProductIdByProductName(scanner.next()));
//
//
//            System.out.println("enter product id to update product name");
//            int productId= scanner.nextInt();
//            System.out.println("enter new product Name");
//            String productName = scanner.next();
//            amazon.updateProductNameByProductId(productId,productName);
//                amazon.getAllProductInfo();
//
//
//
//            System.out.println("enter product id to update type");
//            int productId1 = scanner.nextInt();
//            System.out.println("Enter new type of product from these : ELECTRONICS,CLOTHING,GROCERY,FURNITURE,TOYS");
//            Type productType = Type.valueOf(scanner.next().toUpperCase());
//            amazon.updateProductTypeByProductId(productId1,productType);
//            amazon.getAllProductInfo();
//
//
//            System.out.println("enter product id to update product price");
//            int productId2 = scanner.nextInt();
//            System.out.println("enter new product price");
//            double productPrice = scanner.nextDouble();
//            amazon.updateProductPriceByProductId(productId2,productPrice);
//            amazon.getAllProductInfo();
//
//            System.out.println("enter product id to update nfg date");
//            int productId3= scanner.nextInt();
//            System.out.println("enter new product Mfg Date");
//            String mfgDate = scanner.next();
//            amazon.updateMfgDateByProductId(productId3,mfgDate);
//            amazon.getAllProductInfo();
//
//            System.out.println("enter MFGDate to get product name");
//            String name = amazon.getProductNameByMfgDate(scanner.next());
//                System.out.println(name);

        System.out.println("Enter id to fetch Product details");
        int id  = scanner.nextInt();
        Product product = amazon.getProductByid(id);

        amazon.fetchProductDetailsById(product);
        }



    }

