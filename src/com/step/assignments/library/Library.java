package com.step.assignments.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Library {
    private String librarian;
    private Set<String> books;
    private Set<String> removedBooks;
    private HashMap<String, Reader> recordByBooks;
    private HashMap<Reader, ArrayList<String>> recordByReaders;

    public Library(String librarian) {
        this.librarian = librarian;
        books = new HashSet<>();
        removedBooks = new HashSet<>();
        recordByBooks = new HashMap<>();
        recordByReaders = new HashMap<>();
    }

    public boolean addBook(String book, String librarian) {
        if (!this.librarian.equals(librarian) || books.contains(book)) return false;
        return books.add(book);

    }

    public boolean removeBook(String book, String librarian) {
        if (!this.librarian.equals(librarian) || !this.books.contains(book)) return false;
        this.books.remove(book);
        return this.removedBooks.add(book);
    }

    public boolean assignBook(String book, Reader reader) {
        if (recordByBooks.containsKey(book) || !reader.borrowBook(book)) return false;
        recordByBooks.put(book, reader);
        if (!recordByReaders.containsKey(reader)) {
            recordByReaders.put(reader, new ArrayList<String>());
        }
        return recordByReaders.get(reader).add(book);

    }

    public boolean returnBook(String book, Reader reader) {
        if (!recordByBooks.containsKey(book) || !reader.returnBook(book)) return false;
        recordByBooks.remove(book);
        return recordByReaders.get(reader).remove(book);

    }

    public boolean HaveIBorrowed(String book, Reader reader) {
        return recordByReaders.get(reader).contains(book);
    }

    public Reader getBorrower(String book) {
        return recordByBooks.get(book);
    }

    public ArrayList<String> getBorrowedBooks(Reader reader) {
        return recordByReaders.get(reader);
    }

    public boolean search(String book) {
        return this.books.contains(book);
    }

    public boolean wasRemoved(String book) {
        return this.removedBooks.contains(book);
    }
}
