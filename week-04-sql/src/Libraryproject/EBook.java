package Libraryproject;

public class EBook extends Book {
    private int size;

    public EBook(int number, String title, String author, boolean status, int size) {
        super(number, title, author, status);
        this.size = size;
    }
}
