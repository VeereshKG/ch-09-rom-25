package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Publications;
import com.xworkz.libraryapp.exception.*;
import com.xworkz.libraryapp.validator.BookValidator;

public class LibraryImpl implements Library {

    public LibraryImpl(int size) {
        books = new Book[size];
    }

    public Book[] books;
    int index;
    BookValidator validator = new BookValidator();

    @Override
    public boolean addBook(Book book) {
        boolean isBookAdded = false;
        try {
                if (validator.isBookDetailsValid(book)) {
                    books[index++] = book;
                    isBookAdded = true;
                }
            else System.out.println("invalid book");
            if (isBookAdded == false) {
                BookNotAddedException bookNotAddedException = new BookNotAddedException("Book not added");
                throw bookNotAddedException;
            }
        } catch (BookNotAddedException e) {
            e.printStackTrace();
        }
        return isBookAdded;
    }

    @Override
    public void getAllBooksInfo() {
        System.out.println("the list of books are ");
        for (Book book : books) {
            System.out.println("the id of the book is " + book.getBookId());
            System.out.println("the name of the book is " + book.getBookName());
            System.out.println("the author name of the book is " + book.getAuthorName());
            System.out.println("the no of pages of the book is " + book.getNoOfPages());
            System.out.println("the publication of the book is " + book.getPublication());
            System.out.println("the price of the book is " + book.getBookPrice());
            System.out.println("------------------------------------------------");

        }
    }

    @Override
    public Publications getPublicationNameByBookId(int BookId) {
        Publications publications = null;
        try {
            if (BookId != 0) {
                for (Book book : books) {
                    if (book.getBookId() == BookId) {
                        publications = book.getPublication();
                    }
                }
            } else System.out.println("enter valid ID");
            if (publications == null) {
                PublicationNotFoundException publicationNotFoundException = new PublicationNotFoundException("publication not available");
                throw publicationNotFoundException;
            }
        } catch (PublicationNotFoundException e) {
            e.printStackTrace();
        }
        return publications;
    }

    @Override
    public Publications getPublicationByBookName(String bookName) {
        Publications publications = null;
        try {
            if (bookName != null) {
                for (Book book : books) {
                    if (book.getBookName().equals(bookName)) {
                        publications = book.getPublication();
                    }
                }
            } else System.out.println("enter valid name");
            if (publications == null) {
                PublicationNotFoundException publicationNotFoundException = new PublicationNotFoundException("publication not available");
                throw publicationNotFoundException;
            }
        } catch (PublicationNotFoundException e) {
            e.printStackTrace();
        }
        return publications;
    }

