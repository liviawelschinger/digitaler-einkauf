package org.wirvsvirushackathon.einkaufendigitalbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wirvsvirushackathon.einkaufendigitalbackend.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
