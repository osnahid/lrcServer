package com.lrc.lrcServer.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Entretien implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idE;
	private String designation;
	private Date date;
	private double pu;
	
	@ManyToOne
	private EnginInt enginE;
	
	@ManyToOne
	@JsonIgnoreProperties("entretientsC")
	private Chantier CHE;
	
	
	public int getIdE() {
		return idE;
	}
	public void setIdE(int idE) {
		this.idE = idE;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPu() {
		return pu;
	}
	public void setPu(double pu) {
		this.pu = pu;
	}
	public EnginInt getEnginE() {
		return enginE;
	}
	public void setEnginE(EnginInt enginE) {
		this.enginE = enginE;
	}
	@JsonIgnore
	public Chantier getCHE() {
		return CHE;
	}
	public void setCHE(Chantier cHE) {
		CHE = cHE;
	}

}
