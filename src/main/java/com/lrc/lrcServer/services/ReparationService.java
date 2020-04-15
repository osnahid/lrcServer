package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.Reparation;

public interface ReparationService {
	
	public List<Reparation> addReparation(List<Reparation> r);
	public Reparation editReparation(Reparation r);
	public void deleteReparation(int id);

}
