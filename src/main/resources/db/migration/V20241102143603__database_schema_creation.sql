CREATE TABLE gender
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE book
(
    id               INT AUTO_INCREMENT PRIMARY KEY,
    title            VARCHAR(255) NOT NULL,
    gender_id        INT,
    publication_date DATE,
    price            DECIMAL(10, 2),
    FOREIGN KEY (gender_id) REFERENCES gender (id) ON DELETE SET NULL
);

CREATE TABLE author
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(255) NOT NULL,
    biography  TEXT,
    birth_date DATE
);

CREATE TABLE book_author
(
    book_id   INT,
    author_id INT,
    PRIMARY KEY (book_id, author_id),
    FOREIGN KEY (book_id) REFERENCES book (id) ON DELETE CASCADE,
    FOREIGN KEY (author_id) REFERENCES author (id) ON DELETE CASCADE
);

CREATE TABLE user
(
    id                INT AUTO_INCREMENT PRIMARY KEY,
    name              VARCHAR(255)        NOT NULL,
    email             VARCHAR(255) UNIQUE NOT NULL,
    registration_date TIMESTAMP DEFAULT (CURRENT_TIMESTAMP)
);

CREATE TABLE review
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    comment     TEXT,
    rating      INT,
    review_date TIMESTAMP DEFAULT (CURRENT_TIMESTAMP),
    book_id     INT,
    user_id     INT,
    FOREIGN KEY (book_id) REFERENCES book (id) ON DELETE CASCADE,
    FOREIGN KEY (user_id) REFERENCES user (id) ON DELETE CASCADE
);
