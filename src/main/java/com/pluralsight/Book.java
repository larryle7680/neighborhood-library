package com.pluralsight;

public class Book {
    //Attributes of the books
    int id = 0;
    String isbn = "";
    boolean isCheckOut = false;
    String checkedOutTo = "";

    //Generated Constructor
    public Book(int id, String isbn, boolean isCheckOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.isCheckOut = isCheckOut;
        this.checkedOutTo = checkedOutTo;
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
}
