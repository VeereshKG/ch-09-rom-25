package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Book book1=new Book(1,"The Adventures","Mark",200,"India",250);
        Book book2=new Book(2,"Mystery of the Lost City","Nina",320,"UK",350);
        Book book3=new Book(3,"Journey to the Unknown","Alex",280,"USA",300);
        Book book4=new Book(4,"Legends of the Forest","Rohan",400,"India",450);
        Book book5=new Book(5,"Secrets of the Ocean","Priya",360,"Australia",400);
        Book book6=new Book(6,"The Hidden Treasure","Vikram",250,"UK",280);
        Book book7=new Book(7,"Chronicles of Time","Sara",420,"USA",500);
        Book book8=new Book(8,"Whispers in the Dark","Karan",300,"India",320);
        Book book9=new Book(9,"Echoes of the Past","Anita",310,"Canada",330);
        Book book10=new Book(10,"The Final Quest","Raghav",380,"India",410);
        Book book11=new Book(11,"Mystic Lands","Meera",290,"UK",310);
        Book book12=new Book(12,"Tales of Valor","Arjun",450,"USA",520);
        Book book13=new Book(13,"Journey Beyond","Sana",270,"India",290);
        Book book14=new Book(14,"Legends Untold","Ritesh",340,"Canada",360);


        Library library =new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);
        library.addBook(book12);
        library.addBook(book13);
        library.addBook(book14);
        library.getAllBooksInfo();

    }
}
