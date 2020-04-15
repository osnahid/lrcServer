package com.lrc.lrcServer.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class BesoinTransverses implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idBT;
	private String designation;
	private String tel;
	private String adresse;
	private String type;
	private double montant;
	@ManyToOne
	private Chantier CHBT;
	public int getIdBT() {
		return idBT;
	}
	public void setIdBT(int idBT) {
		this.idBT = idBT;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@JsonIgnore
	public Chantier getCHBT() {
		return CHBT;
	}
	public void setCHBT(Chantier cHBT) {
		CHBT = cHBT;
	}
	
	
}