    @Override
    public double getBookPriceByBookId(int bookId) {
        double price = 0;
        try {
            if (bookId != 0) {
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        price = book.getBookPrice();
                    }
                }
            } else System.out.println("enter valid ID");
            if (price == 0) {
                BookPriceNotFoundException bookPriceNotFoundException = new BookPriceNotFoundException("Book price not found");
                throw bookPriceNotFoundException;
            }
        } catch (BookPriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public double getBookPriceByBookName(String bookName) {
        double price = 0;
        try {
            if (bookName != null) {
                for (Book book : books) {
                    if (book.getBookName().equals(bookName)) {
                        price = book.getBookPrice();
                    }
                }
            } else System.out.println("enter valid name");
            if (price == 0) {
                BookPriceNotFoundException bookPriceNotFoundException = new BookPriceNotFoundException("Book price not found");
                throw bookPriceNotFoundException;
            }
        } catch (BookPriceNotFoundException e) {
            e.printStackTrace();
        }
        return price;
    }

    @Override
    public String getAuthorNameByBookId(int bookId) {
        String author = null;
        try {
            if (bookId != 0) {
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        author = book.getAuthorName();
                    }
                }
            } else System.out.println("enter valid ID");
            if (author == null) {
                AuthorNameNotFoundException authorNameNotFoundException = new AuthorNameNotFoundException("Author name not found");
                throw authorNameNotFoundException;
            }
        } catch (AuthorNameNotFoundException e) {
            e.printStackTrace();
        }
        return author;
    }

    @Override
    public String getAuthorNameByBookName(String bookName) {
        String author = null;
        try {
            if (bookName != null) {
                for (Book book : books) {
                    if (book.getBookName().equals(bookName)) {
                        author = book.getAuthorName();
                    }
                }
            } else System.out.println("enter valid name");
            if (author == null) {
                AuthorNameNotFoundException authorNameNotFoundException = new AuthorNameNotFoundException("Author name not found");
                throw authorNameNotFoundException;
            }
        } catch (AuthorNameNotFoundException e) {
            e.printStackTrace();
        }
        return author;
    }

    @Override
    public int getNoOfPagesByBookId(int bookId) {
        int pages = 0;
        if (bookId != 0) {
            for (Book book : books) {
                if (book.getBookId() == bookId) {
                    pages = book.getNoOfPages();
                }
            }
        } else System.out.println("enter valid ID");
        if (pages == 0) System.out.println("ID not found");
        return pages;
    }

    @Override
    public int getNoOfPagesByBookName(String bookName) {
        int pages = 0;
        try {
            if (bookName != null) {
                for (Book book : books) {
                    if (book.getBookName().equals(bookName)) {
                        pages = book.getNoOfPages();
                    }
                }
            } else System.out.println("enter valid name");
            if (pages == 0) {
                NoOfPagesNotFoundException noOfPagesNotFoundException = new NoOfPagesNotFoundException("noOf pages not found");
                throw noOfPagesNotFoundException;

            }
        } catch (NoOfPagesNotFoundException e) {
            e.printStackTrace();
        }
        return pages;
    }

    @Override
    public String getBookNameByBookId(int bookId) {
        String name = null;
        try {
            if (bookId != 0) {
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        name = book.getBookName();
                    }
                }
            } else System.out.println("enter valid ID");
            if (name == null) {
                BookNameNotFoundException bookNameNotFoundException = new BookNameNotFoundException("Book name not found");
                throw bookNameNotFoundException;
            }
        } catch (BookNameNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    @Override
    public int getBookIdByBookName(String bookName) {
        int id = 0;
        try {
            if (bookName != null) {
                for (Book book : books) {
                    if (book.getBookName().equals(bookName)) {
                        id = book.getBookId();
                    }
                }
            } else System.out.println("enter valid name");
            if (id == 0) {
                BookIdNotFoundException bookIdNotFoundException = new BookIdNotFoundException("Book id not found");
                throw bookIdNotFoundException;

            }
        } catch (BookIdNotFoundException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public boolean updateBookNameByBookId(int bookId, String newBookName) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        book.setBookName(newBookName);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateBookNameNotDoneException updateBookNameNotDoneException = new UpdateBookNameNotDoneException("book name not updated");
                throw updateBookNameNotDoneException;
            }
        } catch (UpdateBookNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateAuthorNameByBookId(int bookId, String newAuthorName) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        book.setAuthorName(newAuthorName);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateAuthorNameNotDoneException updateAuthorNameNotDoneException = new UpdateAuthorNameNotDoneException("Author name not updated");
                throw updateAuthorNameNotDoneException;
            }
        } catch (UpdateAuthorNameNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateNoOfPagesByBookId(int bookId, int newNoOfPages) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        book.setNoOfPages(newNoOfPages);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateNoOfPagesNotDoneException updateNoOfPagesNotDoneException = new UpdateNoOfPagesNotDoneException("noof pages not updated");
                throw updateNoOfPagesNotDoneException;
            }
        } catch (UpdateNoOfPagesNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updatePublicationByBookId(int bookId, Publications newPublication) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        book.setPublication(newPublication);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdatePublicationNotDoneException updatePublicationNotDoneException = new UpdatePublicationNotDoneException("publication not updated");
                throw updatePublicationNotDoneException;
            }
        } catch (UpdatePublicationNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean updateBookPriceByBookId(int bookId, double newBookPrice) {
        boolean isUpdated = false;
        try {
            if (bookId != 0) {
                for (Book book : books) {
                    if (book.getBookId() == bookId) {
                        book.setBookPrice(newBookPrice);
                        isUpdated = true;
                    }
                }
            } else System.out.println("enter correct ID");
            if (isUpdated == false) {
                UpdateBookPriceNotDoneException updateBookPriceNotDoneException = new UpdateBookPriceNotDoneException("book price not updated");
                throw updateBookPriceNotDoneException;
            }
        } catch (UpdateBookPriceNotDoneException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public Book getBookDetailsById(int id) {

        Book book = null;
        try {
            if (id != 0) {
                for (Book book1 : books) {
                    if (book1.getBookId() == id) {
                        book = book1;
                    }
                }
            } else if (book == null) {
                BookDetailsNotFoundException bookDetailsNotFoundException = new BookDetailsNotFoundException("book details not found");
                throw bookDetailsNotFoundException;
            }
        } catch (BookDetailsNotFoundException e) {
            e.printStackTrace();

        }
        return book;
    }

    @Override
    public void getBookDetails(Book book) {
        try {

            System.out.println("the id of the book is " + book.getBookId());
            System.out.println("the name of the book is " + book.getBookName());
            System.out.println("the author name of the book is " + book.getAuthorName());
            System.out.println("the no of pages of the book is " + book.getNoOfPages());
            System.out.println("the publication of the book is " + book.getPublication());
            System.out.println("the price of the book is " + book.getBookPrice());
            System.out.println("------------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return books.length;
    }


}
