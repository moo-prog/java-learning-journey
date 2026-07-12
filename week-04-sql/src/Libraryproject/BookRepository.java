package Libraryproject;

import java.sql.Connection;
import java.sql.ResultSet;     // Container for data returned from database
import java.sql.SQLException;
import java.sql.Statement;     // Carries and runs the SQL query
public class BookRepository {
     public void getAllBooks(){
         System.out.println("Connecting to database to fetch books\n");
         String query = "SELECT id, title, author, is_available FROM books";
         //  Open connection, messenger, and results basket
         try (Connection con = DatabaseConnection.getConnection();// Open the main pipeline to the database
              Statement stat = con.createStatement();//  Create the messenger to carry the SQL commands
              ResultSet resu = stat.executeQuery(query))// Send the query and capture the returned data table
         {
             System.out.println("===  Library Books List ===");
             //  Loop rows one by one
             while (resu.next()) {// move the cursor to the next row, loop stops automatically when there are no more rows
                 int id = resu.getInt("id");
                 String title = resu.getString("title");
                 String author = resu.getString("author");
                 boolean isAvailable = resu.getBoolean("is_available");
                 System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Available: " + isAvailable);
             }
             System.out.println("\n========done=========");

         } catch (SQLException e) {
             System.out.println(" Database error happened inside getAllBooks()");
             e.printStackTrace();
         }

     }
     public void addBook(Book book){
         System.out.println("Connecting to database to add a new book...\n");
         // MySQL needs single quotes ('') around Strings like Title and Author,
        // but Booleans like isAvailable don't need them.
         String query = "INSERT INTO books (title, author, is_available) VALUES" +
                 " ('" + book.getTitle() + "', '" + book.getAuthor() + "', " + book.isAvailable() + ")";

         try(Connection con = DatabaseConnection.getConnection();
             Statement stat = con.createStatement())
         {
             stat.executeUpdate(query);
             System.out.println( book.getTitle() + " has been added to the database successfully!");
         }catch (SQLException e){
             System.out.println(" Database error happened inside addBook()");
             e.printStackTrace();
         }

     }


     public void updateBookStatus(int bookId, boolean newStatus){
         System.out.println("Connecting to database to update book status...\n");

         String query  = "UPDATE books SET is_available =" + newStatus + " WHERE id = "+ bookId;

         try(Connection con = DatabaseConnection.getConnection();
             Statement stat = con.createStatement())
         {
             stat.executeUpdate(query);
             System.out.println("Book ID " + bookId + " status has been updated successfully!");
         }catch (SQLException e){
             System.out.println(" Database error happened inside is_Available()");
             e.printStackTrace();
         }
     }
    public void selectBook(String bookTitle) {
        System.out.println("Connecting to database to select a new book...\n");
          // Using LIKE with % checks if the title contains this word, not an exact match.
        String query = "SELECT id, title, author, is_available FROM books WHERE title LIKE '%" + bookTitle + "%'";

        try (Connection con = DatabaseConnection.getConnection();
             Statement stat = con.createStatement();
             ResultSet resu = stat.executeQuery(query))
        {
            while (resu.next()) {
                int id = resu.getInt("id");
                String title = resu.getString("title");
                String author = resu.getString("author");
                boolean isAvailable = resu.getBoolean("is_available");
                System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Available: " + isAvailable);
            }
      }
        catch (SQLException e) {
            System.out.println(" Database error happened inside selectBook()");
            e.printStackTrace();
        }
    }
}
