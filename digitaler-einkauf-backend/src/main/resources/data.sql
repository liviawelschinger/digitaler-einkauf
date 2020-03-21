CREATE TABLE kategorie (
                           id   INTEGER      NOT NULL AUTO_INCREMENT,
                           name VARCHAR(128) NOT NULL,
                           PRIMARY KEY (id)
);

INSERT INTO kategorie (name) VALUES
 ('Lebensmittel'),
 ('Hygieneprodukt'),
 ('Tiefkühlprodukt');
