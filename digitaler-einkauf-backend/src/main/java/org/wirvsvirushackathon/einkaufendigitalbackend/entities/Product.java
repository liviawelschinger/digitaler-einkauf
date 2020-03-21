package org.wirvsvirushackathon.einkaufendigitalbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
public class Product implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;
	private String alternativ;
	private Integer anzahl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
