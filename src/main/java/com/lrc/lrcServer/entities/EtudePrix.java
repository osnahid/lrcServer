package com.lrc.lrcServer.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EtudePrix implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idET;
	private double rendement;
	private double foisonnement;
	private double distance;
	private double salaireChefEquipe;
	private double salaireOuvrier;
	private int nbrOuvrier;
	
	@ManyToOne
	private EnginCamion enginCamion;
	
	//appelOffre
	@ManyToOne
	private AppelOffre aoEP;
	@ManyToOne
	private Ouvrage ouvrageE;
	@OneToMany(mappedBy="EPL",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<LocationEP> locations;
	@OneToMany(mappedBy="EPAM",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AchatMaterielEt> materiels;
	public int getIdET() {
		return idET;
	}
	public void setIdET(int idET) {
		this.idET = idET;
	}
	public double getRendement() {
		return rendement;
	}
	public void setRendement(double rendement) {
		this.rendement = rendement;
	}
	public double getFoisonnement() {
		return foisonnement;
	}
	public void setFoisonnement(double foisonnement) {
		this.foisonnement = foisonnement;
	}
	public Ouvrage getOuvrageE() {
		return ouvrageE;
	}
	public void setOuvrageE(Ouvrage ouvrageE) {
		this.ouvrageE = ouvrageE;
	}
	public List<LocationEP> getLocations() {
		return locations;
	}
	public void setLocations(List<LocationEP> locations) {
		this.locations = locations;
	}
	public List<AchatMaterielEt> getMateriels() {
		return materiels;
	}
	public void setMateriels(List<AchatMaterielEt> materiels) {
		this.materiels = materiels;
	}
	@JsonIgnore
	public AppelOffre getAoEP() {
		return aoEP;
	}
	@JsonIgnore
	public void setAoEP(AppelOffre aoEP) {
		this.aoEP = aoEP;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getSalaireChefEquipe() {
		return salaireChefEquipe;
	}
	public void setSalaireChefEquipe(double salaireChefEquipe) {
		this.salaireChefEquipe = salaireChefEquipe;
	}
	public double getSalaireOuvrier() {
		return salaireOuvrier;
	}
	public void setSalaireOuvrier(double salaireOuvrier) {
		this.salaireOuvrier = salaireOuvrier;
	}
	public int getNbrOuvrier() {
		return nbrOuvrier;
	}
	public void setNbrOuvrier(int nbrOuvrier) {
		this.nbrOuvrier = nbrOuvrier;
	}
	public EnginCamion getEnginCamion() {
		return enginCamion;
	}
	public void setEnginCamion(EnginCamion enginCamion) {
		this.enginCamion = enginCamion;
	}

	
	

}
