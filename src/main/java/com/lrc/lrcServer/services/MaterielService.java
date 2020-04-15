package com.lrc.lrcServer.services;

import java.util.List;

import com.lrc.lrcServer.entities.CategorieMateriel;
import com.lrc.lrcServer.entities.Materiel;

public interface MaterielService {
	public List<Materiel> getMateriel();
	public Materiel addMateriel(Materiel m);
	public Materiel editMateriel(Materiel m);
	public void deleteMateriel(int id);
	public List<CategorieMateriel> getCatMat();
	public CategorieMateriel addCatMat(CategorieMateriel cm);
}
