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

    //---
    // methods
    public void checkOut (String name){
        checkedOutTo = name;
        isCheckout = true;
    }
    public void checkIn(int id){
       if (String.valueOf(id).equals(this.id))
       {checkedOutTo="";
        isCheckout =false;
           System.out.println("Check In complete.");
       } else {
           System.out.println("Wrong Id.");
       }

    }
    // ----
    // Getters
    public boolean isCheckOut() {
        return isCheckout;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    // Setter

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }


    //--

}
