package com.pluralsight;

public class Book {
     int id;
     String isbn;
     String title;
     String checkedOutTo;
     boolean isCheckout;

     // Constructor
    public Book() {
    }
    public Book (int id, String isbn, String title , boolean isCheckedout) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckout = isCheckedout;
    }

    public Book( int id, String isbn, String title, boolean isCheckout,String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckout = isCheckout;
    }


    // methods
    public void checkOut (String name){
        checkedOutTo = name;
        isCheckout = true;
        System.out.println("Check out successful.");
    }

    public void checkIn(){
        checkedOutTo="";
        isCheckout =false;
        System.out.println("Check In successful.");
    }
    // Getters
    public boolean isCheckOut() {
        return isCheckout;
    }



}
