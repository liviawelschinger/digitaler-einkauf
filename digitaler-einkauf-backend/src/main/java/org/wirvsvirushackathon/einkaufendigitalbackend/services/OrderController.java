package org.wirvsvirushackathon.einkaufendigitalbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wirvsvirushackathon.einkaufendigitalbackend.entities.Order;
import org.wirvsvirushackathon.einkaufendigitalbackend.repositories.OrderRepository;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/order")
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    @PostMapping("/order/new")
    public Order createNew(@RequestBody Order newOrder) {
        Order persistedOrder = this.orderRepository.save(newOrder);
        return persistedOrder;
    }

}
