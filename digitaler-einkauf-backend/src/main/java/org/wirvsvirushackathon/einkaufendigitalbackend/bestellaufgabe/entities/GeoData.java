package org.wirvsvirushackathon.einkaufendigitalbackend.bestellaufgabe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@SuppressWarnings("serial")
@Entity
@Table(name = GeoData.TABLE_NAME)
public class GeoData implements Serializable {
	public static final String TABLE_NAME = "geodata";

	@Id
	@GeneratedValue
	@Column
	private Integer id;

	@Column
	private String strasse;
	@Column
	private String nummer;
	@Column
	private Integer plz;
	@Column
	private String ort;
	@Column
	private String longitude;
	@Column
	private String latitude;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public Integer getPlz() {
		return plz;
	}

	public void setPlz(Integer plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "GeoData [id=" + id + ", strasse=" + strasse + ", nummer=" + nummer + ", plz=" + plz + ", ort=" + ort
				+ ", longitude=" + longitude + ", latitude=" + latitude + "]";
	}

}
