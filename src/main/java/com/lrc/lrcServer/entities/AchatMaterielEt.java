package com.lrc.lrcServer.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("et")
public class AchatMaterielEt extends AchatMateriel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private EtudePrix EPAM;
	
	@JsonIgnore
	public EtudePrix getEPAM() {
		return EPAM;
	}

	public void setEPAM(EtudePrix ePAM) {
		EPAM = ePAM;
	}

	
}
