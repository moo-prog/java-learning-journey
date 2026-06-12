package Libraryproject;

import Libraryproject.Library;
import Libraryproject.Member;
import Libraryproject.PrintedBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testBorrowBookSuccess() {
        Library l = new Library();
        PrintedBook book = new PrintedBook(101, "Java", "Author", true, 200);
        Member member = new Member(55, "Ahmed");

        l.addBooks(book);
        l.addMembers(member);

        l.borrowBookProcess(55, 101);

        assertFalse(book.isAvailable());
    }

    @Test
    public void testBorrowAlreadyBorrowedBook() {
        Library l = new Library();
        PrintedBook book = new PrintedBook(101, "Java", "Author", true, 200);
        Member member1 = new Member(55, "Ahmed");
        Member member2 = new Member(66, "Khaled");

        l.addBooks(book);
        l.addMembers(member1);
        l.addMembers(member2);

        l.borrowBookProcess(55, 101);
        l.borrowBookProcess(66, 101);

        assertFalse(book.isAvailable());
    }

    @Test
    public void testReturnBookSuccess() {
        Library l = new Library();
        PrintedBook book = new PrintedBook(101, "Java", "Author", true, 200);
        Member member = new Member(55, "Ahmed");

        l.addBooks(book);
        l.addMembers(member);

        l.borrowBookProcess(55, 101);
        l.returnBookProcess(55, 101);

        assertTrue(book.isAvailable());
    }
}