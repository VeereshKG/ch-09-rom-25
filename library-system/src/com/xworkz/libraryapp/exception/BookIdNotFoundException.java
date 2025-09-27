package com.xworkz.libraryapp.exception;

public class BookIdNotFoundException extends Exception {
    public BookIdNotFoundException(String errormessage) {
        super(errormessage);
    }
}
