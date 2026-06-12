package Libraryproject;

import java.util.ArrayList;
import java.util.HashMap;

public class Library implements Searchable{


    private ArrayList<Book> books;
    private HashMap<Integer, Member> members;
    public Library(){
        this.books = new ArrayList<>();
        this.members= new HashMap<>();
    }

    @Override
    public Book searchTitle(String Title) {
       for (Book book : this.books){
           if (book.getAddress().equals(Title)){
               return book;
           }else{
               System.out.println("book not found!");
           }
        }
        return null;
    }

    @Override
    public Book searchAuthotr(String author) {
        for (Book book : this.books){
            if (book.getAuthor().equals(author)){
                return book;
            }else{
                System.out.println("author not found!");
            }
        }
        return null;
    }
    public void addBooks(Book book){
        this.books.add(book);
    }
    public void addMembers(Member member){
        this.members.put(member.getNum(), member);
    }
    public void borrowBookProcess(int memberNum, int bookNum) {
        for (Book book : this.books) {
            if (book.getNumber() == (bookNum) && book.isAvailable()) {
                Member member = this.members.get(memberNum);
                if (member != null) {
                    book.setAvailable(false);
                    member.borrowBook(book);
                    System.out.println("The book has been successfully borrowed by member: " + member.getName());
                    return;
                }

            }

        }
        System.out.println("Error: Book is not available or member ID is incorrect!");
    }
    public void returnBookProcess(int memberNum, int bookNum) {
        for (Book book : this.books) {
            if (book.getNumber() == (bookNum) ) {
                book.setAvailable(true);
                Member member = this.members.get(memberNum);
                if (member != null) {
                    member.returnBook(book);
                    System.out.println("The book has been successfully returned by member: " + member.getName());                    return;
                }

            }

        }
        System.out.println("Error: Book was not borrowed or member ID is incorrect!");
    }
    public void DisplayAllBooks(){
        if(books.isEmpty()){
            System.out.println("The library is empty! No books available.");
            return;
        }
        for(Book book : books){
            System.out.println("ID: " + book.getNumber() +
                    " | Title: " + book.getAddress() +
                    " | Author: " + book.getAuthor() +
                    " | Status: " + (book.isAvailable() ? "Available" : "Borrowed"));
        }
        }
    }

