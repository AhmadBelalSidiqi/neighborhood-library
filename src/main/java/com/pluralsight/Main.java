package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Load the books in the library,
        Book[] books = loadInventory();

        // Run the program
        boolean programRunning = true;
        do {
            String userInput = displayMenu();
            switch (userInput) {
                case ("1") -> {
                    // show available books
                    showAvailableBooks(books);
                }
                case ("2") -> {
                    // show check out books
                    checkoutBooks(books);
                    // Exit the program
                }
                case ("3") -> {
                    programRunning = false;
                }
                default -> {
                    System.out.println("Wrong Input");
                }
            }
        } while (programRunning);

        System.out.println("Thank you for using our application. ");


    }

    // Display the menu
    public static String displayMenu() {
        String displayMenus = """
                -----Menu-----
                1) Show Available Books
                2) Show Checked Out Books
                3) Exit - closes out of the application
                Please Enter your selection
                """;
        System.out.println(displayMenus);
        return scanner.nextLine();
    }

    // Show available books
    public static void showAvailableBooks(Book[] books) {
        System.out.println("ID \t ISBN \t\t\t\t Title");
        for (Book currentBooks : books) {
            if (!currentBooks.isCheckOut()) {
                System.out.println(currentBooks.id + " \t " + currentBooks.isbn + " \t " + currentBooks.title);
            }
        }

        System.out.println("Do you want to check out a book yes/No:");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            System.out.println("Enter you name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the book ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            books[id].checkOut(name);
        }
    }

    // Show Checkedout books
    public static void checkoutBooks(Book[] books) {
        System.out.println("ID \t ISBN \t\t\t\t Title");
        for (Book currentBooks : books) {
            if (currentBooks.isCheckOut()) {
                System.out.println(currentBooks.id + " \t " + currentBooks.isbn + " \t " + currentBooks.title + " Checked out by: " + currentBooks.checkedOutTo);
            }
        }

        System.out.println("Do you want to CheckIn your book Yes/No:");
        String UserInput = scanner.nextLine();
        if (UserInput.equalsIgnoreCase("yes")) {
            System.out.println("Enter the book ID");
            int id = Integer.parseInt(scanner.nextLine());
            books[id].checkIn();

        }
    }

    // load the Book array
    public static Book[] loadInventory() {
        Book[] books = new Book[20];
        books[0] = new Book(0, "978-0134685991", "Effective Java", true, "Ahmad");
        books[1] = new Book(1, "978-0596009205", "Head First Design Patterns", false);
        books[2] = new Book(2, "978-0132350884", "Clean Code", false);
        books[3] = new Book(3, "978-0743273565", "The Great Gatsby", false);
        books[4] = new Book(4, "978-0446310789", "To Kill a Mockingbird", false);
        books[5] = new Book(5, "978-0451524935", "1984", true, "Joh");
        books[6] = new Book(6, "978-0618260300", "The Hobbit", false);
        books[7] = new Book(7, "978-0316769488", "The Catcher in the Rye", false);
        books[8] = new Book(8, "978-0141439518", "Pride and Prejudice", false);
        books[9] = new Book(9, "978-0345339683", "The Fellowship of the Ring", false);
        books[10] = new Book(10, "978-0375842207", "The Book Thief", true, "Alex");
        books[11] = new Book(11, "978-0439023528", "The Hunger Games", false);
        books[12] = new Book(12, "978-0743247542", "The Kite Runner", false);
        books[13] = new Book(13, "978-0143038412", "Eat, Pray, Love", false);
        books[14] = new Book(14, "978-0307277671", "The Da Vinci Code", false);
        books[15] = new Book(15, "978-0062315007", "The Alchemist", false);
        books[16] = new Book(16, "978-0553103540", "A Game of Thrones", false);
        books[17] = new Book(17, "978-0307474278", "The Girl with the Dragon Tattoo", false);
        books[18] = new Book(18, "978-0735211292", "Atomic Habits", false);
        books[19] = new Book(19, "978-1501110368", "It Ends with Us", false);
        return books;

    }

}
