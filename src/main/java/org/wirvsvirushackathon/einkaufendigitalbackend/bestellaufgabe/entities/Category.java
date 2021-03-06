package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = Category.TABLE_NAME)
public class Category implements Serializable {

    public static final String TABLE_NAME = "Category";

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
