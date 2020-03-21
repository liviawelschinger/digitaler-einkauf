package org.wirvsvirushackathon.einkaufendigitalbackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wirvsvirushackathon.einkaufendigitalbackend.entities.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
	@Query("SELECT status.name FROM status WHERE status.id = %:id%")
	String getStatusName(Integer id);
}
