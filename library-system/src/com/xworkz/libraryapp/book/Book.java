package com.xworkz.libraryapp.book;

import com.xworkz.libraryapp.constants.Publications;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private int noOfPages;
    private Publications publication;
    private double bookPrice;

}
