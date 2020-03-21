package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Category;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.CategoryRepository;

@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping("/category")
    public Iterable<Category> getAll() {
        return categoryRepository.findAll();
    }


    // Zu Test-Zwecken
    @PostMapping("/category/createTestData")
    public Iterable<Category> erstellen() {

        Category lebensmittel = new Category();
        lebensmittel.setName("Lebensmittel");
        categoryRepository.save(lebensmittel);

        Category hygieneProdukte = new Category();
        hygieneProdukte.setName("Hygieneprodukte");
        categoryRepository.save(hygieneProdukte);

        return categoryRepository.findAll();
    }


}
