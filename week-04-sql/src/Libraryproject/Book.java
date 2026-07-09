package Libraryproject;

public abstract class Book {
    private int number;
    private String title;
    private String author;
    private boolean status;

    public Book(int number, String address, String author, boolean status) {
        this.number = number;
        this.title = address;
        this.author = author;
        this.status = status;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setTitle(String tiltle) {
        this.title = tiltle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAvailable(boolean status) {
        this.status = status;
    }

    public boolean isAvailable() {
        return status;
    }
}


