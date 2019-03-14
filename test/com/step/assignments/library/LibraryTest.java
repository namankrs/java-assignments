package com.step.assignments.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {

    Reader firstReader = new Reader("firstReader");
    Library library;

    @BeforeEach
    void setUp() {
        library = new Library("librarian");
        library.addBook("firstBook", "librarian");
        library.addBook("secondBook", "librarian");
        library.assignBook("firstBook", firstReader);
    }

    @Test
    void addBookShouldReturnTrueAfterAddingABook() {
        boolean actualOutput = library.addBook("thirdBook", "librarian");
        boolean expectedOutput = true;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void addBookShouldReturnFalseIfBookIsAlreadyPresent() {
        boolean actualOutput = library.addBook("firstBook", "librarian");
        boolean expectedOutput = false;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void addBookShouldReturnFalseIfLibrarianisNotSame() {
        boolean actualOutput = library.addBook("firstBook", "librarian");
        boolean expectedOutput = false;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void removeBookShouldReturnTrueAfterRemovingExistingBook() {
        boolean actualOutput = library.removeBook("firstBook", "librarian");
        boolean expectedOutput = true;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void assignBookShouldReturnTrueAfterAssigningBookToReader() {
        boolean actualOutput = library.assignBook("firstBook", firstReader);
        boolean expectedOutput = false;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void returnBookShouldReturnTrueAfterReturningABookToLibrary() {
        boolean actualOutput = library.returnBook("firstBook", firstReader);
        boolean expectedOutput = true;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void CheckIfBookIsBorrowedShouldReturnTrueForABorrowedBook() {
        boolean actualOutput = library.HaveIBorrowed("firstBook", firstReader);
    }

    @Test
    void getBorrowerShouldReturnTheBorrowerForABorrowedBook() {
        Reader actualOuput = library.getBorrower("firstBook");
        Reader expectedOutput = firstReader;
        assertEquals(actualOuput, expectedOutput);
    }

    @Test
    void getBorrowedBooksShouldReturnBooksOfAReader() {
        ArrayList<String> actualOuput = library.getBorrowedBooks(firstReader);
        List<String> expectedOutput = Arrays.asList("firstBook");
        assertEquals(expectedOutput, actualOuput);
    }

    @Test
    void searchShouldreturnTrueIfGivenBookIsPresent() {
        boolean actualOutput = library.search("firstBook");
        boolean expectedOutput = true;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void wasRemovedShouldReturnTrueIfBookWasRemovedFromLibrary() {
        library.removeBook("firstBook", "librarian");
        boolean actualOutput = library.wasRemoved("firstBook");
        boolean expectedOutput = true;
        assertEquals(expectedOutput, actualOutput);
    }
}