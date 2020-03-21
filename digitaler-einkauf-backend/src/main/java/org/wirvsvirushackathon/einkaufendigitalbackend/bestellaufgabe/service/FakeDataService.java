package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.service;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Category;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Product;
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

	@PostConstruct
	public void init() {
		LOG.info("Fake-Daten werden erzeugt");
		List<Product> productList = getRandomProducts(fakeDataAmount);
		LOG.info("Fake-Daten werden in der DB gespeichert");
		productRepository.saveAll(productList);
		LOG.info("Fake-Daten sind in der DB gespeichert");
	}

	private List<Product> getRandomProducts(int count) {
		Faker faker = new Faker(new Locale("de"));
		List<Product> products = new ArrayList<Product>();
		Random r = new Random();
		for (int i = 0; i < count; i++) {
			Category c = new Category();
			Product p = new Product();
			switch (r.nextInt(6)) {
			case 0:
				c.setName("Gericht");
				p.setName(faker.food().dish());
				p.setCategory(c);
				break;
			case 1:
				c.setName("Frucht");
				p.setName(faker.food().fruit());
				p.setCategory(c);
				break;
			case 2:
				c.setName("Inhaltsstoffe");
				p.setName(faker.food().ingredient());
				p.setCategory(c);
				break;
			case 3:
				c.setName("Gewürz");
				p.setName(faker.food().spice());
				p.setCategory(c);
				break;
			case 4:
				c.setName("Sushi");
				p.setName(faker.food().sushi());
				p.setCategory(c);
				break;
			case 5:
				c.setName("Gemüse");
				p.setName(faker.food().vegetable());
				p.setCategory(c);
				break;
			}
			LOG.debug(p + " wird hinzugefügt");
			products.add(p);
		}
		return products;
	}

}