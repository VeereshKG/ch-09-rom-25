package com.xworkz.amazonapp.exception;

public class ProductPriceNotFoundException extends Exception {
    public ProductPriceNotFoundException(String errormessage) {
        super(errormessage);
    }
}
