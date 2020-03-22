<<<<<<< HEAD:digitaler-einkauf-backend/src/main/java/org/wirvsvirushackathon/einkaufendigitalbackend/entities/User.java
package org.wirvsvirushackathon.einkaufendigitalbackend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = User.TABLE_NAME)
public class User implements Serializable {
	public static final String TABLE_NAME = "user";

	@Id
	@GeneratedValue
	@Column
	private Integer id;

	@Column
	private String username;
	@Column
	private String passwort;
	@Column
	private Person person;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", passwort=" + passwort + ", person=" + person + "]";
	}

}
=======
package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = User.TABLE_NAME)
public class User implements Serializable {
	public static final String TABLE_NAME = "user";

	@Id
	@GeneratedValue
	private Integer id;

	@Column
	private String username;
	@Column
	private String passwort;

	@ManyToOne(fetch = FetchType.EAGER)
	private Person person;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", passwort=" + passwort + ", person=" + person + "]";
	}

}
>>>>>>> develope:src/main/java/org/wirvsvirushackathon/einkaufendigitalbackend/bestellaufgabe/entities/User.java
