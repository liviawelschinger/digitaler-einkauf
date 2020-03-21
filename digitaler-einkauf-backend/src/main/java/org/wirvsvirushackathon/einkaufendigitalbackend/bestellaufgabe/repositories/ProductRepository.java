package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {

    // TODO: Abfrage bauen
    Iterable<Product> findByCategoryId(Integer categoryId);
}
