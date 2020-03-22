package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {


    Category findCategoryByName(String name);

}
