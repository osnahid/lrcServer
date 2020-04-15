package com.lrc.lrcServer.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class LocationEP implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLEP;
	private double prixGaz;
	private int nbrHeure;
	@ManyToOne
	private Engin engin;
	@ManyToOne
	private EtudePrix EPL;
	
	private double salaireChauffeur;

	public int getIdLEP() {
		return idLEP;
	}

	public void setIdLEP(int idLEP) {
		this.idLEP = idLEP;
	}

	public double getPrixGaz() {
		return prixGaz;
	}

	public void setPrixGaz(double prixGaz) {
		this.prixGaz = prixGaz;
	}

	public int getNbrHeure() {
		return nbrHeure;
	}

	public void setNbrHeure(int nbrHeure) {
		this.nbrHeure = nbrHeure;
	}

	public Engin getEngin() {
		return engin;
	}

	public void setEngin(Engin engin) {
		this.engin = engin;
	}
	@JsonIgnore
	public EtudePrix getEPL() {
		return EPL;
	}

	public void setEPL(EtudePrix ePL) {
		EPL = ePL;
	}
	public double getSalaireChauffeur() {
		return salaireChauffeur;
	}

	public void setSalaireChauffeur(double salaireChauffeur) {
		this.salaireChauffeur = salaireChauffeur;
	}
	
	

}
