package org.wirvsvirushackathon.einkaufendigitalbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Entity
public class Order implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;

	private Person einkaeufer;
	private User komissionaer;
	private User lieferant;
	private String summeKosten;
	private Boolean kaufen;
	private Boolean liefern;
	private Boolean bezahlt;
	private List<Product> produkte;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Person getEinkaeufer() {
		return einkaeufer;
	}

	public void setEinkaeufer(Person einkaeufer) {
		this.einkaeufer = einkaeufer;
	}

	public User getKomissionaer() {
		return komissionaer;
	}

	public void setKomissionaer(User komissionaer) {
		this.komissionaer = komissionaer;
	}

	public User getLieferant() {
		return lieferant;
	}

	public void setLieferant(User lieferant) {
		this.lieferant = lieferant;
	}

	public String getSummeKosten() {
		return summeKosten;
	}

	public void setSummeKosten(String summeKosten) {
		this.summeKosten = summeKosten;
	}

	public Boolean getKaufen() {
		return kaufen;
	}

	public void setKaufen(Boolean kaufen) {
		this.kaufen = kaufen;
	}

	public Boolean getLiefern() {
		return liefern;
	}

	public void setLiefern(Boolean liefern) {
		this.liefern = liefern;
	}

	public Boolean getBezahlt() {
		return bezahlt;
	}

	public void setBezahlt(Boolean bezahlt) {
		this.bezahlt = bezahlt;
	}

	public List<Product> getProdukte() {
		return produkte;
	}

	public void setProdukte(List<Product> produkte) {
		this.produkte = produkte;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", einkaeufer=" + einkaeufer + ", komissionaer=" + komissionaer + ", lieferant="
				+ lieferant + ", summeKosten=" + summeKosten + ", kaufen=" + kaufen + ", liefern=" + liefern
				+ ", bezahlt=" + bezahlt + ", produkte=" + produkte + "]";
	}

}
