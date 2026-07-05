CREATE DATABASE library_db;
USE library_db;
CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    is_available BOOLEAN DEFAULT TRUE
);
INSERT INTO books (title, author, is_available) VALUES 
('Muqaddimah', 'Ibn Khaldun', TRUE),
('Children of Gebelawi', 'Naguib Mahfouz', FALSE),
('Les Miserables', 'Victor Hugo', TRUE),
('The Da Vinci Code', 'Dan Brown', TRUE),
('The Anomalies of the Subconscious', 'Ali Al-Wardi', FALSE);

SELECT * FROM books;
SELECT * FROM books WHERE author = 'Victor Hugo' ;
SELECT * FROM books ORDER BY title ;

