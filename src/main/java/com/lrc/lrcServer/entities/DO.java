package com.lrc.lrcServer.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDO;
	private int qte;
	@ManyToOne
	private Ouvrage ouv;
	
	@ManyToOne
	private Decomptes DO;
	
	public int getIdDO() {
		return idDO;
	}
	public void setIdDO(int idDO) {
		this.idDO = idDO;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public Ouvrage getOuv() {
		return ouv;
	}
	public void setOuv(Ouvrage ouv) {
		this.ouv = ouv;
	}
	@JsonIgnore
	public Decomptes getDO() {
		return DO;
	}
	public void setDO(Decomptes dO) {
		DO = dO;
	}
	

}
