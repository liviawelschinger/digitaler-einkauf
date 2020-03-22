package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakeDataConfiguration {

    @Bean
    public Integer fakeProductAmount() {
        return 500;
    }

}
