package com.step.assignments.library;

import java.util.*;

public class Library {
    private String librarian;
    private Set<String> books;
    private Set<String> removedBooks;
    private HashMap<String, Reader> booksRegister;
    private HashMap<Reader, Set<String >> readersRegister;

    public Library(String librarian) {
        this.librarian = librarian;
        books = new HashSet<>();
        removedBooks = new HashSet<>();
        booksRegister = new HashMap<>();
        readersRegister = new HashMap<>();
    }

    public boolean isPresent(String book) {
        return this.books.contains(book);
    }

    public boolean addBook(String book, String librarian) {
        if (isNotLibrarian(librarian)) return false;
        return books.add(book);

    }

    public boolean removeBook(String book, String librarian) {
        if (isNotLibrarian(librarian) || !this.books.contains(book)) return false;
        this.books.remove(book);
        return this.removedBooks.add(book);
    }

    private boolean isNotLibrarian(String librarian) {
        return !this.librarian.equals(librarian);
    }

    public boolean assignBook(String book, Reader reader) {
        if (isBookAlreadyBorrowed(book) || !reader.borrowBook(book)) return false;
        booksRegister.put(book, reader);
        Set<String> bookesBorrowed = readersRegister.getOrDefault(reader, new HashSet<>());
        bookesBorrowed.add(book);
        readersRegister.put(reader, bookesBorrowed);
        return true;
    }

    private boolean isBookAlreadyBorrowed(String book) {
        return booksRegister.containsKey(book);
    }

    public boolean returnBook(String book, Reader reader) {
        if (!isBookAlreadyBorrowed(book) || !reader.returnBook(book)) return false;
        booksRegister.remove(book);
        return readersRegister.get(reader).remove(book);

    }

    public boolean haveIBorrowed(String book, Reader reader) {
        return readersRegister.get(reader).contains(book);
    }

    public Reader getBorrower(String book) {
        return booksRegister.get(book);
    }

    public Set<String> getBorrowedBooks(Reader reader) {
        return Collections.unmodifiableSet(readersRegister.get(reader));
    }


    public boolean wasRemoved(String book) {
        return this.removedBooks.contains(book);
    }
}
