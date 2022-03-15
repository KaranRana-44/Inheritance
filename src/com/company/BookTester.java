package com.company;

import java.util.ArrayList;

public class BookTester{
    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();
        Book book1= new Book("Frankenstein", "Mary Shelly");
        PictureBook book2= new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W. Denslow");
        /* missing code */
        myLibrary.add(book1);
        myLibrary.add(book2);

        System.out.println("Book Info Print");
        System.out.println();
        myLibrary.get(0).printBookInfo();
        System.out.println();
        myLibrary.get(1).printBookInfo();
        System.out.println();

        System.out.println();
        System.out.println("Book Listings:");
        System.out.println();
        BookListing listing1 = new BookListing(book1, 10.99); listing1.printDescription();
        System.out.println();
        BookListing listing2 = new BookListing(book2, 12.99); listing2.printDescription();
    }

}
