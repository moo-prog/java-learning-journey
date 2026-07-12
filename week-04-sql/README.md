# Week 04 - Moving to MySQL Database 

# library-app-v2 (Now with MySQL)

Finally got tired of losing all my books every time I restarted the app, so I ditched the old temporary `ArrayLists` this week and connected the whole backend to a permanent MySQL database.

Spent the last few days rewriting the backend using the Repository pattern and JDBC. Also learned how to write basic SQL queries, link tables (`books`, `members`, `borrowings`) using Foreign Keys, and use `JOINs` so I can actually display real names instead of random IDs. Pretty happy that everything saves permanently now!

### Database Setup

If you want to run this locally, open your MySQL terminal or Workbench and run this first:

    CREATE DATABASE library_db;
    USE library_db;

    CREATE TABLE books (
        id INT PRIMARY KEY,
        title VARCHAR(255) NOT NULL,
        author VARCHAR(255) NOT NULL,
        is_available BOOLEAN DEFAULT TRUE
    );

After that, just go to `DatabaseConnection.java` and change the login details to match your local setup:
- URL: `jdbc:mysql://localhost:3306/library_db`
- Username: `root`
- Password: `YOUR_PASSWORD`

Tech used: Java, MySQL, JDBC.
Month 1 done! Next stop: Spring Boot.