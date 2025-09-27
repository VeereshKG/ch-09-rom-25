package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Publications;
import com.xworkz.libraryapp.library.Library;
import com.xworkz.libraryapp.library.LibraryImpl;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of books to be added: ");
        int size = scanner.nextInt();

        Library library = new LibraryImpl(size);
        System.out.println("The no of books available: " + library.size());
        boolean isAdded = false;
        for (int index = 0; index < size; index++) {
            Book book = new Book();

            System.out.println("Enter Book Id: ");
            book.setBookId(scanner.nextInt());

            System.out.println("Enter Book Name: ");
            book.setBookName(scanner.next());

            System.out.println("Enter Book Price: ");
            book.setBookPrice(scanner.nextDouble());

            System.out.println("Enter Publication (PENGUIN, OXFORD, HARPERCOLLINS, MACMILLAN, RANDOM_HOUSE): ");
            book.setPublication(Publications.valueOf(scanner.next().toUpperCase()));

            System.out.println("Enter Author Name: ");
            book.setAuthorName(scanner.next());

            System.out.println("Enter No. of Pages: ");
            book.setNoOfPages(scanner.nextInt());

            isAdded = library.addBook(book);
        }
        if (isAdded == true) {
            String input;
            do {
                System.out.println("1 to Get All Books Info");
                System.out.println("2 to Get Book Name by Id");
                System.out.println("3 to Get Book Id by Name");
                System.out.println("4 to Get Author Name by Book Id");
                System.out.println("5 to Get Author Name by Book Name");
                System.out.println("6 to Get No. of Pages by Book Id");
                System.out.println("7 to Get No. of Pages by Book Name");
                System.out.println("8 to Get Publication by Book Id");
                System.out.println("9 to Get Publication by Book Name");
                System.out.println("10 to Get Book Price by Book Id");
                System.out.println("11 to Get Book Price by Book Name");
                System.out.println("12 to Update Book Name by Id");
                System.out.println("13 to Update Author Name by Id");
                System.out.println("14 to Update No. of Pages by Id");
                System.out.println("15 to Update Publication by Id");
                System.out.println("16 to Update Book Price by Id");
                System.out.println("17 to Get Book Details by Id");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        library.getAllBooksInfo();
                        break;
                    case 2:
                        System.out.println("Enter Book Id to get BookName ");
                        System.out.println("Book Name: " + library.getBookNameByBookId(scanner.nextInt()));
                        break;
                    case 3:
                        System.out.println("Enter Book Name to get BookId");
                        System.out.println("Book Id: " + library.getBookIdByBookName(scanner.next()));
                        break;
                    case 4:
                        System.out.println("Enter Book Id to get AuthorName ");
                        System.out.println("Author Name: " + library.getAuthorNameByBookId(scanner.nextInt()));
                        break;
                    case 5:
                        System.out.println("Enter Book Name to get AuthorName ");
                        System.out.println("Author Name: " + library.getAuthorNameByBookName(scanner.next()));
                        break;
                    case 6:
                        System.out.println("Enter Book Id to get NoOfPages ");
                        System.out.println("No. of Pages: " + library.getNoOfPagesByBookId(scanner.nextInt()));
                        break;
                    case 7:
                        System.out.println("Enter Book Name to get NoOfPages ");
                        System.out.println("No. of Pages: " + library.getNoOfPagesByBookName(scanner.next()));
                        break;
                    case 8:
                        System.out.println("Enter Book Id to getPublicationName ");
                        System.out.println("Publication: " + library.getPublicationNameByBookId(scanner.nextInt()));
                        break;
                    case 9:
                        System.out.println("Enter Book Name to getPublicationName ");
                        System.out.println("Publication: " + library.getPublicationByBookName(scanner.next()));
                        break;
                    case 10:
                        System.out.println("Enter Book Id to getBookPrice ");
                        System.out.println("Book Price: " + library.getBookPriceByBookId(scanner.nextInt()));
                        break;
                    case 11:
                        System.out.println("Enter Book Name to getBookPrice ");
                        System.out.println("Book Price: " + library.getBookPriceByBookName(scanner.next()));
                        break;
                    case 12:
                        System.out.println("Enter Book Id to updateBookName");
                        int bookId = scanner.nextInt();
                        System.out.println("Enter new Book Name: ");
                        String newBookName = scanner.next();
                        boolean nameUpdated = library.updateBookNameByBookId(bookId, newBookName);
                        System.out.println("Book Name Updated: " + nameUpdated);
                        break;
                    case 13:
                        System.out.println("Enter Book Id to updateAuthorName");
                        int bookId1 = scanner.nextInt();
                        System.out.println("Enter new Author Name: ");
                        String newAuthor = scanner.next();
                        boolean authorUpdated = library.updateAuthorNameByBookId(bookId1, newAuthor);
                        System.out.println("Author Updated: " + authorUpdated);
                        break;
                    case 14:
                        System.out.println("Enter Book Id to updateNoOfPages ");
                        int bookId2 = scanner.nextInt();
                        System.out.println("Enter new No. of Pages: ");
                        int pages = scanner.nextInt();
                        boolean pagesUpdated = library.updateNoOfPagesByBookId(bookId2, pages);
                        System.out.println("Pages Updated: " + pagesUpdated);
                        break;
                    case 15:
                        System.out.println("Enter Book Id to updatePublication ");
                        int bookId3 = scanner.nextInt();
                        System.out.println("Enter new Publication (PENGUIN, OXFORD, HARPERCOLLINS, MACMILLAN, RANDOM_HOUSE): ");
                        Publications pub = Publications.valueOf(scanner.next().toUpperCase());
                        boolean pubUpdated = library.updatePublicationByBookId(bookId3, pub);
                        System.out.println("Publication Updated: " + pubUpdated);
                        break;
                    case 16:
                        System.out.println("Enter Book Id to updateBookPrice ");
                        int bookId4 = scanner.nextInt();
                        System.out.println("Enter new Book Price: ");
                        double price = scanner.nextDouble();
                        boolean priceUpdated = library.updateBookPriceByBookId(bookId4, price);
                        System.out.println("Price Updated: " + priceUpdated);
                        break;
                    case 17:
                        System.out.println("Enter Book Id to getBookDetails ");
                        int id = scanner.nextInt();
                        Book book = library.getBookDetailsById(id);
                        library.getBookDetails(book);
                        break;
                    default:
                        System.out.println("Please enter a valid option!");
                }

                System.out.println("Do you want to continue? (yes/no): ");
                input = scanner.next();
            } while (input.equalsIgnoreCase("yes"));

            System.out.println("Thank you.. Visit again!");
        } else System.out.println("Not added");
    }
}
