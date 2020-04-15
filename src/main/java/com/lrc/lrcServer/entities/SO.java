package com.lrc.lrcServer.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSO;
	
	@ManyToOne
	private Soumission soum;
	
	@ManyToOne
	private Ouvrage ouv;
	
	private int Qte;
	
	private double prix;

	public int getQte() {
		return Qte;
	}

	public void setQte(int qte) {
		Qte = qte;
	}


	public int getIdSO() {
		return idSO;
	}

	public void setIdSO(int idSO) {
		this.idSO = idSO;
	}
	@JsonIgnore
	public Soumission getSoum() {
		return soum;
	}
	@JsonIgnore
	public void setSoum(Soumission soum) {
		this.soum = soum;
	}

	public Ouvrage getOuv() {
		return ouv;
	}

	public void setOuv(Ouvrage ouv) {
		this.ouv = ouv;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
