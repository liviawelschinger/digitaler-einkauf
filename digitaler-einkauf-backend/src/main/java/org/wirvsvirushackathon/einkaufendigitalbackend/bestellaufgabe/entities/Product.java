package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities;

import javax.persistence.*;

import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = Product.TABLE_NAME)
public class Product implements Serializable {

    public static final String TABLE_NAME = "product";

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private String alternativ;

    @Column
    private Integer anzahl;

    @ManyToOne(targetEntity = Category.class)
    private Category category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlternativ() {
        return alternativ;
    }

    public void setAlternativ(String alternativ) {
        this.alternativ = alternativ;
    }

    public Integer getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(Integer anzahl) {
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", alternativ=" + alternativ + ", anzahl=" + anzahl + "]";
    }

}
