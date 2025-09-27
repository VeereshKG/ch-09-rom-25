package com.xworkz.libraryapp.exception;

public class BookPriceNotFoundException extends Exception {
    public BookPriceNotFoundException(String errormessage) {
        super(errormessage);
    }
}
