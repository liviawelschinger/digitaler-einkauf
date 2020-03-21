package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.service;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Category;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class FakeDataService {


    @PostConstruct
    public void init() {

        Faker faker = new Faker(new Locale("de"));

        Category fruit = new Category();
        fruit.setName("Frucht");

        List<Product> productList = new ArrayList<Product>();

        Product p = new Product();
        p.setName(faker.food().fruit());
        p.setCategory(fruit);


        for (int i = 0; i < 10; i++) {
            System.out.println("Frucht: " + faker.food().fruit());
            System.out.println("Gemüse: " + faker.food().vegetable());
            System.out.println("Sushi: " + faker.food().sushi());
            System.out.println("Gewürze: " + faker.food().spice());
        }


    }

}
