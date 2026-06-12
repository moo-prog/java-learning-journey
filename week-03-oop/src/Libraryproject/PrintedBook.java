package Libraryproject;

public class PrintedBook extends Book{
    private int page;
    public PrintedBook(int number, String address , String author, boolean status,int page){
        super(number,address, author, status);
        this.page = page;
    }
}
