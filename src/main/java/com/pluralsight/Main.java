package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Book[] inventory = new Book[20];
        loadInventory(inventory);


        String userInput = displayMenu();
        switch (userInput){
                case ("1")->{
                    // show available books
                    showAvailableBooks(inventory);
            }   case ("2")->{
                    // show check out books
                    checkedoutBooks(inventory);

            }   case ("3")->{

            }

    }



    }
    // Display the menu
    public static String displayMenu(){
        String displayMenus = """
                -----Menu-----
                1) Show Available Books
                2) Show Checked Out Books
                3) Exit - closes out of the application
                Please Enter your selection
                """;
            System.out.println(displayMenus);
            return  scanner.nextLine(); }

    // Show available books
    public static void showAvailableBooks(Book[] books){
        System.out.println("ID \t ISBN \t\t\t\t Title");
        for(Book currentBooks : books){
            if(!currentBooks.isCheckOut()){
                System.out.println(currentBooks.id +" \t "+ currentBooks.isbn +" \t "+ currentBooks.title);
            }}}

    // Show Checkedout books
    public static void  checkedoutBooks(Book[] books){
        System.out.println("ID \t ISBN \t\t\t\t Title \t CheckedOut by ");
        for(Book currentBooks : books){
            if(currentBooks.isCheckOut()){
                System.out.println(currentBooks.id +" \t "+ currentBooks.isbn +" \t "+ currentBooks.title+"Checked out by: " + currentBooks.checkedOutTo);

    }}}

    // load the Book array
    public static void loadInventory(Book[] inventory){
        inventory[ 0] = new Book(1, "978-0134685991", "Effective Java", true,"Ahmad");
        inventory[ 1] = new Book(2, "978-0596009205", "Head First Design Patterns", false);
        inventory[ 2] = new Book(3, "978-0132350884", "Clean Code", false);
        inventory[ 3] = new Book(4, "978-0743273565", "The Great Gatsby", false);
        inventory[ 4] = new Book(5, "978-0446310789", "To Kill a Mockingbird", false);
        inventory[ 5] = new Book(6, "978-0451524935", "1984", true,"Joh");
        inventory[ 6] = new Book(7, "978-0618260300", "The Hobbit", false);
        inventory[ 7] = new Book(8, "978-0316769488", "The Catcher in the Rye", false);
        inventory[ 8] = new Book(9, "978-0141439518", "Pride and Prejudice", false);
        inventory[ 9] = new Book(10, "978-0345339683", "The Fellowship of the Ring", false);
        inventory[10] = new Book(11, "978-0375842207", "The Book Thief", true,"Alex");
        inventory[11] = new Book(12, "978-0439023528", "The Hunger Games", false);
        inventory[12] = new Book(13, "978-0743247542", "The Kite Runner", false);
        inventory[13] = new Book(14, "978-0143038412", "Eat, Pray, Love", false);
        inventory[14] = new Book(15, "978-0307277671", "The Da Vinci Code", false);
        inventory[15] = new Book(16, "978-0062315007", "The Alchemist", false);
        inventory[16] = new Book(17, "978-0553103540", "A Game of Thrones", false);
        inventory[17] = new Book(18, "978-0307474278", "The Girl with the Dragon Tattoo", false);
        inventory[18] = new Book(19, "978-0735211292", "Atomic Habits", false);
        inventory[19] = new Book(20, "978-1501110368", "It Ends with Us", false);
    }

}
