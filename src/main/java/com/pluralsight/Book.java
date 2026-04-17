package com.pluralsight;

public class Book {
     int id;
     String isbn;
     String title;
     String checkedOutTo;
     boolean isCheckedout;

     // Constructor
    public Book() {
    }
    public Book (int id, String isbn, String title , boolean isCheckedout) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedout = isCheckedout;
    }
    //---
    // methods
    public void checkOut (String name){
        checkedOutTo = name;
        isCheckedout = true;
    }
    public void checkIn(int id){
       if (String.valueOf(id).equals(this.id))
       {checkedOutTo="";
        isCheckedout =false;
           System.out.println("Check In complete.");
       } else {
           System.out.println("Wrong Id.");
       }

    }
    // ----
    // Getters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public String getTitle() {
        return title;
    }

    //--
   // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setCheckedout(boolean checkedout) {
        isCheckedout = checkedout;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //--
}
