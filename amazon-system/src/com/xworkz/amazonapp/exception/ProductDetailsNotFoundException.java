package com.xworkz.amazonapp.exception;

public class ProductDetailsNotFoundException extends Exception {
    public ProductDetailsNotFoundException(String errormessage) {
        super(errormessage);
    }
}
