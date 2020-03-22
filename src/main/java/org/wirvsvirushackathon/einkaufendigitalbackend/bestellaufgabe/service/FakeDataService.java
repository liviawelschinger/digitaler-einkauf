package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.service;

import com.github.javafaker.Cat;
import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Category;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Product;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.CategoryRepository;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.ProductRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Service
public class FakeDataService {

	private static final Logger LOG = LogManager.getLogger(FakeDataService.class);

	@Autowired
	private Integer fakeDataAmount;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@PostConstruct
	public void init() {
		LOG.info("Fake-Daten werden erzeugt");

		LOG.info("Kategorien anlegen");
		Iterable<Category> categoryList = getFakeCategories();
		categoryRepository.saveAll(categoryList);

		LOG.info("Produkte anlegen");
		List<Product> productList = getRandomProducts(fakeDataAmount);
		LOG.info("Fake-Daten werden in der DB gespeichert");
		productRepository.saveAll(productList);
		LOG.info("Fake-Daten sind in der DB gespeichert");
	}

	private List<Category> getFakeCategories() {

		String [] categoryNames = {"Gericht", "Frucht", "Inhaltsstoffe", "Gewürz", "Sushi", "Gemüse"};

		ArrayList<Category> categories = new ArrayList<>();
		for (String s: categoryNames) {
			Category c = new Category();
			c.setName(s);
			categories.add(c);
		}
		return categories;
	}


	private List<Product> getRandomProducts(int count) {
		Faker faker = new Faker(new Locale("de"));
		List<Product> products = new ArrayList<Product>();
		Random r = new Random();
		for (int i = 0; i < count; i++) {
			Product p = new Product();
			switch (r.nextInt(6)) {
			case 0:
				p.setName(faker.food().dish());
				p.setCategory(categoryRepository.findCategoryByName("Gericht"));
				break;
			case 1:
				p.setName(faker.food().fruit());
				p.setCategory(categoryRepository.findCategoryByName("Frucht"));
				break;
			case 2:
				p.setName(faker.food().ingredient());
				p.setCategory(categoryRepository.findCategoryByName("Inhaltsstoffe"));
				break;
			case 3:
				p.setName(faker.food().spice());
				p.setCategory(categoryRepository.findCategoryByName("Gewürz"));
				break;
			case 4:
				p.setName(faker.food().sushi());
				p.setCategory(categoryRepository.findCategoryByName("Sushi"));
				break;
			case 5:
				p.setName(faker.food().vegetable());
				p.setCategory(categoryRepository.findCategoryByName("Gemüse"));
				break;
			}
			LOG.debug(p + " wird hinzugefügt");
			products.add(p);
		}
		return products;
	}

}