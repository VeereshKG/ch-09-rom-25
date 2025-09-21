package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Publications;

public interface Library {

    int size();

    boolean addBook(Book book);

    void getAllBooksInfo();

    double getBookPriceByBookId(int bookId);

    Publications getPublicationByBookName(String bookName);
    Publications getPublicationNameByBookId(int BookId);

    double getBookPriceByBookName(String bookName);
    String getAuthorNameByBookId(int bookId);
    String getAuthorNameByBookName(String bookName);
    int getNoOfPagesByBookId(int bookId);
   int getNoOfPagesByBookName(String bookName);
    String getBookNameByBookId(int bookId);
    int getBookIdByBookName(String bookName);
    boolean updateBookNameByBookId(int bookId, String newBookName);

    boolean updateAuthorNameByBookId(int bookId, String newAuthorName);
    boolean updateNoOfPagesByBookId(int bookId, int newNoOfPages);
    boolean updatePublicationByBookId(int bookId, Publications newPublication);
    boolean updateBookPriceByBookId(int bookId, double newBookPrice);

    Book getBookDetailsById(int id);
    void getBookDetails(Book book);

}
