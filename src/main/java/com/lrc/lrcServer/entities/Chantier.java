package com.lrc.lrcServer.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Chantier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String numCh;
	
	private Date date;
	private String etat;
	@OneToOne
	private AppelOffre aoc;
	
	@OneToMany(mappedBy="CHBT")
	@JsonIgnoreProperties("CHBT")
	private List<BesoinTransverses> bt;
	
	@OneToMany(mappedBy="CHL")
	@JsonIgnoreProperties("CHL")
	private List<LocationCh> locations;
	
	@ManyToMany
	private List<Personnel> personnels;
	
	@OneToMany(mappedBy="CHD")
	@JsonIgnoreProperties("CHD")
	private List<Decomptes> decomptes;
	
	@OneToMany(mappedBy="CHR")
	@JsonIgnoreProperties("CHR")
	private List<Reparation> reparationsC;
	
	@OneToMany(mappedBy="CHE")
	@JsonIgnoreProperties("CHE")
	private List<Entretien> entretiensC;
	
	@OneToMany(mappedBy="CHAC")
	@JsonIgnoreProperties("CHAC")
	private List<AchatMaterielCh> achats;

	public String getNumCh() {
		return numCh;
	}
	
	

	public String getEtat() {
		return etat;
	}



	public void setEtat(String etat) {
		this.etat = etat;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public void setNumCh(String numCh) {
		this.numCh = numCh;
	}

	public AppelOffre getAoc() {
		return aoc;
	}

	public void setAoc(AppelOffre aoc) {
		this.aoc = aoc;
	}

	public List<BesoinTransverses> getBt() {
		return bt;
	}

	public void setBt(List<BesoinTransverses> bt) {
		this.bt = bt;
	}

	public List<Personnel> getPersonnels() {
		return personnels;
	}

	public void setPersonnels(List<Personnel> personnels) {
		this.personnels = personnels;
	}

	public List<Decomptes> getDecomptes() {
		return decomptes;
	}

	public void setDecomptes(List<Decomptes> decomptes) {
		this.decomptes = decomptes;
	}

	public List<Reparation> getReparationsC() {
		return reparationsC;
	}

	public void setReparationsC(List<Reparation> reparationsC) {
		this.reparationsC = reparationsC;
	}

	public List<Entretien> getEntretiensC() {
		return entretiensC;
	}

	public void setEntretiensC(List<Entretien> entretiensC) {
		this.entretiensC = entretiensC;
	}

	public List<AchatMaterielCh> getAchats() {
		return achats;
	}

	public void setAchats(List<AchatMaterielCh> achats) {
		this.achats = achats;
	}

	public List<LocationCh> getLocations() {
		return locations;
	}

	public void setLocations(List<LocationCh> locations) {
		this.locations = locations;
	}
	
	
}
