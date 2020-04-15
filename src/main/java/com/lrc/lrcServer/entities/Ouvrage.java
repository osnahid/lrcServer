package com.lrc.lrcServer.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Ouvrage implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idOuvrage;
	private String designation;
	private String Unite;
	private double PrixU;
	private double PrixV;
	@ManyToOne
	private Categories categorie;
	public int getIdOuvrage() {
		return idOuvrage;
	}
	
	public void setIdOuvrage(int idOuvrage) {
		this.idOuvrage = idOuvrage;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getUnite() {
		return Unite;
	}
	public void setUnite(String unite) {
		Unite = unite;
	}
	public double getPrixU() {
		return PrixU;
	}
	public void setPrixU(double prixU) {
		PrixU = prixU;
	}
	public double getPrixV() {
		return PrixV;
	}
	public void setPrixV(double prixV) {
		PrixV = prixV;
	}
	@JsonIgnore
	public Categories getCategorie() {
		return categorie;
	}
	@JsonIgnore(false)
	public void setCategorie(Categories categorie) {
		this.categorie = categorie;
	}
	
}
