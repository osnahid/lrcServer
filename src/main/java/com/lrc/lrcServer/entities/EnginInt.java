package com.lrc.lrcServer.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@DiscriminatorValue("interne")
public class EnginInt extends Engin{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double prixLocation;
	private double prixAchat;
	private int consommationH;
	
	@OneToMany(mappedBy="enginR")
	@JsonIgnoreProperties("enginR")
	private List<Reparation> reparations;
	
	@OneToMany(mappedBy="enginE")
	@JsonIgnoreProperties("enginE")
	private List<Entretien> entretiens;
	
	public List<Reparation> getReparations() {
		return reparations;
	}
	public void setReparations(List<Reparation> reparations) {
		this.reparations = reparations;
	}
	public List<Entretien> getEntretiens() {
		return entretiens;
	}
	public void setEntretiens(List<Entretien> entretiens) {
		this.entretiens = entretiens;
	}
	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}
	public int getConsommationH() {
		return consommationH;
	}
	public void setConsommationH(int consommationH) {
		this.consommationH = consommationH;
	}
	public double getPrixLocation() {
		return prixLocation;
	}
	public void setPrixLocation(double prixLocation) {
		this.prixLocation = prixLocation;
	}
	
	

}
