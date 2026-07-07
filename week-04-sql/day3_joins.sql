CREATE DATABASE library_db ;
USE library_db;
CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL UNIQUE,
    author VARCHAR(255) NOT NULL,
    is_available BOOLEAN DEFAULT TRUE
);
INSERT INTO books (title, author, is_available) VALUES 
('Muqaddimah', 'Ibn Khaldun', TRUE),
('Children of Gebelawi', 'Naguib Mahfouz', FALSE),
('Les Miserables', 'Victor Hugo', TRUE),
('The Da Vinci Code', 'Dan Brown', TRUE),
('The Anomalies of the Subconscious', 'Ali Al-Wardi', FALSE);

CREATE TABLE members(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE
    
);

INSERT INTO members (name, email) VALUES 
('Ahmed Ali', 'ahmed@email.com'),
('Sarah Omar', 'sarah@email.com'),
('John Doe', 'john@email.com');

CREATE TABLE borrowings (
	book_id INT UNIQUE,
    member_id INT,
    borrow_date DATE,
    FOREIGN KEY (book_id) REFERENCES books(id) ,
    FOREIGN KEY (member_id) REFERENCES members(id)
);
INSERT INTO borrowings (book_id, member_id, borrow_date) VALUES 
(3, 1, '2026-07-06'),
(2, 1, '2026-07-06'),
(1, 2, '2026-04-06');
UPDATE  members 
SET name = 'raon muller'
WHERE id = 1;

DELETE FROM books where id = 5;
SELECT * FROM books;
SELECT * FROM members;
SELECT * FROM borrowings;

SELECT members.name AS member_name , books.title AS book_name
FROM borrowings
JOIN members ON borrowings.member_id =  members.id
JOIN books ON borrowings.book_id = books.id;

SELECT members.name AS member_name , books.title AS book_name
FROM borrowings
JOIN members ON borrowings.member_id =  members.id
JOIN books ON borrowings.book_id = books.id
WHERE members.name = 'raon muller';


SELECT members.name AS member_name , books.title AS book_name
FROM borrowings
JOIN members ON borrowings.member_id =  members.id
JOIN books ON borrowings.book_id = books.id;

SELECT members.name,COUNT(book_id) As borrowed_books_count 
FROM borrowings
JOIN members ON borrowings.member_id = members.id
GROUP BY members.name;