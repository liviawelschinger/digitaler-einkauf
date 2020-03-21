package org.wirvsvirushackathon.einkaufendigitalbackend;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Category;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Product;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.CategoryRepository;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories.ProductRepository;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableSwagger2
public class DigitalerEinkaufBackendApplication {

	private static final Logger LOG = LogManager.getLogger(DigitalerEinkaufBackendApplication.class);

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	/**
	 * Testdaten anlegen
	 */
	@PostConstruct
	public void init() {
		LOG.info("Init-Methode gestartet");


		Category lebensmittel = new Category();
		lebensmittel.setName("Lebensmittel");
		categoryRepository.save(lebensmittel);

		Category hygiene = new Category();
		hygiene.setName("Hygieneprodukte");
		categoryRepository.save(hygiene);

		Product nudeln = new Product();
		nudeln.setName("Nudeln");
		nudeln.setCategory(lebensmittel);
		productRepository.save(nudeln);

		Product reis = new Product();
		reis.setName("Reis");
		reis.setCategory(lebensmittel);
		productRepository.save(reis);


		Product shampoo = new Product();
		shampoo.setName("Shampoo");
		shampoo.setCategory(hygiene);
		productRepository.save(shampoo);


		LOG.info("Init-Methode ausgeführt");
	}



	public static void main(String[] args) {
		SpringApplication.run(DigitalerEinkaufBackendApplication.class, args);
	}

}
