package com.step.assignments.library;

public class Book {
    private String name;
    private Integer isbnNumber;
    private String author;
    private boolean isBorrowed;
    private String borrower;

    public Book(String name, Integer isbnNumber, String author) {
        this.name = name;
        this.isbnNumber = isbnNumber;
        this.author = author;
        this.isBorrowed = false;
        this.borrower = null;
    }

    public String getName() {
        return name;
    }

    public String getBorrower() {
        return borrower;
    }


    public boolean borrow(String borrower){
        if(this.isBorrowed) return false;
            this.borrower = borrower;
            this.isBorrowed = true;
            return true;
    }

    public boolean deAssign(){
        if(!this.isBorrowed) return false;
        this.isBorrowed = false;
        this.borrower = null;
        return true;
    }
}
