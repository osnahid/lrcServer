package com.lrc.lrcServer.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Decomptes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idD;
	private Date date;
	
	@OneToMany(mappedBy="DO")
	@JsonIgnoreProperties("DO")
	private List<DO> dos;
	
	@ManyToOne
	private Chantier CHD;

	public int getIdD() {
		return idD;
	}

	public void setIdD(int idD) {
		this.idD = idD;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<DO> getDos() {
		return dos;
	}

	public void setDos(List<DO> dos) {
		this.dos = dos;
	}

	@JsonIgnore
	public Chantier getCHD() {
		return CHD;
	}

	public void setCHD(Chantier cHD) {
		CHD = cHD;
	}

	
	

}
