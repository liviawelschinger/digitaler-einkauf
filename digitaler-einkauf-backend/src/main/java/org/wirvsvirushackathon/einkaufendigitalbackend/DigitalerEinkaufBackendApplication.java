package org.wirvsvirushackathon.einkaufendigitalbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DigitalerEinkaufBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalerEinkaufBackendApplication.class, args);
	}

}
