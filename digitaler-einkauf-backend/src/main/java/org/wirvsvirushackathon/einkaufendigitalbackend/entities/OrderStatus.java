package org.wirvsvirushackathon.einkaufendigitalbackend.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = OrderStatus.TABLE_NAME)
public class OrderStatus implements Serializable {
	public static final String TABLE_NAME = "orderstatus";

	@Id
	@GeneratedValue
	@Column
	private Integer id;

	@Column
	private String name;

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

	@Override
	public String toString() {
		return "OrderStatus [id=" + id + ", name=" + name + "]";
	}

}