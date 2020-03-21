package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table(name = Order.TABLE_NAME)
public class Order implements Serializable {
	public static final String TABLE_NAME = "order";

	@Id
	@GeneratedValue
	//@Column
	private Integer id;

/*
	private Person einkaeufer;

	private User komissionaer;

	private User lieferant;
*/

	@Column
	private String summeKosten;

	/*
	@OneToMany(targetEntity = Product.class, mappedBy = "id", fetch = FetchType.LAZY)
	private List<Product> produkte;

	private OrderStatus status;
	*/

	@Column
	private Long created;
	@Column
	private Long updated;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*
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
	*/
	public String getSummeKosten() {
		return summeKosten;
	}

	public void setSummeKosten(String summeKosten) {
		this.summeKosten = summeKosten;
	}

	/*
	public List<Product> getProdukte() {
		return produkte;
	}

	public void setProdukte(List<Product> produkte) {
		this.produkte = produkte;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	*/

	public Long getCreated() {
		return created;
	}

	public void setCreated(Long created) {
		this.created = created;
	}

	public Long getUpdated() {
		return updated;
	}

	public void setUpdated(Long updated) {
		this.updated = updated;
	}

	/*
	@Override
	public String toString() {
		return "Order [id=" + id + ", einkaeufer=" + einkaeufer + ", komissionaer=" + komissionaer + ", lieferant="
				+ lieferant + ", summeKosten=" + summeKosten + ", produkte=" + produkte + ", status=" + status
				+ ", created=" + created + ", updated=" + updated + "]";
	}
	*/

}
