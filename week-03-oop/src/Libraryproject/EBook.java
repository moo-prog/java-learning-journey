package Libraryproject;

public class EBook extends Book{
    private int size;
    public EBook(int number, String address, String author , boolean status, int size){
        super(number , address, author ,status );
        this.size = size;
    }
}
