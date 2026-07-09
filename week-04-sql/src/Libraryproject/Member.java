package Libraryproject;

import java.util.ArrayList;

public class Member {
    private int num;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Member(int num, String name) {
        this.num = num;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }

}
