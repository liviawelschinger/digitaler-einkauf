package org.wirvsvirushackathon.einkaufendigitalbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wirvsvirushackathon.einkaufendigitalbackend.entities.Order;
import org.wirvsvirushackathon.einkaufendigitalbackend.repositories.OrderRepository;

import java.awt.*;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(value = "/order")
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    @PostMapping(value = "/order/new", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Order createNew(@RequestBody Order order) {
        return this.orderRepository.save(order);
    }

}
