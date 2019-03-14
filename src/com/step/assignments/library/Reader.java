package com.step.assignments.library;

import java.util.ArrayList;

public class Reader {
    private String name;
    private ArrayList<String> books;

    public Reader(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean borrowBook(String book){
        if(this.books.contains(book)) return false;
        this.books.add(book);
        return true;
    }

    public boolean returnBook(String book){
        if(!this.books.contains(book)) return false;
        this.books.remove(book);
        return true;
    }
}
