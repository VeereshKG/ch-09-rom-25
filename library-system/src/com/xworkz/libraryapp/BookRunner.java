package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.library;
import com.xworkz.libraryapp.impl.BookImpl;

public class BookRunner {

    public static void main(String[] args) {

        library book = new BookImpl();

        book.addBook();
        book.removeBook();
        book.updateBook();
    }
}
