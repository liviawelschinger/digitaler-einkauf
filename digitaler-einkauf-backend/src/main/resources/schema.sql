drop table if exists category;
drop table if exists product;

create table category(
    ID int not null AUTO_INCREMENT,
    NAME varchar(100) not null,
    PRIMARY KEY (ID)
);

create table product(
    ID int not null AUTO_INCREMENT,
    NAME varchar(100) not null,
    CATEGORY_ID int,
    PRIMARY KEY (ID)
);

INSERT INTO category (name) VALUES ('Lebensmittel');
INSERT INTO category (name) VALUES ('Hygieneprodukte');

