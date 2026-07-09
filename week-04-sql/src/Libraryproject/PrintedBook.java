package Libraryproject;

public class PrintedBook extends Book {
    private int page;

    public PrintedBook(int number, String title, String author, boolean status, int page) {
        super(number, title, author, status);
        this.page = page;
    }
}
