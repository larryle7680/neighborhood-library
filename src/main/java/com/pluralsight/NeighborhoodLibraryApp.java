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



    }

    //checkOutMethod
    public static String checkOut(String name){

    }


    //Creating a menu method
    public static void storeHomeScreen(){
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
                        showAvailableBooks();
                        break;
                    case 2:
                        showCheckedOutBooks();
                        break;
                    case 3:
                        return;


                }
            }
        }


    }

















}
