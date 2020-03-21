package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Product;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.ProductRepository;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Product get(@PathVariable Integer id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()) {
            return null;
        }
        return product.get();
    }

    @GetMapping("/product/getByCategory/")
    public Iterable<Product> getProductByCategory(@RequestParam Integer categoryId) {
        return null;
    }

    // Test-Zweck
    @PostMapping("/product/createTestData")
    public Iterable<Product> createTestData() {
        Product nudeln = new Product();
        nudeln.setName("Nudeln");
        productRepository.save(nudeln);
        return productRepository.findAll();
    }


}
