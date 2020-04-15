package com.lrc.lrcServer.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class LocationCh implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLCH;
	private double prixGaz;
	private int nbrHeure;
	
	@ManyToOne
	private Engin engin;
	
	@ManyToOne
	private Chantier CHL;
	
	@ManyToOne
	private Personnel chauffeur;

	public int getIdLCH() {
		return idLCH;
	}

	public void setIdLCH(int idLCH) {
		this.idLCH = idLCH;
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
	public Chantier getCHL() {
		return CHL;
	}

	public void setCHL(Chantier cHL) {
		CHL = cHL;
	}

	public Personnel getChauffeur() {
		return chauffeur;
	}

	public void setChauffeur(Personnel chauffeur) {
		this.chauffeur = chauffeur;
	}
	
	

}
