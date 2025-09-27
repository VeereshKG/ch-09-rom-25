package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.constants.Type;
import com.xworkz.amazonapp.product.Product;

public interface AmazonRules {

    boolean addProduct(Product product);

    void getAllProductInfo();

    Type getProductTypeByProductName(String productName);

    Type getProductTypeByProductId(int productId);

    double getProductPriceByProductName(String productName);

    double getProductPriceByProductId(int productId);

    String getMfgDateByProductName(String productName);

    String getMfgDateByProductId(int productId);

    String getProductNameByProductId(int productId);

    int getProductIdByProductName(String productName);

    boolean updateProductNameByProductId(int productId, String NewProductName);

    boolean updateProductTypeByProductId(int productId, Type newProductType);

    boolean updateProductPriceByProductId(int productId, double newProductPrice);

    boolean updateMfgDateByProductId(int productId, String newMfgDate);

    String getProductNameByMfgDate(String mfgDate);

    Product getProductByid(int id);

    void fetchProductDetailsById(Product product1);

    int size();
}
