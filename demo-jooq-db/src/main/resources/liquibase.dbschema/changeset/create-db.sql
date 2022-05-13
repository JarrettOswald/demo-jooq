CREATE TABLE persons
(
    passport_serial varchar(64) NOT NULL UNIQUE,
    name            varchar(64) NOT NULL,
    surname         varchar(64) NOT NULL,
    employer        varchar(64),

    CHECK ( passport_serial LIKE '____ ______')
);

INSERT INTO persons
VALUES
    ('1234 123456', 'Ivan', 'Ivanov', 'OOO zaaz')
