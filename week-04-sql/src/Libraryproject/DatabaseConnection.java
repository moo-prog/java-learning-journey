package Libraryproject;

import java.io.FileInputStream; // To open files on the hard drive
import java.io.IOException;     // Error type for file issues
import java.sql.Connection;     // Communication line with the database
import java.sql.DriverManager;  // Manages database drivers and connections
import java.sql.SQLException;   // Error type for database/SQL issues
import java.util.Properties;    // Handles key-value configuration files

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        /* [throws] -> The method is warning us: "Hey, I'm trying to connect to a database.
         If the server is down or password is wrong, I'm going to throw an error, so be ready to handle it!"
         You have to write try and catch in the other class (like Libraryproject.BookRepository) whenever you call this method! */
        Properties props = new Properties();
        String file = "config.properties";
        try (FileInputStream fis = new FileInputStream(file)) {
            props.load(fis);
        } catch (IOException e) {
            System.out.println("error: could't load " + file);
            e.printStackTrace();//detailed report for the programmer (you) to solve the problem (why , where , what)
            return null; // Stop and return nothing if the file is missing

        }

        // connection details
        String url = "jdbc:mysql://localhost:3307/library_db";
        String user = "root";
        String password = props.getProperty("db.password");
        // [DriverManager] is the guy responsible for connecting Java with MySQL.
        // [return] means: "Okay, the connection is alive and working now, take it and use it!"
        return DriverManager.getConnection(url, user, password);


    }
}


