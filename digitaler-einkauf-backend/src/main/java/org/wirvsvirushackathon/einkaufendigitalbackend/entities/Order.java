package org.wirvsvirushackathon.einkaufendigitalbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue
    private String id;

}

