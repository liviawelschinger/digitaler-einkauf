package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = Person.TABLE_NAME)
public class Person implements Serializable {
	public static final String TABLE_NAME = "person";

	@Id
	@GeneratedValue
	private Integer id;

	//private GeoData geodata;

	@Column
	private String vorname;
	@Column
	private String nachname;
	@Column
	private String telefon;
	@Column
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*
	public GeoData getGeodata() {
		return geodata;
	}

	public void setGeodata(GeoData geodata) {
		this.geodata = geodata;
	}
	*/

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	@Override
	public String toString() {
		return "Person [id=" + id + ", geodata=" + geodata + ", vorname=" + vorname + ", nachname=" + nachname
				+ ", telefon=" + telefon + ", email=" + email + "]";
	}
	*/
}
