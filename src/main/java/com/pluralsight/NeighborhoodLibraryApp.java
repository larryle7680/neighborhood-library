package com.pluralsight;
import java.util.Scanner;

public class NeighborhoodLibraryApp {
    //Creating global variables, so I can access them in methods
    static int id = 0;
    static String isbn = "";
    static String title = "";
    static boolean isCheckedOut = false;
    static String checkOutTo = "";

    //Importing a scanner
    static Scanner theScanner = new Scanner(System.in);

    //Creating a global Array with an inventory of 20 books
    static Book[] book = new Book[20];

    //Main Method
    public static void main(String[] args) {

        //Adding books to array
        book[0] = new Book("To Kill a Mockingbird",1,"ISBN-11111",false,"");
        book[1] = new Book("1984",2,"ISBN-22222",false,"");
        book[2] = new Book("The Great Gatsby",3,"ISBN-33333",false,"");
        book[3] = new Book("The Catcher in the Rye",4,"ISBN-44444",false,"");
        book[4] = new Book("Pride and Prejudice",5,"ISBN-55555",false,"");
        book[5] = new Book("The Hobbit",6,"ISBN-55555",false,"");
        book[6] = new Book("Moby-Dick",7,"ISBN-55555",false,"");
        book[7] = new Book("Fahrenheit 451",8,"ISBN-55555",false,"");
        book[8] = new Book("Brave New World",9,"ISBN-55555",false,"");
        book[9] = new Book("The Lord of the Rings",10,"ISBN-55555",false,"");

        //Book Menu
        boolean running = true;
        while(running){
            for(int i = 0; i < book.length; i++){
                //Prompt the user and store their answer for later use
                System.out.println("---Press a number for your options---");
                System.out.println();
                System.out.println("Press 1 to show available books");
                System.out.println("Press 2 to show checked out books");
                System.out.println("Press 3 to exit");
                int usersChoice = theScanner.nextInt();


                //Using a switch statement to process users options
                switch(usersChoice){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:
                        return;


                }
            }
        }


    }





    }


















