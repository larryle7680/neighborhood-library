package com.pluralsight;

import static com.pluralsight.NeighborhoodLibraryApp.book;
import static com.pluralsight.NeighborhoodLibraryApp.theScanner;

public class Book {
    //Attributes of the books
    String bookName = "";
    int id = 0;
    String isbn = "";
    boolean isCheckOut = false;
    String checkedOutTo = "";

    //Generated Constructor
    public Book(String bookName, int id, String isbn, boolean isCheckOut, String checkedOutTo) {
        this.bookName = bookName;
        this.id = id;
        this.isbn = isbn;
        this.isCheckOut = isCheckOut;
        this.checkedOutTo = checkedOutTo;
    }

    public  String checkOut (String checkOut){
        //Create a loop to iterate through the array

        return checkOut;
    }

    public void checkIn(){

    }

    //Generated Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
