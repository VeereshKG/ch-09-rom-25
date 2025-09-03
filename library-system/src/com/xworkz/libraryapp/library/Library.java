package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;

public class Library {
    Book[] books = new Book[14];
    int index;

    public boolean addBook(Book book) {
        boolean isBookAdded = false;

        if (book != null) {
            books[index++] = book;
            isBookAdded = true;
        } else System.out.println("invalid book");
        return isBookAdded;
    }
    public void getAllBooksInfo(){
        System.out.println("the list of books are ");
        for (Book book : books) {


        System.out.println("the id of the book is "+book.getBookId());
        System.out.println("the name of the book is "+book.getBookName());
        System.out.println("the author name of the book is "+book.getAuthorName());
        System.out.println("the no of pages of the book is "+book.getNoOfPages());
        System.out.println("the publication of the book is "+book.getPublication());
        System.out.println("the price of the book is "+book.getBookPrice());
        System.out.println("------------------------------------------------");

    }
}}
