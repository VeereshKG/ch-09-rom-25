package com.xworkz.libraryapp.impl;

import com.xworkz.libraryapp.book.library;

public class BookImpl implements library {
    @Override
    public void addBook() {
        System.out.println("Add book");
    }

    @Override
    public void removeBook() {
        System.out.println("Remove book");
    }

    @Override
    public void updateBook() {
        System.out.println("update book");
    }
}
