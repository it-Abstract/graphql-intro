INSERT INTO author (name, biography, birth_date)
VALUES ('J.K. Rowling', 'Autrice della serie Harry Potter', '1965-07-31'),
       ('George R.R. Martin', 'Autore della serie Il Trono di Spade', '1948-09-20'),
       ('J.R.R. Tolkien', 'Autore de Il Signore degli Anelli', '1892-01-03'),
       ('Isaac Asimov', 'Autore di fantascienza', '1920-01-02'),
       ('Agatha Christie', 'Autrice di romanzi gialli', '1890-09-15');

INSERT INTO gender (name)
VALUES ('Fantasy'),
       ('Fantascienza'),
       ('Giallo');


INSERT INTO book (title, gender_id, publication_date, price)
VALUES ('Harry Potter e la Pietra Filosofale', 1, '1997-06-26', 19.99),
       ('Harry Potter e la Camera dei Segreti', 1, '1998-07-02', 20.99),
       ('Il Trono di Spade', 1, '1996-08-06', 24.99),
       ('Il Signore degli Anelli', 1, '1954-07-29', 29.99),
       ('Title 1', 1, '1954-07-29', 19.99),
       ('Fondazione', 2, '1951-06-01', 18.99),
       ('Io, Robot', 2, '1950-12-02', 15.99),
       ('Title 2', 3, '1934-01-01', 12.99),
       ('Dieci piccoli indiani', 3, '1939-11-06', 13.99),
       ('La Valle della Paura', 3, '1915-02-27', 10.99);

INSERT INTO book_author (book_id, author_id)
VALUES (1, 1),
       (2, 1),
       (3, 2),
       (4, 3),
       (5, 3),
       (6, 4),
       (7, 4),
       (8, 5),
       (9, 5),
       (10, 5);

INSERT INTO user (name, email)
VALUES ('Alice Rossi', 'alice@example.com'),
       ('Marco Bianchi', 'marco@example.com'),
       ('Sara Verdi', 'sara@example.com');

INSERT INTO review (comment, rating, book_id, user_id)
VALUES ('Bellissimo libro, molto avvincente!', 5, 1, 1),
       ('Mi è piaciuto molto, storia complessa e ben scritta.', 4, 3, 2),
       ('Un classico intramontabile.', 5, 4, 3),
       ('Adoro i gialli di Agatha Christie!', 4, 8, 1),
       ('Coinvolgente e ben scritto.', 5, 9, 1),
       ('Fantascienza allo stato puro!', 5, 6, 2),
       ('Molto interessante, ma datato.', 3, 7, 3),
       ('Intrigante e misterioso.', 4, 10, 1),
       ('Ottimo inizio di saga.', 5, 2, 2),
       ('Tolkien è sempre una garanzia.', 5, 5, 3);
