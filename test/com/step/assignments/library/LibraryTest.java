package com.step.assignments.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        boolean actualOutput = library.haveIBorrowed("firstBook", firstReader);
    }

    @Test
    void getBorrowerShouldReturnTheBorrowerForABorrowedBook() {
        Reader actualOuput = library.getBorrower("firstBook");
        Reader expectedOutput = firstReader;
        assertEquals(actualOuput, expectedOutput);
    }

    @Test
    void getBorrowedBooksShouldReturnBooksOfAReader() {
        Set<String> actualOuput =  library.getBorrowedBooks(firstReader);
        Set<String> expectedOutput = new HashSet<String>();
        expectedOutput.add("firstBook");
        assertEquals(expectedOutput, actualOuput);
    }

    @Test
    void searchShouldreturnTrueIfGivenBookIsPresent() {
        boolean actualOutput = library.isPresent("firstBook");
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