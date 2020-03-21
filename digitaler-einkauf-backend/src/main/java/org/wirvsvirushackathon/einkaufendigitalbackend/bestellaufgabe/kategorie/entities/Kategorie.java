package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.kategorie.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Kategorie implements Serializable {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kategorie kategorie = (Kategorie) o;
        return Objects.equals(id, kategorie.id) &&
                Objects.equals(name, kategorie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Kategorie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
