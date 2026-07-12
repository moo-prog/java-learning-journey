package Libraryproject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        Libraryproject.BookRepository bookRepo = new BookRepository();
        Scanner eingabe = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a Book");
            System.out.println("2. Add a Member");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Search a Book by Title");
            System.out.println("6. Display All Books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = eingabe.nextInt();
            eingabe.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Number: ");
                    int bNum = eingabe.nextInt();
                    eingabe.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = eingabe.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = eingabe.nextLine();
                    System.out.println("how many Page");
                    int pages = eingabe.nextInt();
                    PrintedBook newBook = new PrintedBook(bNum, title, author, true, pages);
//                    l.addBooks(newBook);
                    bookRepo.addBook(newBook);//connect with database
                    break;
                case 2:
                    System.out.print("Enter Member ID (Number): ");
                    int mID = eingabe.nextInt();
                    eingabe.nextLine();
                    System.out.print("Enter Member Name: ");
                    String mName = eingabe.nextLine();
                    Member newMember = new Member(mID, mName);
                    l.addMembers(newMember);
                    break;
                case 3:
                    System.out.print("Enter Member ID: ");
                    int borrowMemberID = eingabe.nextInt();
                    System.out.print("Enter Book Number: ");
                    int borrowBookID = eingabe.nextInt();
//                    l.borrowBookProcess(borrowMemberID, borrowBookID);
                    bookRepo.updateBookStatus(borrowBookID, false);
                    break;
                case 4:
                    System.out.print("Enter Member ID: ");
                    int returnMemberID = eingabe.nextInt();
                    System.out.print("Enter Book Number: ");
                    int returnBookID = eingabe.nextInt();
//                    l.returnBookProcess(returnMemberID, returnBookID);
                    bookRepo.updateBookStatus(returnBookID, true);
                    break;
                case 5:
                    System.out.print("Enter Book Title to search: ");
                    String searchTitle = eingabe.nextLine();
//                    l.searchTitle(searchTitle);
                    bookRepo.selectBook(searchTitle);

                    break;
                case 6:
//                    l.DisplayAllBooks();
                    bookRepo.getAllBooks();

                    break;
                case 7:
                    System.out.println("Thank you for using the Library System. Goodbye!");
                    eingabe.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }
}
