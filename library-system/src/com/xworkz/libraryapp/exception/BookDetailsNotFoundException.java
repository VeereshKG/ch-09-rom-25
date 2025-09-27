package com.xworkz.libraryapp.exception;

public class BookDetailsNotFoundException extends Exception {
    public BookDetailsNotFoundException(String errormessage) {
        super(errormessage);
    }
}
