package org.wirvsvirushackathon.einkaufendigitalbackend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;

	private String username;
	private String passwort;
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
