package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.constants.Type;
import com.xworkz.amazonapp.exception.*;
import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.validator.ProductValidator;

public class AmazonImpl implements AmazonRules {

    public AmazonImpl(int size) {
        products = new Product[size];
    }

    ProductValidator productValidator = new ProductValidator();
    public Product[] products;
    int index;

    @Override
    public boolean addProduct(Product product) {
        boolean isProductAdded = false;
        try {
            if (productValidator.isProductInfoValid(product)) {
                products[index++] = product;
                isProductAdded = true;
            } else {
                ProductNotAddedException productNotAddedException = new ProductNotAddedException("product not added");
                throw productNotAddedException;
            }

        } catch (ProductNotAddedException e) {
            e.printStackTrace();
        }
        return isProductAdded;
    }

    @Override
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

    @Override
    public Type getProductTypeByProductName(String productName) {
        Type type = null;
        try {
            if (productName != null && !productName.equals("null")) {
                for (Product product : products) {
                    if (product.getProductName().equals(productName)) {
                        type = product.getProductType();
                    }
                }
            } else {
                System.out.println("product name not valid");
            }
            if (type == null) {
                ProductTypeNotFoundException productTypeNotFoundException = new ProductTypeNotFoundException("product type not found");
                throw productTypeNotFoundException;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return type;
    }

    @Override
    public Type getProductTypeByProductId(int productId) {
        Type type = null;
        try {
            if (productId != 0) {
                for (Product product : products) {
                    if (product.getProductId() == productId) {
                        type = product.getProductType();
                    }
                }
            } else {
                System.out.println("Enter valid id");

            }
            if (type == null) {
                ProductTypeNotFoundException productTypeNotFoundException = new ProductTypeNotFoundException("product type not found");
                throw productTypeNotFoundException;
            }
        } catch (ProductTypeNotFoundException e) {
            e.printStackTrace();
        }

        return type;
    }

    @Override
    public double getProductPriceByProductName(String productName) {
        double price = 0.0;
        try {
            if (productName != null) {
                for (Product product : products) {
                    if (product.getProductName().equals(productName)) {
                        price = product.getProductPrice();
                    }
                }
            } else System.out.println("enter valid product name");
            if (price == 0.0) {
                ProductPriceNotFoundException productPriceNotFoundException = new ProductPriceNotFoundException("product price not found");
                throw productPriceNotFoundException;
            }
        } catch (ProductPriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public double getProductPriceByProductId(int productId) {
        double price = 0.0;
        try {
            if (productId != 0) {
                for (Product product : products) {
                    if (product.getProductId() == productId) {
                        price = product.getProductPrice();
                    }
                }
            } else System.out.println("enter valid id");
            if (price == 0.0) {
                ProductPriceNotFoundException productPriceNotFoundException = new ProductPriceNotFoundException("product price not found");
                throw productPriceNotFoundException;
            }
        } catch (ProductPriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public String getMfgDateByProductName(String productName) {
        String date = null;
        try {
            if (productName != null) {
                for (Product product : products) {
                    if (product.getProductName().equals(productName)) {
                        date = product.getMfgDate();
                    }
                }
            } else if (date == null) {
                MfgDateNotFoundException mfgDateNotFoundException = new MfgDateNotFoundException("mfg date not found");
                throw mfgDateNotFoundException;
            }
        } catch (MfgDateNotFoundException e) {
            e.printStackTrace();
        }
        return date;
    }

    @Override
    public String getMfgDateByProductId(int productId) {
        String date = null;
        try {
            if (productId != 0) {
                for (Product product : products) {
                    if (product.getProductId() == productId) {
                        date = product.getMfgDate();
                    }
                }
            }
            if (date == null) {
                MfgDateNotFoundException mfgDateNotFoundException = new MfgDateNotFoundException("mfg date not found");
                throw mfgDateNotFoundException;
            }
        } catch (MfgDateNotFoundException e) {
            e.printStackTrace();
        }
        return date;
    }

    @Override
    public String getProductNameByProductId(int productId) {
        String name = null;
        try {
            if (productId != 0) {
                for (Product product : products) {
                    if (product.getProductId() == productId) {
                        name = product.getProductName();
                    }
                }
            }
            if (name == null) {
                ProductNameNotFoundException productNameNotFoundException = new ProductNameNotFoundException("product name not found");
                throw productNameNotFoundException;
            }
        } catch (ProductNameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public int getProductIdByProductName(String productName) {
        int id = 0;
        try {
            if (productName != null) {
                for (Product product : products) {
                    if (product.getProductName().equals(productName)) {
                        id = product.getProductId();
                    }
                }
            }
            if (id == 0) {
                ProduCtIdNotFoundException produCtIdNotFoundException = new ProduCtIdNotFoundException("Product id not found");
                throw produCtIdNotFoundException;
            }
        } catch (ProduCtIdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public boolean updateProductNameByProductId(int productId, String NewProductName) {
        boolean isUpdated = false;
        try {
            if (productId != 0) {
                for (Product product : products) {
                    if (product.getProductId() == productId) {
                        product.setProductName(NewProductName);
                        isUpdated = true;
                    }
                }
            }
            if (isUpdated == false) {
                UpdateProductNameNotDoneException updateProductNameNotDoneException = new UpdateProductNameNotDoneException("product name not updated");
                throw updateProductNameNotDoneException;
            }
        } catch (UpdateProductNameNotDoneException e) {
            e.printStackTrace();
        }

        return isUpdated;
    }

    @Override
    public boolean updateProductTypeByProductId(int productId, Type newProductType) {
        boolean isUpdated = false;
        try {
            if (productId != 0) {
                for (Product product : products) {
                    if (product.getProductId() == productId) {
                        product.setProductType(newProductType);
                        isUpdated = true;
                    }
                }
            } else {
                UpdateProductTypeNotDoneException updateProductTypeNotDoneException = new UpdateProductTypeNotDoneException("product type not updated");
                throw updateProductTypeNotDoneException;
            }
        } catch (UpdateProductTypeNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateProductPriceByProductId(int productId, double newProductPrice) {
        boolean isUpdated = false;
        try {
            if (productId != 0) {
                for (Product product : products) {
                    if (product.getProductId() == productId) {
                        product.setProductPrice(newProductPrice);
                        isUpdated = true;
                    }
                }
            } else {
                UpdateProductPriceNotDoneException updateProductPriceNotDoneException = new UpdateProductPriceNotDoneException("product price not update");
                throw updateProductPriceNotDoneException;
            }
        } catch (UpdateProductPriceNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateMfgDateByProductId(int productId, String newMfgDate) {
        boolean isUpdated = false;
        try {
            if (productId != 0) {
                for (Product product : products) {
                    if (product.getProductId() == productId) {
                        product.setMfgDate(newMfgDate);
                        isUpdated = true;
                    }
                }
            } else {
                UpdateMfgDateNotDoneExcetion updateMfgDateNotDoneExcetion = new UpdateMfgDateNotDoneExcetion("mfg date not updated");
                throw updateMfgDateNotDoneExcetion;
            }
        } catch (UpdateMfgDateNotDoneExcetion e) {
            e.printStackTrace();
        }
        return isUpdated;
    }


    @Override
    public String getProductNameByMfgDate(String mfgDate) {

        String names = null;
        try {
            if (mfgDate != null) {
                for (Product product : products) {
                    if (product.getMfgDate().equals(mfgDate)) {
                        names = product.getProductName();
                    }
                }
            } else {
                ProductNameNotFoundException productNameNotFoundException = new ProductNameNotFoundException("product name not found");
                throw productNameNotFoundException;
            }
        } catch (ProductNameNotFoundException e) {
            e.printStackTrace();
        }
        return names;
    }

    @Override
    public Product getProductByid(int id) {

        Product product1 = null;
        try {
            if (id != 0) {
                for (Product product : products) {
                    if (product.getProductId() == id) {
                        product1 = product;
                    }
                }
            } else {
                ProductDetailsNotFoundException productDetailsNotFoundException = new ProductDetailsNotFoundException("product details not found");
                throw productDetailsNotFoundException;

            }
        } catch (ProductDetailsNotFoundException e) {
            e.printStackTrace();
        }
        return product1;
    }

    @Override
    public void fetchProductDetailsById(Product product1) {
        try {
            System.out.println("the id of the product is  " + product1.getProductId());
            System.out.println("the name of the product is  " + product1.getProductName());
            System.out.println("the type of the product is  " + product1.getProductType());
            System.out.println("the price of the product is  " + product1.getProductPrice());
            System.out.println("the mfg date of the product is  " + product1.getMfgDate());
            System.out.println("------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return products.length;
    }
}


