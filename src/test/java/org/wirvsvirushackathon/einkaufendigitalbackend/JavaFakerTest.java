package org.wirvsvirushackathon.einkaufendigitalbackend;

import com.github.javafaker.Faker;
import org.junit.Test;

import java.util.Locale;
import java.util.Random;

public class JavaFakerTest {


    @Test
    public void test() {



        Faker faker = new Faker(new Locale("de"));

        for (int i = 0; i < 10; i++) {
            System.out.println("Frucht: " + faker.food().fruit());
            System.out.println("Gemüse: " + faker.food().vegetable());
            System.out.println("Sushi: " + faker.food().sushi());
            System.out.println("Gewürze: " + faker.food().spice());
        }
    }
}
