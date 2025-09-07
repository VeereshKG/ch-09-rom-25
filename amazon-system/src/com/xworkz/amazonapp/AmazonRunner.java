package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {



//        Product product1=new Product(1,"Laptop","Electronics",45000.00,"01-01-2025");
//        Product product2=new Product(2,"Smartphone","Electronics",25000.00,"05-01-2025");
//        Product product3=new Product(3,"Washing Machine","Home Appliance",22000.00,"10-01-2025");
//        Product product4=new Product(4,"Microwave","Home Appliance",8000.00,"15-01-2025");
//        Product product5=new Product(5,"Air Conditioner","Home Appliance",35000.00,"20-01-2025");
//        Product product6=new Product(6,"Refrigerator","Home Appliance",30000.00,"25-01-2025");
//        Product product7=new Product(7,"Headphones","Electronics",2500.00,"30-01-2025");
//        Product product8=new Product(8,"Smartwatch","Electronics",5000.00,"05-02-2025");
//        Product product9=new Product(9,"Printer","Electronics",7000.00,"10-02-2025");
//        Product product10=new Product(10,"Desk Chair","Furniture",6000.00,"15-02-2025");
//        Product product11=new Product(11,"Sofa","Furniture",25000.00,"20-02-2025");
//        Product product12=new Product(12,"Table","Furniture",12000.00,"25-02-2025");
//        Product product13=new Product(13,"Camera","Electronics",15000.00,"01-03-2025");
//        Product product14=new Product(14,"Router","Electronics",3000.00,"05-03-2025");
//        Product product15=new Product(15,"Fridge","Home Appliance",30000.00,"25-04-2025");
//        Product product16=new Product(16,"Oven","Home Appliance",10000.00,"10-04-2025");
//        Product product17=new Product(17,"Vacuum Cleaner","Home Appliance",8000.00,"15-04-2025");
//        Product product18=new Product(18,"Blender","Home Appliance",3500.00,"20-04-2025");
//        Product product19=new Product(19,"Gaming Console","Electronics",35000.00,"22-04-2025");
//        Product product20=new Product(20,"Electric Kettle","Home Appliance",1500.00,"25-04-2025");



//        Amazon amazon= new Amazon();
//        amazon.addProduct(product1);
//        amazon.addProduct(product2);
//        amazon.addProduct(product3);
//        amazon.addProduct(product4);
//        amazon.addProduct(product5);
//        amazon.addProduct(product6);
//        amazon.addProduct(product7);
//        amazon.addProduct(product8);
//        amazon.addProduct(product9);
//        amazon.addProduct(product10);
//        amazon.addProduct(product11);
//        amazon.addProduct(product12);
//        amazon.addProduct(product13);
//        amazon.addProduct(product14);
//        amazon.addProduct(product15);
//        amazon.addProduct(product16);
//        amazon.addProduct(product17);
//        amazon.addProduct(product18);
//        amazon.addProduct(product19);
//        amazon.addProduct(product20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of products to be add");
         int size = scanner.nextInt();
         Amazon amazon = new Amazon(size);
         System.out.println("the available products are : "+amazon.products.length);

         for (int index=0; index<size ; index++){
             Product product = new Product();
             System.out.println("Enter product Id :");
             product.setProductId(scanner.nextInt());

             System.out.println("Enter product name  :");
             product.setProductName(scanner.next());

             System.out.println("Enter type of product");
             product.setProductType(scanner.next());

             System.out.println("Enter the mfgDate :");
             product.setMfgDate(scanner.next());

             System.out.println("Enter the product price : ");
             product.setProductPrice(scanner.nextDouble());

             amazon.addProduct(product);
         }

        amazon.getAllProductInfo();



    }
}
