package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of books to be add :");
        int size = scanner.nextInt();

        Library library = new Library(size);
        System.out.println("the no of books available are :"+library.books.length);
        for (int index=0;index<size;index++){
            Book book = new Book();

            System.out.println("Enter book id :");
            book.setBookId(scanner.nextInt());

            System.out.println("Enter bookName :");
            book.setBookName(scanner.next());

            System.out.println("Enter book price");
            book.setBookPrice(scanner.nextDouble());

            System.out.println("enter publication name :");
            book.setPublication(scanner.next());

            System.out.println("Author name :");
            book.setAuthorName(scanner.next());

            System.out.println("no of pages");
            book.setNoOfPages(scanner.nextInt());

            library.addBook(book);
        }

        library.getAllBooksInfo();

    }
}
