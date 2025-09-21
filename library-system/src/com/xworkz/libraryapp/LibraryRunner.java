package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Publications;
import com.xworkz.libraryapp.library.Library;
import com.xworkz.libraryapp.library.LibraryImpl;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of books to be add :");
        int size = scanner.nextInt();

        Library library = new LibraryImpl(size);
        System.out.println("the no of books available are :"+library.size());
        for (int index=0;index<size;index++){
            Book book = new Book();

            System.out.println("Enter book id :");
            book.setBookId(scanner.nextInt());

            System.out.println("Enter bookName :");
            book.setBookName(scanner.next());

            System.out.println("Enter book price");
            book.setBookPrice(scanner.nextDouble());

            System.out.println("enter publication name  from : PENGUIN, OXFORD, HARPERCOLLINS, MACMILLAN, RANDOM_HOUSE");
            book.setPublication(Publications.valueOf(scanner.next().toUpperCase()));

            System.out.println("Author name :");
            book.setAuthorName(scanner.next());

            System.out.println("no of pages");
            book.setNoOfPages(scanner.nextInt());

            library.addBook(book);
        }

        library.getAllBooksInfo();



            System.out.println("enter Book ID");
            System.out.println("Book Name: " + library.getBookNameByBookId(scanner.nextInt()));

            System.out.println("enter Book Name");
            System.out.println("Book ID: " + library.getBookIdByBookName(scanner.next()));

            System.out.println("enter Book ID");
            System.out.println("Author Name: " + library.getAuthorNameByBookId(scanner.nextInt()));

            System.out.println("enter Book Name");
            System.out.println("Author Name: " + library.getAuthorNameByBookName(scanner.next()));

            System.out.println("enter Book ID");
            System.out.println("No. of Pages: " + library.getNoOfPagesByBookId(scanner.nextInt()));

            System.out.println("enter Book Name");
            System.out.println("No. of Pages: " + library.getNoOfPagesByBookName(scanner.next()));

            System.out.println("enter Book ID");
            System.out.println("Publication: " + library.getPublicationNameByBookId(scanner.nextInt()));

            System.out.println("enter Book Name");
            System.out.println("Publication: " + library.getPublicationByBookName(scanner.next()));

            System.out.println("enter Book ID");
            System.out.println("Book Price: " + library.getBookPriceByBookId(scanner.nextInt()));

            System.out.println("enter Book Name");
            System.out.println("Book Price: " + library.getBookPriceByBookName(scanner.next()));

            System.out.println("enter Book ID");
            int bookId = scanner.nextInt();
            System.out.println("enter new Book Name");
            String newBookName = scanner.next();
            library.updateBookNameByBookId(bookId, newBookName);

            System.out.println("enter Book ID");
            int bookId1 = scanner.nextInt();
            System.out.println("enter new Author Name");
            String newAuthorName = scanner.next();
            library.updateAuthorNameByBookId(bookId1, newAuthorName);

            System.out.println("enter Book ID");
            int bookId2 = scanner.nextInt();
            System.out.println("enter new No. of Pages");
            int newNoOfPages = scanner.nextInt();
            library.updateNoOfPagesByBookId(bookId2, newNoOfPages);

            System.out.println("enter Book ID");
            int bookId3 = scanner.nextInt();
            System.out.println("enter new Publication from PENGUIN, OXFORD, HARPERCOLLINS, MACMILLAN, RANDOM_HOUSE");
            Publications publication = Publications.valueOf(scanner.next().toUpperCase());
            library.updatePublicationByBookId(bookId3, publication);

            System.out.println("enter Book ID");
            int bookId4 = scanner.nextInt();
            System.out.println("enter new Book Price");
            double newBookPrice = scanner.nextDouble();
            library.updateBookPriceByBookId(bookId4, newBookPrice);

        System.out.println("Enter id to get book details");
        int id = scanner.nextInt();
       Book book = library.getBookDetailsById(id);
       library.getBookDetails(book);


    }
}
