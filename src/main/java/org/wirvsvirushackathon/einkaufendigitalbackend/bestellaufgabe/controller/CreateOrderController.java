package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Category;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.CategoryRepository;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.OrderRepository;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.ProductRepository;

import java.util.HashMap;

@Controller
public class CreateOrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/orders/new")
    public String newOrder(Model model) {
        Iterable<Category> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);


        HashMap<String, String> categoryIcon = new HashMap<String, String>();
        String iconName;
        for (Category c: categories) {
            categoryIcon.put(c.getName(),getIconFor(c.getName()));
        }
        model.addAttribute("categoryIcons", categoryIcon);

        return "new-order";
    }


    // TODO: Bessere Lösung für Icons finden
    private String getIconFor(String categoryname) {
        switch (categoryname) {
            /*case "Frucht":
                return "fa fa-apple-alt";
            case "Gericht":
                return "fa fa-pizza-slice";*/
            default:
                return "fa fa-product-hunt";
        }
    }


}
