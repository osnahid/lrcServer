package com.lrc.lrcServer.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("chantier")
public class AchatMaterielCh extends AchatMateriel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Chantier CHAC;
	
	@JsonIgnore
	public Chantier getCHAC() {
		return CHAC;
	}

	public void setCHAC(Chantier cHAC) {
		CHAC = cHAC;
	}
	
	
}
