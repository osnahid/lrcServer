package com.lrc.lrcServer.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Soumission implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSoumission;
	private Date date;
	@OneToOne
	private AppelOffre ao;
	@OneToMany(mappedBy="soum",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SO> so;
	public int getIdSoumission() {
		return idSoumission;
	}
	public void setIdSoumission(int idSoumission) {
		this.idSoumission = idSoumission;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@JsonIgnore
	public AppelOffre getAo() {
		return ao;
	}
	public void setAo(AppelOffre ao) {
		this.ao = ao;
	}
	public List<SO> getSo() {
		return so;
	}
	public void setSo(List<SO> so) {
		this.so = so;
	}
	
	
}
