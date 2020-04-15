package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.Chantier;

public interface ChantierService {
	public Chantier addChantier(Chantier ch);
	public Chantier editChantier(Chantier ch);
	public List<Chantier> getChantiers();
	public Chantier getChantier(String id);
	public void deleteChantier(String id);
}
