package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
