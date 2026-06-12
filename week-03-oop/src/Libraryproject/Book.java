package Libraryproject;

public  abstract class Book {
    private int number;
    private String address;
    private String author;
    private boolean status ;

    public Book(int number, String address , String author , boolean status){
        this.number = number ;
        this.address = address;
        this.author = author;
        this.status= status;
    }

    public void setNumber(int number){
        this.number= number;
    }
    public int getNumber(){
        return this.number;
    }
    public void setAddress(String address){
        this.address= address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAuthor(String author){
        this.author= author;
    }
    public String getAuthor(){
        return author;
    }

    public void setAvailable(boolean status) {
        this.status = status;
    }

    public boolean isAvailable() {
        return status;
    }
}


