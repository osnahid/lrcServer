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
public class Reparation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idR;
	private String designation;
	private Date date;
	private double pu;
	
	@ManyToOne
	private EnginInt enginR;
	
	@ManyToOne
	@JsonIgnoreProperties("reparationsC")
	private Chantier CHR;
	
	public int getIdR() {
		return idR;
	}
	public void setIdR(int idR) {
		this.idR = idR;
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
	public EnginInt getEnginR() {
		return enginR;
	}
	public void setEnginR(EnginInt engin) {
		this.enginR = engin;
	}
	@JsonIgnore
	public Chantier getCHR() {
		return CHR;
	}
	public void setCHR(Chantier cHR) {
		CHR = cHR;
	}
	
	
	

}
