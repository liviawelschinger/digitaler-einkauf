package org.wirvsvirushackathon.einkaufendigitalbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

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

	private String bestellung;

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

	public String getBestellung() {
		return bestellung;
	}

	public void setBestellung(String bestellung) {
		this.bestellung = bestellung;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", einkaeufer=" + einkaeufer + ", komissionaer=" + komissionaer + ", lieferant="
				+ lieferant + ", summeKosten=" + summeKosten + ", kaufen=" + kaufen + ", liefern=" + liefern
				+ ", bezahlt=" + bezahlt + ", bestellung=" + bestellung + "]";
	}

}
