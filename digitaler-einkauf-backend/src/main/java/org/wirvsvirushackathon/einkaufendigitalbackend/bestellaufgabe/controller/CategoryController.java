package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Category;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.CategoryRepository;

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping("/categories")
    public Iterable<Category> getAll() {
        return categoryRepository.findAll();
    }


}
