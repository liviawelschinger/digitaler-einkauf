package org.wirvsvirushackathon.einkaufendigitalbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wirvsvirushackathon.einkaufendigitalbackend.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
