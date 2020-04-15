package com.lrc.lrcServer.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnore;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Entity
public class AppelOffre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String numAO;
	private Date dateAO;
	private String objet;
	private String localisation;
	private double estimation;
    
	public double getEstimation() {
		return estimation;
	}
	public void setEstimation(double estimation) {
		this.estimation = estimation;
	}
	
	@OneToOne(mappedBy="ao",cascade = CascadeType.ALL, orphanRemoval = true)
	private Soumission soumission;
	
	@OneToMany(mappedBy="aoi",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<InstallationChantier> ic;
	
	@OneToMany(mappedBy="aoEP",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<EtudePrix> etudePrix;
	
	@OneToOne(mappedBy="aoc")
	@JsonIgnoreProperties("aoc")
	private Chantier ch;
	
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public List<EtudePrix> getEtudePrix() {
		return etudePrix;
	}
	public void setEtudePrix(List<EtudePrix> etudePrix) {
		this.etudePrix = etudePrix;
	}
	public String getNumAO() {
		return numAO;
	}
	public void setNumAO(String numAO) {
		this.numAO = numAO;
	}
	public Date getDateAO() {
		return dateAO;
	}
	public void setDateAO(Date dateAO) {
		this.dateAO = dateAO;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public Soumission getSoumission() {
		return soumission;
	}
	public void setSoumission(Soumission soumission) {
		this.soumission = soumission;
	}
	public List<InstallationChantier> getIc() {
		return ic;
	}
	public void setIc(List<InstallationChantier> ic) {
		this.ic = ic;
	}
	@JsonIgnore
	public Chantier getCh() {
		return ch;
	}
	public void setCh(Chantier ch) {
		this.ch = ch;
	}
	
	
}
