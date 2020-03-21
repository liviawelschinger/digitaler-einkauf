package org.wirvsvirushackathon.einkaufendigitalbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String bestellung;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBestellung() {
        return bestellung;
    }

    public void setBestellung(String bestellung) {
        this.bestellung = bestellung;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", bestellung='" + bestellung + '\'' +
                '}';
    }
}

