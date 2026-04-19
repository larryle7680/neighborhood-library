package com.pluralsight;

public class Book {
    //Attributes of the books
    int id = 0;
    String isbn = "";
    boolean isCheckOut = false;
    String checkedOutTo = "";

    //Constructor
    public Book(int id, String isbn, boolean isCheckOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.isCheckOut = isCheckOut;
        this.checkedOutTo = checkedOutTo;
    }
}
